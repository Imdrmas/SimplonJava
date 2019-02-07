<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Or Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>

<div class="container">
<h1>${ msg }</h1>
<h1>${ SuccessMsg }</h1>
 <div class="row">
   <div class="col-lg-6">
      <form action="LoginRegister" method="post">
  <div class="form-group row">
    <label for="inputText" class="col-sm-2 col-form-label">Username</label>
    <div class="col-sm-10">
      <input type="text" name="username" class="form-control" id="inputText" placeholder="Username">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Password">
    </div>
  </div>
 

  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" name="submit" value="login"  class="btn btn-primary">Login</button>
    </div>
  </div>
</form>
   </div>
   
      <div class="col-lg-6">
      <form action="LoginRegister" method="post">
  <div class="form-group row">
    <label for="inputTextFirst" class="col-sm-2 col-form-label">Firstname</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputTextFirst" placeholder="name">
    </div>
  </div>
     <div class="form-group row">
    <label for="inputTextLast" class="col-sm-2 col-form-label">Lastname</label>
    <div class="col-sm-10">
      <input type="text" name="username" class="form-control" id="inputTextLast" placeholder="Username">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPasswordR" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" name="rPassword" class="form-control" id="inputPasswordR" placeholder="Re-Type Password">
    </div>
  </div>

  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" name="submit" value="register" class="btn btn-primary">Register</button>
    </div>
  </div>
</form>
   </div>
   
 </div>

</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>