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
String fn=request.getParameter("firstname");
String ln=request.getParameter("lastname");
String add=request.getParameter("address");
String cry=request.getParameter("country");
String st=request.getParameter("state");
String gn=request.getParameter("gender");
String[] hobbies=request.getParameterValues("hby");

out.println("First Name:"+fn); %><br><%
out.println("Last Name:"+ln);%><br><%
out.println("Address:"+add);%><br><%
out.println("Country:"+cry);%><br><%
out.println("State:"+st);%><br><%
out.println("Gender:"+gn);%><br><%

for(int i=0;i<hobbies.length;i++)
{
	out.println("Hobbies:"+hobbies[i]);
}

%>
</body>
</html>