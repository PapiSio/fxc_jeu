<%@ include file="headerIndex.jsp"%>

<body>

<!-- banner-body -->
	<div class="banner-body logn">
		<div class="container">
			<!-- header -->
			<%@ include file="entete.jsp"%>
			<!-- search-scripts -->
			<script src="js/classie.js"></script>
			<script src="js/uisearch.js"></script>
			<script>
				new UISearch(document.getElementById('sb-search'));
			</script>
			<!-- //search-scripts -->
			<!-- //header -->
			<!-- login-page -->
	
		<div class="login">
				<div class="login-grids">
					<div class="col-md-6 log">
						<h3>S'identifier</h3>
						<p>Bienvenu, veuillez saisir vos informations de connexion
							pour continuer</p>
						<!-- <p>If you have previously Login with us, <a href="#">click here</a></p> -->
						<form action="LoginServlet" method="POST"
							name="formulaireConnexion">
							
							<!--  A GARDER -->
							<c:if test="${CONTROLE_CONNEXION eq'NOK'}">
								<div class="alert alert-danger" role="alert">
									<strong>Petit con</strong> N'essaie pas d'aller où tu peux pas.
								</div>
							</c:if>
							
							<h5>Pseudo :</h5>
							<input type="text" name="LOGIN" id="LOGIN" value="${LOGIN}">
							<h5>Mot de passe :</h5>
							<input type="password" name="PASSWORD" id="PASSWORD" value="${MDP}"> 
							<input type="submit" name="submit" id="sumbit"> 
							<br> 
							<label for="MEMOIRE">Se souvenir de moi</label> 
							<input type="checkbox" id="MEMOIRE" name="MEMOIRE"
								<c:if test="${MEMOIRE eq'OK'}">
									checked
								</c:if>
								 />
							<br />

						</form>
						<a href="#">Forgot Password ?</a>
					</div>
					<div class="col-md-6 login-right">
						<h3>S'enregistrer</h3>
						<p>By creating an account with our store, you will be able to
							move through the checkout process faster, store multiple shipping
							addresses, view and track your orders in your account and more.</p>
						<a href="inscription.jsp" class="hvr-bounce-to-bottom button">Créer
							un compte</a>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!-- //login-page -->
		</div>
	</div>

	<!--  footer -->
	<%@ include file="footer.jsp"%>
	<!-- footer -->
	<!-- for bootstrap working -->
	<script src="js/bootstrap.js">
		
	</script>
	<!-- //for bootstrap working -->

</body>
</html>