<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>ID : ${JEU.idJeu}</p>
		<p>Titre : ${JEU.titreJeu}</p>
		<p>Date : ${JEU.dateSortieJeu}</p>
		<p>Description : ${JEU.description}</p>
		<p>Class : ${JEU.classification.getLibelleClassification()}</p>
		<p>Editeur : ${JEU.editeur.getRaisonSociale()}</p>
		<p>Genre : ${JEU.genre.getLibelleGenre()}</p>
		<p>Dev : ${JEU.developpeur.getRaisonSociale()}</p>
		<BR>
		<a href="javascript:history.go(-1)">Retour</a>
</body>
</html>