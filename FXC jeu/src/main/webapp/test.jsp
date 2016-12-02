<%@ include file="header.jsp"%>
<div class="banner-body">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<!-- //header -->

		<p>ID : ${TEST.idTest}</p>
		<p>Titre : ${TEST.titreTest}</p>
		<p>Date : ${TEST.dateTest}</p>
		<p>Nombre de com : ${TEST.nbCom}</p>
		<p>Avantage : ${TEST.avantageJeu}</p>
		<p>Inconvénient : ${TEST.inconvenientJeu}</p>
		<p>Description : ${TEST.descriptionTest}</p>
		<p>Jeu : ${TEST.jeu.getTitreJeu()}</p>
		<p>Utilisateur : ${TEST.utilisateur.getLogin()}</p>
		<BR> <a href="javascript:history.go(-1)">Retour</a>
	</div>
</div>
</body>
</html>