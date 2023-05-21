<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="border: 1px solid; border-collapse:collapse; text-align:center; ">

<%			
			for(int i=1;i<=10;i++){
			if(i%2==0){
	%>
	<tr>
	<td style="background-color:red"><%=i%></td>
	</tr>
<%}
	else{%>
	<tr>
	<td style="background-color:blue"><%=i%></td>
	</tr>
	<%}} %>
</table>
</body>
</html>