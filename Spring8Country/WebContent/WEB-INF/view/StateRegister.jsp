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

<%@taglib prefix="i" uri="http://java.sun.com/jstl/core_rt" %>

<f:form modelAttribute="stateVO" action="insertState.html" method="POST">
Country : <f:select path="countryVO.id">
<i:forEach var="i" items="${editList}">
		<f:option value="${i.id}">${i.country}</f:option>
</i:forEach>
</f:select>	
<br/>
		StateName<f:input path="state" value="${stateVO.state}"/>
		<f:hidden path="id"/>
<input type="submit">
</f:form>
<br>
<a href="searchState.html">SearchState</a>
</body>
</html>