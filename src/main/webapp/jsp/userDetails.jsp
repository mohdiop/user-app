<%@page import="model.User"%>
<%@page import="java.util.List"%>
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
	User currentUser = (User) request.getAttribute("currentUser");
	%>
	
	<p><% if(currentUser != null){
			out.print("Nom : " + currentUser.getNom() + " Email : " + currentUser.getEmail());
		} else {
			out.print("Les champs que vous aviez saisis sont vides!");
		}%></p>
	
	<%
	List<User> users = (List<User>) request.getAttribute("users");
	%>
	
	<p>Liste des utilisateurs enregsitrés :</p>
	
	<% for(User user : users) {%>
		<p><% out.print("Nom : " + user.getNom() + " Email : " + user.getEmail()); %></p>
	<%} %>
	
	<button onclick="location.href='jsp/userForm.jsp';">Retour au formulaire</button>
</body>
</html>