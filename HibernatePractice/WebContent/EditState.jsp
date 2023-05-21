<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<form action="StateController" method="post">
	Country :
	<select name="countryId">
		<c:forEach items="${sessionScope.countryList}" var="i">
			<option value="${i.countryId}">${i.countryName}</option>
		</c:forEach>
	</select>
	<br> State :
	<c:forEach items="${sessionScope.stateList}" var="j">
		<input type="text" name="state" value="${j.stateName}">
		<input type="hidden" name="id" value="${j.id}">
	</c:forEach>
	<br>
	<input type="hidden" name="flag" value="updateState">
	<input type="submit" value="Submit">
</form>
</body>
</html>