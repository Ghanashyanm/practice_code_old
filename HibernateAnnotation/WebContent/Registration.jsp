<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="FormController" method="post">
	
	First Name: <input type="text" name="fn"><br> 
	Last Name:  <input type="text" name="ln"><br> 
	User Name:  <input type="text" name="un"><br> 
	Password :  <input type="password" name="pwd"><br> 
				<input type="hidden" name="flag" value="insert"> 
				<input type="submit" value="Save">
	</form>
	<br>
	<a href="FormController?flag=searchReg">Search Registration</a>
	<br>

</body>
</html>