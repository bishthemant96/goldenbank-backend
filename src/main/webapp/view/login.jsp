<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login-TGB</title>
		<link href="css/login.css" rel="stylesheet">
	</head>
	
	<body>
		<div class="top">
			<h1>The <span style="color:#FFBF00;">Golden</span> Bank</h1>
		</div>

		<br />
      
		<div class="form">
			<form action="login" method="POST" modelAttribute="employeeModel">
				<h2>Login Into Your Account</h2>
				${Error}
				<br />
				<br />
				
				Employee ID : <br> 
				<input type="number" name="empID" size="20"> <br> 
				Password : <br> 
				<input type="password" name="empPassword" size="20"> <br> 
				<input type="submit" value="Submit">
			</form>
		</div>
		     
	</body>
</html>
