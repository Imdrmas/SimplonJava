<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Market Web</title>
<link href='https://fonts.googleapis.com/css?family=Abhaya Libre' rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Abril Fatface' rel='stylesheet'>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/master.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

<style type="text/css">
body{
background: #dff9fb;
font-family: 'Abhaya Libre';font-size: 22px;
color: #222f3e;
}
.navbar .navbar-brand{
color: #fff !important;
font-size: 30px;
font-family: 'Abril Fatface';font-size: 22px;
}
.navbar button{
background: #fff;
}
.media img{
width: 80px;
height: 60px;
}
.media-body h5{
font-weight: bold;
}
#h2{
margin-top: 30px;
margin-bottom: 15px;
text-decoration: underline;
}
.containers {
  border: 1px solid #000;
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
  <a class="navbar-brand">My Market Online</a>
  <form class="form-inline">
    <input class="form-control mr-sm-4" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>
</div>

<div class="container" style="margin-top: 10px;">
  <div class="row">
  <div class="col-lg-6" style="background: #ffffff; padding: 25px;">
  
<div class="containers">
  <img class="avatar" src="https://www.w3schools.com/howto/img_avatar.png" alt="Avatar" style="width:90px">
  <p><span>fullname : </span> <%= request.getAttribute("name") %> </p>
  <p><span>address : </span> <%= request.getAttribute("address") %></p>
</div>

<h2 id="h2">Liste des produits</h2>
  
<ul class="list-unstyled">
  <li class="media">
    <img src="https://www.egilia.com/images/logo/microsoft/windows-10-logo.jpg" class="mr-3" alt="...">
    <div class="media-body">
      <h5 class="mt-0 mb-1">0 - Philips HD7837782/61 : 79.99$</h5>
      <p>Philips Senseo Quadrante, Noir - 1 ou 2</p>
    </div>
  </li>
  <li class="media my-4">
    <img src="https://images-na.ssl-images-amazon.com/images/I/41eOZcT6hKL.jpg" class="mr-3" alt="...">
    <div class="media-body">
      <h5 class="mt-0 mb-1">0 - Philips HD7837782/61 : 79.99$</h5>
      <p>Philips Senseo Quadrante, Noir - 1 ou 2</p>
    </div>
  </li>
  <li class="media">
    <img src="http://www.comunitic.fr/wp-content/uploads/2018/02/samsung.png" class="mr-3" alt="...">
    <div class="media-body">
      <h5 class="mt-0 mb-1">0 - Philips HD7837782/61 : 79.99$</h5>
      <p>Philips Senseo Quadrante, Noir - 1 ou 2</p>
    </div>
  </li>
</ul> 
</div>
 <div class="col-lg-6" style="background: #c8d6e5; padding: 25px;">

<form method="post" action="marketControlor">
  <div class="form-group row">
    <label for="inputText3" class="col-sm-2 col-form-label">Fullname:</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputText3" placeholder="Enter Nom Complet">
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
          <input class="form-check-input" type="radio" name="domicile" id="gridRadios1" value="option1" checked>
          <label class="form-check-label" for="gridRadios1">
            à domicile
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="express" id="gridRadios2" value="option2">
          <label class="form-check-label" for="gridRadios2">
           express
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="relais" id="gridRadios3" value="option3">
          <label class="form-check-label" for="gridRadios3">
           point relais
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="retier" id="gridRadios3" value="option3">
          <label class="form-check-label" for="gridRadios3">
          à retirer
          </label>
        </div>
      </div>
    </div>
  </fieldset>
    <div class="form-group row">
    <label for="inputText3" class="col-sm-2 col-form-label">Infos</label>
    <div class="col-sm-10">
      <input type="text" name="infoLivarison" class="form-control" id="inputText3" placeholder="Livration (Relay et Express)">
    </div>
  </div>
    <div class="mb-3">
    <label for="validationTextarea">Liste </label>
    <textarea class="form-control" name="listeProduit" id="validationTextarea" placeholder="Produits: quantité, un produit par ligne"></textarea>
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
<div>
  <%= request.getAttribute("listproduits") %>

</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>