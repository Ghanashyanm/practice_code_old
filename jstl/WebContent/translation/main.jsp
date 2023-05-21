<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://java.sun.com/jstl/fmt_rt" %>


<f:setLocale value="${param.flag}"></f:setLocale>

<f:setBundle basename="m" var="i"/>

<f:message bundle="${i}" key="fn"></f:message> <input type="text" name="fn"><br>
<f:message bundle="${i}" key="ln"></f:message> <input type="text" name="ln"> <br>

<a href="main.jsp?flag=guj">Gujrati</a>
<a href="main.jsp?flag=hin">Hindi</a>
<a href="main.jsp">English</a>

</body>
</html>