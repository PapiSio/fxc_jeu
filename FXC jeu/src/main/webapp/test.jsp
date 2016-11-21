<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<!-- //header -->

		<p>ID : ${TEST.idTest}</p>
		<p>Titre : ${TEST.titreTest}</p>
		<p>Date : ${TEST.dateTest}</p>
		<p>Description : ${TEST.descriptionTest}</p>
		<p>Jeu : ${TEST.jeu.getTitreJeu()}</p>
		<p>User : ${TEST.utilisateur.getLogin()}</p>
		<BR> <a href="javascript:history.go(-1)">Retour</a>
	</div>
</div>
</body>
</html>