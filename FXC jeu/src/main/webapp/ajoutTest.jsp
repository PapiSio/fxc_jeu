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

				Partie qui gère le slider texte, une fois encore le script ici, bof.

				//End-slider-script
				<div id="top" class="callbacks_container wow fadeInUp"
					data-wow-delay="0.5s">
					Slider qui dÃ©file
					<ul class="rslides" id="slider3">
						<li>
							<div class="banner-inf">
								<h3>Test jeu 1</h3>
								<p>League of Legends</p>
								<a href="single.html">See More</a>
							</div>
						</li>
						<li>
							<div class="banner-inf">
								<h3>Test jeu 2</h3>
								<p>World of Warcraft</p>
								<a href="single.html">See More</a>
							</div>
						</li>
						<li>
							<div class="banner-inf">
								<h3>Test jeu 3</h3>
								<p>Minecraft</p>
								<a href="single.html">See More</a>
							</div>
						</li>
					</ul>
				</div>
			</div> -->


			<!-- blog -->
			<div class="blog">
				<!-- Gros bloc de tests de jeux -->
				<div class="blog-left">

					<form>
						<select name="jeux">
							<c:forEach var="item" items="${dept}">
								<option value="${item.key}">${item.value}</option>
							</c:forEach>
						</select>
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