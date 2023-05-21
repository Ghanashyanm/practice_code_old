<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
	<f:form action="insertCountry.html" modelAttribute="countryVO"
		method="POST">
Enter Country : <f:input path="country" value="${countryVO.country}" />
		<br>
		<f:hidden path="id" />
		<input type="submit" value="Submit">
	</f:form>
	<br>
	<a href="searchCountry.html">SearchCountry</a>
</body>
</html>