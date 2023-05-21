<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

	<form action="jdbcsrev2" method="post">
				
					Registration form<br><br>
				
				First name:
				<input type="text" name="fn" ><br>
			
			
				Last name:
				<input type="text" name="ln" ><br>
			

			
				username:
				<input type="text" name="un" ><br>
			

			
				Password:
				<input type="password" name="pw" ><br>
	
				country:
				<select name="country" required><br>
						<option value="india">india</option>
						<option value="aus">australia</option>
						<option value="pak">pakistan</option>
						<option value="lanka">lanka</option>
						<option value="nz">NZ</option>
				</select>
		<br>

			Address:
				<textArea name="address" rows="3"></textArea><br>

			gender:
				<input type="radio" name="gender" value="male" >male
				<input type="radio" name="gender" value="female" >female
			<br>
				Hobbies
				<input type="checkbox" value="cricket" name="hobby">cricket
				<input type="checkbox" value="Gaming" name="hobby">Gaming
				<input type="checkbox" value="Coding" name="hobby">Coding
				<input type="checkbox" value="Dance" name="hobby">Dance
				<input type="checkbox" value="Music" name="hobby">Music
				<br>
			
			
				<button>Submit</button>
			

		
	</form>
</body>
</html>