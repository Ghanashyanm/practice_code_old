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
<%@taglib prefix="s" uri="http://java.sun.com/jstl/sql_rt" %>

<c:set var="fn" value="${param.fn}"></c:set>
<c:set var="ln" value="${param.ln}"></c:set>

<s:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="root" var="i"></s:setDataSource>

<s:query dataSource="${i}" var="rs">
select *from jstltbl1
</s:query>
<c:forEach var="j" items="${rs.rows}">
${j.id} 
${j.first_name}
${j.last_name}

</c:forEach>

</body>
</html>


<%-- <!-- 
<!--<s:update dataSource="${i}">-->
insert into jstltbl1 (first_name,last_name) VALUES('${fn}','${ln}')
update jstltbl1 set last_name="sangu" where id=1
delete from jstltbl1 where condition
</s:update> --> --%>

