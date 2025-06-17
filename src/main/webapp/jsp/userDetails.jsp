<%@page import="java.util.*"%>
<%@page import="model.User;"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page User Details</title>
</head>
<body>
	<p>Informations de l'utilisateur courant : </p>
	<%
	User currentUser = (User) request.getSession().getAttribute("currentUser");
	out.print("Nom : " + currentUser.getNom() + "\n");
	out.print("Email : " + currentUser.getEmail() + "\n");
	%>
	
	<p>Liste des utilisateurs enregsitrés :</p>
	
</body>
</html>