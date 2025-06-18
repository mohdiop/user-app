<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page d'erreurs</title>
</head>
<body>
	<% 
	String errorMessage = (String) request.getAttribute("errorMessage"); 
	out.print(errorMessage);
	%>
	<button onclick="location.href='jsp/userForm.jsp'">Retour au formulaire</button>
</body>
</html>