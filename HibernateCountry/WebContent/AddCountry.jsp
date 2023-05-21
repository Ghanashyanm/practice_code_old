<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="countryController?flag=insert" method="post" onsubmit="return fn()">
Country:<input type="text" name="country" id="country"><span style="display: none;" id="s1">Please Enter Country Name</span><br>
<input type="submit" value="Submit">
</form>
<script type="text/javascript">

var c = document.getElementById("country");
var v = document.getElementById("s1");

	function fn()
	{
			if(c.value == "")
				{
					v.style.display = "";
					return false;
				}
			else
				{
					v.style.display = "none";
				}
	}
</script>
</body>
</html>