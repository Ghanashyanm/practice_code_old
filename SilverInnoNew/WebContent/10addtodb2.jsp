<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String s1=request.getParameter("fn");
String s2=request.getParameter("ln");
String s3=request.getParameter("add");
String s4=request.getParameter("st");
String s5=request.getParameter("cry");
String s6=request.getParameter("gender");
String[] s7=request.getParameterValues("hby");


Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost/innosilvdb","root","root");
Statement s=c.createStatement();
s.executeUpdate("INSERT INTO table1 (first_name,last_name,address,state,country,gender,hobbies) VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"') ");

%>
</body>
</html>