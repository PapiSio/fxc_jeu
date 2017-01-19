<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<%@ include file="entete.jsp"%>


		<c:set var="auteur" scope="session" value="${idUtilisateur}" />
		<%-- 		<c:out value="${auteur}" /> --%>
		<c:set var="auteur1" scope="session"
			value="${TEST.utilisateur.getIdUtilisateur()}" />
		<%-- 		<c:out value="${auteur1}" /> --%>


		<div class="single-page-artical">
			<div class="artical-content">
			
				<h3>${TEST.titreTest}</h3>
				<img class="img-responsiveTest" src="images/imgTests/${TEST.jeu.idJeu}.jpg" alt=" " />

			</div>
			<div class="artical-links">
				<ul>
					<li><small> </small><span>${TEST.jeu.editeur.getRaisonSociale()}
					</span></li>
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
				</ul>
			</div>
			<p>${TEST.descriptionTest}</p>
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

			<!-- Permet d'ajouter des images seulement si on est l'auteur du test -->
			<span>Ajouter une image : </span>


			<form action="TeleversementServlet" enctype="multipart/form-data"
				method="POST" name="formulaireTeleversement">
				<input type="hidden" name="ID_TEST" value="${TEST.idTest}">
				<input type="file" name="NOM_IMAGE" multiple> <br> <input
					type="submit" name="submit" id="sumbit" value="Envoyer">
			</form>


			<!-- Commentaires -->
			<div class="comment-grid-top">
				<h3>Responses</h3>
				<div class="comments-top-top">
					<div class="top-comment-left"></div>

					<c:forEach items="${TEST.getListeCommentaires()}" var="commentaire">
						<div class="top-comment-right">
							<ul>
								<li><span class="left-at"><a href="#">${commentaire.utilisateur.getLogin()}</a></span></li>
								<li><span class="right-at">${commentaire.dateCom}</span></li>
								<li><button class="reply" type="button"
										onclick="toggle_div(this,'id_du_div');">Reply</button></li>
								<div id="id_du_div" style="display: none;">
									<form name="ReponseCommentaireServlet"
										action="CommentaireServlet" method="POST">
										<input type="hidden" name="Utilisateur"
											value="${idUtilisateur}"> <input type='hidden'
											name="Test" value="${TEST.idTest}"> <input
											type="hidden" name="Commentaire"
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
			</div>
			<div class="artical-commentbox">

				<c:if test="${auteur != auteur1}">

					<h3>Laisser un commentaire</h3>
					<div class="table-form">
						<form name="CommentaireServlet" action="CommentaireServlet"
							method="POST">
							<input name="AuteurComm" type="text" class="textbox"
								value="${loginUtilisateur}" readOnly="readOnly"> <input
								type="hidden" name="Utilisateur" value="${idUtilisateur}">
							<input type='hidden' name="Test" value="${TEST.idTest}">
							<textarea name="ContenuCom">Saisissez ici votre commentaire.</textarea>
							<input type="submit" value="Send">
						</form>
					</div>
				</c:if>
			</div>
		</div>
		<!-- single -->
	</div>
</div>
<%@ include file="footer.jsp"%>
<script src="js/bootstrap.js"></script>
</body>
</html>