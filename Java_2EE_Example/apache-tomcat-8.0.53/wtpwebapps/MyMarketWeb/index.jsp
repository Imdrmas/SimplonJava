<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Market Web</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link href='https://fonts.googleapis.com/css?family=Abhaya Libre' rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Abril Fatface' rel='stylesheet'>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/master.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

<style type="text/css">
body{
background: #f4fcff;
font-family: 'Abhaya Libre';font-size: 22px;
color: #000;
}
.navbar .navbar-brand{
color: #fff !important;
font-size: 30px;
font-family: 'Abril Fatface';font-size: 22px;
}
.navbar button{
background: #f4fcff;
color: #007bff;
font-weight: bold;
}
.navbar button:hover{
color: #FFF !important;
background-color: #007bff !important;
border: 1px solid #FFF !important;
}
.media img{
width: 80px;
height: 60px;
border: 2px solid #007bff;
}
.media-body h5{
font-weight: bold;
}
.media .media-body:hover{
background-color: #c8d6e5 !important;
color: #007bff !important;
}

.mybtn{
color: #FFF !important;
display: none;
margin-left: 10px;
}

#h2{
margin-top: 30px;
margin-bottom: 15px;
text-decoration: underline;
}
.containers {
  border: 1px dashed #e84118;
  background-color: #c8d6e5;
  border-radius: 5px;
  padding: 16px;
  margin: 16px 0
}

.containers::after {
  content: "";
  clear: both;
  display: table;
}

.containers .avatar {
  float: left;
  margin-right: 20px;
  border-radius: 50%;
}

.containers span {
  font-size: 20px;
  margin-right: 15px;
  font-weight: bold;
  font-size: 16px;
}
.containers p{
margin-top: -6px;
margin-bottom: 5px;
font-size: 16px;
}
@media (max-width: 500px) {
  .containers {
      text-align: center;
  }
  .containers .avatar {
      margin: auto;
      float: none;
      display: block;
  }
}
</style>

</head>
<body>
<div>
<nav class="navbar navbar-light bg-primary">
  <a class="navbar-brand"><i class="fab fa-markdown" style="color: #e84118; background: #f4fcff; margin-left: 50px; padding: 5px; margin-right: 10px;"></i> My Market Online</a>
  <form class="form-inline" style="font-size: 16px;">
    <input class="form-control mr-sm-4" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>
</div>

<div class="container" style="margin-top: 10px; border: 1px dashed #e84118;">
  <div class="row">
  <div class="col-lg-6" style="background: #ffffff; padding: 10px 25px; border-right: 1px dashed #e84118;">
  <%

String fullname = (request.getParameter("fullname") != null) ? request.getParameter("fullname") : " .....................";
String address = (request.getParameter("address") != null) ? request.getParameter("address") : " ....................";

%>
<div class="containers">
  <img class="avatar" src="https://www.w3schools.com/howto/img_avatar.png" alt="Avatar" style="width:90px">
  <p style="margin-top: 16px;"><i class="fas fa-user" style="color: #717171cc;"></i> <span> Fullname:</span><%= fullname %></p>
  <p><i class="fas fa-map-marker-alt" style="color: #717171cc;"></i><span> Address:</span><%= address %></p>
   <p><i class="fas fa-info-circle" style="color: #717171cc;"></i><span> Infos:</span><%= request.getAttribute("info") %></p>
   <p><i class="fas fa-info-circle" style="color: #717171cc;"></i><span> Total Price:</span><%= request.getAttribute("totalPrice") %></p>
</div>

<h2 id="h2">Liste des produits</h2>
<ul class="list-unstyled">

  <li class="media" id="myrow">
    <img src="https://www.egilia.com/images/logo/microsoft/windows-10-logo.jpg" class="mr-3" alt="...">
    <div class="media-body" style="padding: 5px 10px;">
      <h5 class="mt-0 mb-1"><%= request.getAttribute("namePro") %></h5>
      <p><%= request.getAttribute("descPro") %></p>
      
 <a id="bto" data-toggle="popover" title="DESCRIPTION" data-content="Détails contrastés, manches color block et patte de boutonnage encadrée par un piping sobre, ce modèle Edition Made in France revisite l'iconique polo Lacoste. Une pièce chic et sportive pour toutes les femmes actives."
    class="btn btn-success mybtn"> voir le produit </a>
 <a id="btoo" class="btn btn-warning mybtn">Acheter </a>
                  
    </div>
  </li>

</ul> 

</div>
 <div class="col-lg-6" style="background: #c8d6e5; padding: 10px 25px;">


<form method="GET" action="TestServlet" id="myForm" style="margin-top: 20px;">
  <div class="form-group row">
    <label for="inputText3" class="col-sm-2 col-form-label">Fullname:</label>
    <div class="col-sm-10">
      <input type="text" name="fullname" class="form-control" id="inputText3" placeholder="Enter Nom Complet">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputAddres3" class="col-sm-2 col-form-label">Address:</label>
    <div class="col-sm-10">
      <input type="text" name="address" class="form-control" id="inputAddress3" placeholder="Enter Address">
    </div>
  </div>
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Livration:</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="radioName" id="gridRadios1" value="domcile" checked>
          <label class="form-check-label" for="gridRadios1">
            à domicile
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="radioName" id="gridRadios2" value="express">
          <label class="form-check-label" for="gridRadios2">
           express
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="radioName" id="gridRadios3" value="relay">
          <label class="form-check-label" for="gridRadios3">
           point relais
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="radioName" id="gridRadios4" value="takAway">
          <label class="form-check-label" for="gridRadios4">
          à retirer
          </label>
        </div>
      </div>
    </div>
  </fieldset>
    <div class="form-group row">
    <label for="inputText3" class="col-sm-2 col-form-label">Infos</label>
    <div class="col-sm-10">
      <input type="text" id="myVal" name="infoLivarison" class="form-control" id="inputText3" placeholder="Livration (Relay et Express)">
    </div>
  </div>
    <div class="mb-3">
    <label for="validationTextarea">Liste de produit </label>
    <textarea class="form-control" name="listeProduit" id="validationTextarea" placeholder="Produits: quantité, un produit par ligne" required></textarea>
    </div>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary btn-lg btn-block">Envoyer</button>
    </div>
  </div>
</form>
</div>
  </div>
</div>


<script>
$(document).ready(function(){
	$('#myForm input').on('change', function() {
		var myVal = $('input[name=radioName]:checked', '#myForm').val(); 
         $("#myVal").val("Vous avez choisi : "+myVal);
		});
	
	$( "#myrow" )
	 .on("mouseenter", function() {
	  $(".mybtn").show();
	})
	.on("mouseleave", function() {
	  $(".mybtn").hide();
	});
	
});

</script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>