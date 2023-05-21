<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>

</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
	<f:form action="insert" method="post" modelAttribute="Regvo">
		First Name :<f:input path="fn"/><br>
		Last Name  :<f:input path="ln"/><br>
		User Name : <f:input path="loginvo.un"/><br>
		Password : <f:input path="loginvo.pwd"/><br>
		<f:hidden path="id" />
		<f:hidden path="loginvo.id"/>
		<input type="submit" class="btn" value="Submit"><br>
	</f:form>
	<a href="search">Search</a>
</body>
</html>