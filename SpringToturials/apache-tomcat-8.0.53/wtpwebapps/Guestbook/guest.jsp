<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,guest.Guest"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>JPA Guest Book Web Application Tutorial</title>
</head>
<body>

    <form action="guest" method="POST">
      Name <input type="text" name="Name" />
      <input type="submit" value="Add" />
    </form>

    <hr>
   <ol>
   <%
   @SuppressWarnings("unchecked")
   List<Guest> guests = (List<Guest>) request.getAttribute("guests");
   if(guests != null){
	   for(Guest guest : guests){%>
	   <li> <%= guest %> </li>
   <% 
   }
   }
   %>
   </ol>
</body>
</html>