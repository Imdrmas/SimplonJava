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
   background: #ecf0f1;
   }
   h2{
   color: #2c3e50;
   }
   h4{
   color: #16a085;
   font-size: 15px;
   text-decoration: underline;
   }
   #person-info{
   background: #FFF;
   padding: 20px;
   margin-top: 10px;
   width: 684px;
   display: inline-block;
   border-radius: 6px;
   }
   
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
  border-radius: 6px;
}

th, td {
  text-align: left;
  padding: 16px;
  
}
td{
color: #3498db;
}

tr:nth-child(even) {
  background-color: #f2f2f2
}
#MyForm{
width: 440px;
padding: 30px;
background: cadetblue;
text-align: center;
margin-left: 421px;
border: 1px solid #FFF;
margin-top: 15px;
border-radius: 6px;
}
#MyForm input{
width: 371px;
border: 1px solid darkgrey;
padding: 6px;
margin-bottom: 6px;
border-radius: 6px;
}

#MyForm button{
width: 232px;
padding: 6px 20px;
font-size: 17px;
background: darkorange;
border: 1px solid aliceblue;
color: aliceblue;
font-weight: bold;
cursor: pointer;
border-radius: 6px;
}
#MyForm button:hover{
background: cadetblue;
color: #f39c12;
border: 1px solid #f39c12;
}
</style>
</head>
<body>
<h2>Welcome To My From Java EE -:) !</h2>
<h4> Il est <%= new Date() %> </h4>
<hr>

     <div id="MyForm">
         <form action="MyServlet" method="post">
    <input type="text" name="id" placeholder="Id" /><br>
    <input type="text" name="firstName" placeholder="First Name" /><br>
    <input type="text" name="lastName" placeholder="Last Name" /><br>
    <input type="text" name="age" placeholder="Age" /><br>
    <input type="text" name="email" placeholder="Email" /><br>
    <input type="text" name="city" placeholder="City" /><br>
    <input type="text" name="school" placeholder="School" /><br>
    <button type="submit"> Add Value</button>
  </form>
     </div>
  
    <div id="person-info">
    
    <table>
  <tr>
   <th>Id</th>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Age</th>
    <th>City</th>
    <th>School</th>
    <th>Email</th>
  </tr>
  <tr>
    <td><%= request.getAttribute("id")%></td>
    <td><%= request.getAttribute("firstName")%></td>
    <td><%= request.getParameter("lastName")%></td>
    <td><%= request.getParameter("age")%></td>
    <td><%= request.getParameter("city")%></td>
    <td><%= request.getParameter("school")%></td>
    <td><%= request.getParameter("email")%></td>
  </tr>
     </table>
   </div>


</body>
</html>