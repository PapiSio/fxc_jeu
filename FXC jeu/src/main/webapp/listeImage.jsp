<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${LISTE_IMAGE}" var="image">
		<p>ID : ${image.idImage} - Chemin : ${image.cheminImage}</p>
		<img alt="Marche pas" src="${image.cheminImage}"></img>
		<br>
	</c:forEach>

</body>
</html>