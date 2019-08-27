<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Golden Bank</title>
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
		<link href="css/login.css" rel="stylesheet">
		<script type="text/javascript" src="js/login.js"></script>
	</head>
	
	<body>
		<div id="header">
			<h1 id="fancyfont">The <span id="brand-key">Golden</span> Bank</h1>
		</div>

		<br />
      
		<div class="form">
			<h4 id="fancyfont">Login Into Your Account</h4>
			<form name="myform" action="login" method="POST" modelAttribute="employeeModel" onSubmit="return validateform()">
				${Error}	
				
				<table>
					<tr>
						<td><label> Employee ID : </label></td>
						<td><input type="number" name="empID" size="20"></td>
					</tr>
					<tr>
						<td><label> Password : </label></td>
						<td><input type="password" name="empPassword" size="20"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Submit"></td>
					</tr>
				</table>
			</form>
		</div>
		     
	</body>
</html>
