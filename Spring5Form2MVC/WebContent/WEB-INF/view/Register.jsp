<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="Login.html" method="POST" modelAttribute="registerData">
First Name:<f:input path="fn"/><br>
Last Name:<f:input path="ln"/><br>
User Name:<f:input path="un"/><br>
Password:<f:input path="pwd"/><br>

<input type="submit" value="Submit">
</f:form>
</body>
</html>