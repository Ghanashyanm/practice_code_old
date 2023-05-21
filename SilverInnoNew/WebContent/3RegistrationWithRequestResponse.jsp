<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="4getRequest.jsp">
First Name:<input type="text" name="firstname"><br><br>
Last Name:<input type="text" name="lastname"><br><br>
Address:

<textarea name="address"></textarea><br><br>
Country:<select name="country">
			<option>India</option>
			<option>China</option>
			<option>Pakistan</option>
			<option>Bangladesh</option>
		</select>
		<br><br>
		
State:<select name="state">
		<option>Gujrat</option>
		<option>Maharashtra</option>
		<option>Tamilnadu</option>
	</select>
	<br><br>
Gender:<input type="radio" value="male" name="gender">
			<label for="male">Male</label>

		<input type="radio" value="female" name="gender">
		<label for="female">Female</label>
		<input type="radio" value="other" name="gender">
		<label for="other">Other</label>
		<br><br>
		
Hobbies:<input type="checkbox"  value="Racing" name="hby" >
	Racing<br>
	<input type="checkbox"  value="Reading" name="hby">
	Reading<br>
	<input type="checkbox"  value="Traveling" name="hby" >
	Traveling<br>
	<input type="checkbox"  value="Wrestling" name="hby">
	Wrestling
		
		<br><br>
	
<input type="submit" value="submit">
		
		
			
</form>
</body>
</html>