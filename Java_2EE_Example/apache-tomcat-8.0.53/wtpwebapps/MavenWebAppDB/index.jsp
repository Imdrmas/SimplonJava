<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.issamdrmas.DbDao" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.util.Date" %>
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
</style>

</head>
<body>
<div>
<nav class="navbar navbar-light bg-success">
  <a class="navbar-brand"><i class="fab fa-accessible-icon" style="color: #e84118; background: #f4fcff; margin-left: 50px; padding: 5px; margin-right: 10px;"></i> Maven Web App</a>
  <form class="form-inline" style="font-size: 16px;">
    <input class="form-control mr-sm-4" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>
</div>

<div class="container" style="margin-top: 30px">
  <div class="row">
    <div class="col-lg-7" style="padding: 20px; background: #FFF; border: 1px solid #000;">
       <% try{
	 ResultSet rs = DbDao.getEmployeeList();
	 if(rs.next()){

  %>
<table class="table table-striped">
  <thead class="bg-success">
    <tr>
      <th scope="col">FName</th>
      <th scope="col">LName</th>
      <th scope="col">Age</th>
      <th scope="col">Date</th>
      <th scope="col">City</th>
       <th scope="col">Edit Infos</th>
    </tr>
  </thead>
 <% do{ %>
  <tbody>
    <tr>
      <th scope="row"><%= rs.getString("frist_name") %></th>
      <td><%= rs.getString("last_name") %></td>
      <td><%= rs.getString("age") %></td>
      <td><%= rs.getString("date") %></td>
      <td><%= rs.getString("city") %></td>
      <td style="display: flex;"><a href="delete.jsp?id=<%= rs.getString("id") %>" class="btn btn-danger" onclick="myFunction()">Delete</a>
      <a href="delete.jsp?id=<%= rs.getString("id") %>" style="margin-left: 10px;" class="btn btn-warning"> Update</a></td>
    </tr>
  </tbody>
  <% }while(rs.next()); } else{ %>

	
<% }
}catch(Exception ex){
	ex.printStackTrace();
} finally{
	DbDao.disconnectDb();
}
 %>
</table>
    </div>
    
 
    <div class="col-lg-5" style="padding: 20px; background: #FFF; border: 1px solid #000;">
    
 <table class="table">
  <thead class="bg-success">
    <tr>
      <th scope="col">Enter Informations Of Students</th>
    </tr>
  </thead>
</table>

    <form action="SaveServlet" method="POST">
    
  <div class="form-group row">
    <label for="inputFName" class="col-sm-2 col-form-label">FName:</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputFName" placeholder="First Name">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputLName" class="col-sm-2 col-form-label">LName:</label>
    <div class="col-sm-10">
      <input type="text" name="last_name" class="form-control" id="inputLName" placeholder="Last Name">
    </div>  
  </div>
  
    <div class="form-group row">
    <label for="inputAge" class="col-sm-2 col-form-label">Age:</label>
    <div class="col-sm-10">
      <input type="text" name="age" class="form-control" id="inputAge" placeholder="Age">
     </div>  
  </div>
  
      <div class="form-group row">
    <label for="inputCity" class="col-sm-2 col-form-label">City:</label>
    <div class="col-sm-10">
      <input type="text" name="city" class="form-control" id="inputCity" placeholder="City">
     </div>  
  </div>
  
      <div class="form-group row">
    <label for="inputDate" class="col-sm-2 col-form-label">Date:</label>
    <div class="col-sm-10">
      <input type="text" name="date" class="form-control" id="inputDate" placeholder="Date">
     </div>  
  </div>

  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-success">Adding</button>
    </div>
  </div>
</form>
    </div>
  </div>
</div>


<script>
function myFunction() {
  confirm("Are You Sure You Want To Delete It!");
}
</script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>