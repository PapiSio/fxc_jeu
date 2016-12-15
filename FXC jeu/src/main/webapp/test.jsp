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
						</span></li>
						<br>
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

						<c:forEach items="${TEST.jeu.listeModeleEconomiques}"
							var="modeleEco">
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
					<li><small class="admin"> </small><span>${TEST.utilisateur.getLogin()}</span></li>
				</ul>
			</div>
			<br>
			<div class="alert alert-success" role="alert">
				<strong>Avantages</strong> ${TEST.avantageJeu}
			</div>

			<div class="alert alert-danger" role="alert">
				<strong>Inconvénients</strong> ${TEST.inconvenientJeu}
			</div>

			<!-- Commentaires -->
			<div class="comment-grid-top">
				<h3>Responses</h3>
				<div class="comments-top-top">
					<div class="top-comment-left">
					</div>

					<c:forEach items="${ListeCOM}" var="commentaire">
						<div class="top-comment-right">
							<ul>
								<li><span class="left-at"><a href="#">${TEST.utilisateur.getLogin()}</a></span></li>
								<li><span class="right-at">${commentaire.dateCom}</span></li>
								<li><button class="reply" type="button"
										onclick="toggle_div(this,'id_du_div');">Reply</button></li>
								<div id="id_du_div" style="display: none;">
									<form name="ReponseCommentaireServlet"
										action="CommentaireServlet" method="POST">
										<input type="hidden" name="Utilisateur"
											value="${idUtilisateur}"> <input type='hidden'
											name="Test" value="${TEST.idTest}">
											<input type="hidden" name="Commentaire"
											value="${commentaire.idCom }">
										<textarea rows="3" cols="50" name="ContenuReponse"></textarea>
										<input type="submit" value="Send">
									</form>
								</div>
							</ul>
							<p>${commentaire.contenuCom}</p>
						</div>
					</c:forEach>


					<div class="clearfix"></div>
				</div>

				
				
				
				
<!-- 				<div class="comments-top-top top-grid-comment">
					<div class="top-comment-left">
						<a href="#"><img class="img-responsive" src="images/co.png"
							alt=""></a>
					</div>
					<div class="top-comment-right">
						<ul>
							<li><span class="left-at"><a href="#">Adminzzz</a></li>
							<li><span class="right-at">June 30, 2015 at 10.30am</span></li>
							<li><a class="reply" href="#">REPLY</a></li>
						</ul>
						<p>It is a long established fact that a reader will be
							distracted by the readable content of a page when looking at its
							layout.The point of using Lorem Ipsum is that it has a
							more-or-less</p>
					</div>
					<div class="clearfix"></div>
				</div> -->
			</div>
			<div class="artical-commentbox">
				<h3>leave a comment</h3>
				<div class="table-form">
					<form name="CommentaireServlet" action="CommentaireServlet"
						method="POST">
						<input name="AuteurComm" type="text" class="textbox"
							value="${loginUtilisateur}" readOnly="readOnly"> <input
							type="hidden" name="Utilisateur" value="${idUtilisateur}">
						<input type='hidden' name="Test" value="${TEST.idTest}">
						<textarea name="ContenuCom">Pose ton com le moche</textarea>
						<input type="submit" value="Send">
					</form>
				</div>
			</div>
		</div>
		<!-- single -->
	</div>
</div>
<!-- //footer -->
<!-- for bootstrap working -->
<%@ include file="footer.jsp"%>
<script src="js/bootstrap.js">
	
</script>
<!-- //for bootstrap working -->
</body>
</html>