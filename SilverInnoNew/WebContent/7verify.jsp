<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
// String firstname=request.getParameter("fn");
// String lastname=request.getParameter("ln");
String username=request.getParameter("un");
String password=request.getParameter("pw");
String un1="ghnshym";
String pw1="1234";
if(username.equals(un1) && password.equals(pw1))
{
	session.setAttribute("name",username);
	response.sendRedirect("8welcome.jsp");
}
else
{
	
	response.sendRedirect("6login.jsp");
}
%>
</body>
</html>