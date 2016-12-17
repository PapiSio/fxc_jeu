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

					<c:forEach items="${LISTE_TESTS}" var="test">
						<div class="blog-left-grid-left">
							<h3>
								<a href="TestServlet?idTest=${test.idTest}">${test.titreTest}</a>
							</h3>
							<!-- <p>
								Jeu : <span>${test.jeu.getTitreJeu()}</span> 
								Auteur : <span> ${test.utilisateur.getLogin()} </span>
								Date : <span>${test.dateTest} | </span>
								Note du jeu : <span>${test.noteJeu} / 20</span> 
								<span> testttt </span> ezfz
							</p> -->

						</div>
												<div class="blog-left-grid-right">
							<a href="#" class="hvr-bounce-to-bottom non">${test.getNbCom()}
								</a>
						</div> 

						<div class="clearfix"></div>

						<div class="col-xs-12 col-sm-3">
							<a href="TestServlet?idTest=${test.idTest}"><img
								src="images/overwatch.jpg" alt=" "
								class="img-responsive img-rounded" /></a>
						</div>

						<%-- 						<p class="para">${test.descriptionTest}</p>
 --%>
						<p class="para">
							Jeu : <span>${test.jeu.getTitreJeu()}</span> <br> Auteur : <span>
								${test.utilisateur.getLogin()} </span><br> Date : <span>${test.dateTest}
							</span><br> Note du jeu : <span>${test.noteJeu} / 20</span><br>
							Moyenne du test : <span>${test.getMoyenne()} </span><br>
							Description : <span>${test.descriptionTest}</span>
						</p>
						<br>
						<br>

					</c:forEach>

				</div>
			</div>

			<p>
				<a href="TestServlet?action=addTest">Ajouter un test.</a>'
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