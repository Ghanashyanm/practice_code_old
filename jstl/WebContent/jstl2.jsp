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
<c:set var="i" value="1"></c:set>
<c:set var="j" value="2"></c:set>
<c:set var="k" value="3"></c:set>

<c:set var="l" value="hello"></c:set>
<c:out value="${l}"></c:out>


<c:if test="${i gt 2}">
<c:out value="${2}"></c:out> 
</c:if>

<c:if test="${i lt 2}">
<c:out value="${20}"></c:out> 
</c:if>

<c:choose>
	<c:when test="${i gt 2}">
	${i}</c:when>
	
	<c:when test="${i lt 2}">
	${j}</c:when>
	
	<c:otherwise>
	${k}</c:otherwise>
	
</c:choose>

</body>
</html>