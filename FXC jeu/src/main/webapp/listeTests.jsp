<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<a href="DeconnexionServlet">Se déconnecter</a>
		<!-- //header -->
		<!-- ce qui gÃ¨re les icons des rÃ©seaux sociaux -->
		<div class="header-bottom">
			<div class="header-bottom-top">
				<br>
			</div>
			<div class="clearfix"></div>
			<!-- banner -->
			<div class="banner">
				<!-- Partie qui gère le slider texte, une fois encore le script ici, bof. -->

				<!--//End-slider-script -->
				<div id="top" class="callbacks_container wow fadeInUp"
					data-wow-delay="0.5s">
					<!-- Slider qui dÃ©file -->
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
			</div>
			<!-- blog -->
			<div class="blog">
				<!-- Gros bloc de tests de jeux -->
				<div class="blog-left">

					<div class="blog-left-grid">
						<div class="blog-left-grid-left">
							<h3>
								<a href="single.html">League of Legends, un déclin proche ?</a>
							</h3>
							<p>
								by <span>AAAAAAAAA</span> | June 29,2015 | <span>Sint</span>
							</p>

						</div>
						<div class="blog-left-grid-right">
							<a href="#" class="hvr-bounce-to-bottom non">20 Comments</a>
						</div>

						<div class="clearfix"></div>

						<div class="col-xs-12 col-sm-3">
							<a href="single.html"><img src="images/4.jpg" alt=" "
								class="img-responsive img-rounded" /></a>
						</div>
						<p class="para">League of Legends, blablabla c'est de la
							merde, il y a de moins en moins de monde blablabla, ça pue du
							cul, etc. League of LegendsLeague of Legends, blablabla c'est de
							la merde, il y a de moins en moins de monde blablabla, ça pue du
							cul, etc. League of Legends, blablabla c'est de la merde, il y a
							de moins en moins de monde blablabla, ça pue du cul, etc. League
							of Legends, blablabla c'est de la merde, il y a de moins en moins
							de monde blablabla, ça pue du cul, etc. League of Legends,
							blablabla c'est de la merde, il y a de moins en moins de monde
							blablabla, ça pue du cul, etc. League of Legends, blablabla c'est
							de la merde, il y a de moins en moins de monde blablabla, ça pue
							du cul, etc. League of Legends, blablabla c'est de la merde, il y
							a de moins en moins de monde blablabla, ça pue du cul, etc.</p>
					</div>
				</div>

				<p> PASSE PAR LA </p>
				<c:forEach items="${LISTE_TESTS}" var="test">
					<a href="TestServlet?idTest=${test.idTest}">a  ${test.jeu.getTitreJeu()}</a>

					<br>
				</c:forEach>



			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<%@ include file="footer.jsp"%>
<!-- <p>
		<%//String message = "Connexion réussi. Bienvenue "+ session.getAttribute("LOGIN");
			//out.println(message);%>
	</p> -->


</body>
</html>