<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<!-- <a href="DeconnexionServlet">Se déconnecter</a> -->
		<!-- //header -->
		<!-- ce qui gÃ¨re les icons des rÃ©seaux sociaux -->
		<div class="header-bottom">
			<div class="header-bottom-top">
				<br>
			</div>
			<div class="clearfix"></div>
			<!-- banner -->
			<!-- 			<div class="banner">




			<!-- blog -->
			<div class="blog">
				<!-- Gros bloc de tests de jeux -->
				<div class="blog-left">

					<form>
						<select name="jeux">
							<c:forEach var="JEU" items="${ListeJeu}">
								<option value="${JEU.idJeu}">${JEU.titreJeu}</option>
							</c:forEach>

						</select><br> <label>Titre :</label><input type="text" name="titre"><br>
						<label>Contenu :</label>
						<textarea rows="8" cols="50"></textarea>
						<br> <label>Les plus :</label>
						<textarea rows="4" cols="50"></textarea>
						<br> <label>Les moins :</label>
						<textarea rows="4" cols="50"></textarea>
						<br> 
						<select name="note"><c:forEach begin="0" end="20" var="i">
								<option value="${i}">${i}</option>
								<br>
							</c:forEach></select>	
						
					</form>


				</div>
			</div>


		</div>
		<div class="clearfix"></div>
	</div>
</div>
<%@ include file="footer.jsp"%>
<!-- <p>
		<%//String message = "Connexion réussi. Bienvenue "+ session.getAttribute("LOGIN");
			//out.println(message);%>
	</p> -->
</body>
</html>