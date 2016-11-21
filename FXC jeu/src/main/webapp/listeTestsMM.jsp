<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<!-- //header -->

		<c:forEach items="${LISTE_TESTS}" var="TEST">
			<p>ID : ${TEST.idTest}</p>
			<p>Titre : ${TEST.titreTest}</p>
			<p>Date : ${TEST.dateTest}</p>
			<p>Note : ${TEST.noteJeu}</p>
			<p>Nb com : ${TEST.nbCom}</p>
			<p>Avantage : ${TEST.avantageJeu}</p>
			<p>Inconvenient : ${TEST.inconvenientJeu}</p>
			<p>Description : ${TEST.descriptionTest}</p>
			<p>Titre : ${TEST.jeu.titreJeu}</p>
			<p>Date : ${TEST.jeu.dateSortieJeu}</p>
			<p>Description : ${TEST.jeu.description}</p>
			<p>Class : ${TEST.jeu.classification.getLibelleClassification()}</p>
			<p>Image : ${TEST.jeu.imgJeu}</p>
			<p>Editeur : ${TEST.jeu.editeur.getRaisonSociale()}</p>
			<p>Genre : ${TEST.jeu.genre.getLibelleGenre()}</p>
			<p>Dev : ${TEST.jeu.developpeur.getRaisonSociale()}</p>
			<br>
		</c:forEach>
	</div>
</div>


</body>
</html>