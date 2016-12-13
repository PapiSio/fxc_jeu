<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<!-- //header -->

		<p>ID : ${TEST.idTest}</p>
		<p>Titre : ${TEST.titreTest}</p>
		<p>Date : ${TEST.dateTest}</p>
		<p>Avantage : ${TEST.avantageJeu}</p>
		<p>Inconvénient : ${TEST.inconvenientJeu}</p>
		<p>Description : ${TEST.descriptionTest}</p>
		<p>Jeu : ${TEST.jeu.getTitreJeu()}</p>
		<p>Utilisateur : ${TEST.utilisateur.getLogin()}</p>
		<BR> <a href="javascript:history.go(-1)">Retour</a>


		<!-- //header -->
		<!-- single -->
		<div class="single-page-artical">
			<div class="artical-content">
				<h3>${TEST.titreTest}</h3>
				<img class="img-responsive" src="images/banner.jpg" alt=" " />

				<div class="artical-links">
					<ul>
						<li><small> </small><span>${TEST.jeu.editeur.getRaisonSociale()}
						</span></li><br>
						<li><small> </small><span>${TEST.jeu.developpeur.getRaisonSociale()}
						</span></li>
						<li><small> </small><span>${TEST.jeu.genre.getLibelleGenre()}
						</span></li>
						<li><small> </small><span>${TEST.jeu.classification.getLibelleClassification()}
						</span></li>
						<c:forEach items="${TEST.jeu.listeSupports}" var="support">
							<li><small> </small><span>${support.getLibelleSupport()}
							</span></li>
						</c:forEach>
						<c:forEach items="${TEST.jeu.listePlateformes}" var="plateforme">
							<li><small> </small><span>${plateforme.getLibellePlateforme()}
							</span></li>
						</c:forEach>
						
						<c:forEach items="${TEST.jeu.listeModeleEconomiques}" var="modeleEco">
							<li><small> </small><span>${modeleEco.getLibelleModeleEco()}
							</span></li>
						</c:forEach>



						<%-- 						<li><small> </small><span>${TEST.jeu.support.getLibelleSupport()}
						</span></li>
						<li><small> </small><span>${TEST.jeu.plateforme.getLibellePlateforme()}
						</span></li>
						<li><small> </small><span>${TEST.jeu.editeur.getRaisonSociale()}
						</span></li> --%>

					</ul>
				</div>
				<p>${TEST.descriptionTest}</p>
			</div>
			<div class="artical-links">
				<ul>
					<li><small> </small><span>${TEST.dateTest} </span></li>
					<li><small class="admin"> </small><span>${TEST.utilisateur.getLogin()}
							<li><small> </small><span>View posts</span></li>
							<li><a href="#"><small class="link"> </small><span>permalink</span></a></li>
				</ul>
			</div>
			<br>
			<div class="alert alert-success" role="alert">
				<strong>Avantages</strong> ${TEST.avantageJeu}
			</div>

			<div class="alert alert-danger" role="alert">
				<strong>Inconvénients</strong> ${TEST.inconvenientJeu}
			</div>

			<%-- 			<c:forEach >
				<div class="alert alert-success" role="alert">
					<strong>Well done!</strong> You successfully read this important
					alert message.
				</div>

			</c:forEach>
 --%>

			<!-- Commentaires -->
			<div class="comment-grid-top">
				<h3>Responses</h3>
				<div class="comments-top-top">
					<div class="top-comment-left">
						<a href="#"><img class="img-responsive" src="images/co.png"
							alt=""></a>
					</div>
					<div class="top-comment-right">
						<ul>
							<li><span class="left-at"><a href="#">Admin</a></span></li>
							<li><span class="right-at">June 30, 2015 at 10.30am</span></li>
							<li><a class="reply" href="#">REPLY</a></li>
						</ul>
						<p>It is a long established fact that a reader will be
							distracted by the readable content of a page when looking at its
							layout.The point of using Lorem Ipsum is that it has a
							more-or-less</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="comments-top-top top-grid-comment">
					<div class="top-comment-left">
						<a href="#"><img class="img-responsive" src="images/co.png"
							alt=""></a>
					</div>
					<div class="top-comment-right">
						<ul>
							<li><span class="left-at"><a href="#">Admin</a></li>
							<li><span class="right-at">June 30, 2015 at 10.30am</span></li>
							<li><a class="reply" href="#">REPLY</a></li>
						</ul>
						<p>It is a long established fact that a reader will be
							distracted by the readable content of a page when looking at its
							layout.The point of using Lorem Ipsum is that it has a
							more-or-less</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="artical-commentbox">
				<h3>leave a comment</h3>
				<div class="table-form">
					<form>
						<input type="text" class="textbox" value="Name"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Name';}"> <input
							type="text" class="textbox" value="Email"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Email';}"> <input
							type="text" class="textbox" value="Phone number"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Phone number';}">
						<textarea value="Message:" onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Message';}">Message</textarea>
						<input type="submit" value="Send">
					</form>
				</div>
			</div>
		</div>
		<!-- single -->
	</div>
</div>

<c:if test="${TEST.utilisateur.getId() eq session.getParameter}">


</c:if>
<!-- //footer -->
<!-- for bootstrap working -->
<%@ include file="footer.jsp"%>
<script src="js/bootstrap.js">
	
</script>
<!-- //for bootstrap working -->
</body>
</html>