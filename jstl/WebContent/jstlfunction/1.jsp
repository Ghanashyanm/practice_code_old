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
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="i" value="abcdef"></c:set>
<c:set var="j" value="x,y,z"></c:set>

1. ${f:contains(i,'g')}<br>
2. ${f:containsIgnoreCase(i,'g')}<br>
3. ${f:endsWith(i,'b')}<br>
4. ${f:escapeXml(i)}<br>
5. ${f:indexOf(i,'a')}<br>
<%-- 6. ${f:join(i,j)} --%><br>
7. ${f:length(i)}<br>
8. ${f:replace(i,'a','d')}<br>
9.
<br>

<c:set var="z" value="${f:split(j,',')}"></c:set>

<c:forEach items="${z}" var="k">
${k} <br>
</c:forEach>


10. JOIN
<br>
${f:join(z,'-')}

  <br>
10. ${f:startsWith(i,'a') }<br>
11. ${f:substring(i,1,4)}<br>
12.${f:substringAfter(i,'b')}<br>
13.${f:substringBefore(i,'c')}<br>
14.${f:toLowerCase(i)}<br>
15.${f:toUpperCase(i)}<br>
16.${f:trim(i)}<br>





</body>
</html>