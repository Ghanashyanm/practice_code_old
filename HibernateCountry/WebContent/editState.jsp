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

	<c:forEach items="${sessionScope.stateList}" var="i">

		<form action="stateController?flag=updateState" method="post"
			onsubmit="return f1()">

			Country <select name="countryId">
				<c:forEach items="${sessionScope.countryData}" var="j">
					<option value="${j.countryId}">${j.countryName}</option>
				</c:forEach>
			</select>
			
			
			 <span style="display: none;" id="s2">Please Enter Country
				Name</span> <br> 
				
				State:<input type="text" name="state" id="state"
				value="${i.stateName}"> <span style="display: none;" id="s1">Please
				Enter State Name</span> <br> <input type="hidden" name="id1"
				value="${i.id}"> <input type="submit" Value="Submit">
		</form>
	</c:forEach>


	<script type="text/javascript">
		var x = document.getElementById("state");

		var p = document.getElementById("s1");

		function f1() {
			if (x.value == "") {

				p.style.display = "";
				return false;
			} else {
				p.style.display = "none";

			}

			var y = document.getElementById("country");

			var q = document.getElementById("s2");

			if (y.value == "") {

				q.style.display = "";
				return false;
			} else {
				q.style.display = "none";

			}

		}
	</script>

</body>
</html>