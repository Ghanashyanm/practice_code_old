<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="stateController" method="post">
		<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

		Country <select name="countryId">
			<c:forEach items="${sessionScope.countryData}" var="i">
				<option value="${i.countryId}">${i.countryName}</option>
			</c:forEach>
			</select>
			<br> 
			State <input type="text" name="stateName"><br>
			<input type="hidden" name="flag" value="insert"> 
			<input type="submit" value="Add">
	</form>
</body>
</html>
