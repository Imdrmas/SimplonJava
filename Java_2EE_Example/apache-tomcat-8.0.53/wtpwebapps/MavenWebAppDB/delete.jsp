<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.issamdrmas.DbDao" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.Statement" %>
<%
String id = request.getParameter("id");
Connection con = DbDao.connectDb();
Statement st = con.createStatement();
st.executeUpdate("DELETE FROM StudentInfo WHERE id='"+id+"'");
response.sendRedirect("/index.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>