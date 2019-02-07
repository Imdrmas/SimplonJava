<%@page import="co.hamza.darty.produit.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="co.hamza.darty.client.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/darty/WebContent/style.css" />
<title>Panier</title>
</head>
<body align = center>
	<!-- 	<h1 align = center>------------------- FACTURE --------------------</h1> -->

	<p align=center>
		<b>DARTY belleville <br> 25 Boulevard de Belleville, 75011
			Paris <br> <br></b>

	</p>
	<p>

		<%
			out.println(request.getAttribute("afficher") + "<br>");
		%>




	</p>
</body>
</html>