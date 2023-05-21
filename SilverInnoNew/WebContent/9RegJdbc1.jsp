<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="10addtodb2.jsp">
First Name:<input type="text" name="fn"><br><br>
Last Name:<input type="text" name="ln"><br><br>
Address:<textarea name="add"></textarea><br><br>
State:<select name="st">
		<option>Gujrat</option>
		<option>Maharashtra</option>
		<option>West Bengal</option>
	  </select><br><br>
Country:<select name="cry">
		<option>India</option>
		<option>Nepal</option>
		<option>China</option>
		</select><br><br>
Gender:<input type="radio" value="male" name="gender">Male
		<input type="radio" value="female" name="gender">Female<br><br>
		
Hobbies:<input type="checkbox" value="Racing" name="hby">Racing
		<input type="checkbox" value="Traveling" name="hby">Traveling
		<input type="checkbox" value="Reading" name="hby">Reading
		<input type="checkbox"  value="Wrestling" name="hby">Wrestling<br><br>
		
		<button>Submit</button>
		</form>
</body>
</html>