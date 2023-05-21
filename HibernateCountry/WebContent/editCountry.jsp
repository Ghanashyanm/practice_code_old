<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<form action="countryController" method="post">
<c:forEach items="${sessionScope.countryData}" var="i">
Country:<input type="text" name="countryName" value="${i.countryName}">
<input type="hidden" name="countryId" value="${i.countryId}">
<input type="hidden" name="flag" value="updateCountry">
</c:forEach>
<input type="submit" value="Submit">
</form>
</body>
</html>