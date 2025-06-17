<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/userServlet" method="post" >
		<label for="nom">Nom : </label>
		<input type="text" name="nom" id="nom">
		<label for="email">Email : </label>
		<input type="email" name="email" id="email">
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>