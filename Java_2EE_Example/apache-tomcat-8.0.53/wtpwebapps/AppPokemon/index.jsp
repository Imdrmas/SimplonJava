<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Second Maven</title>

<style type="text/css">
   body{
   text-align: center;
   background: #ddd;
   }
   
   p{
     color: blue;
     font-size: 24px;    
   }
   h6{
   color: red;
   }
</style>
</head>
<body>
<h2>Hello World From Java EE !</h2>
<h6> Il est <%= new Date() %> </h6>
<hr>

</body>
</html>
