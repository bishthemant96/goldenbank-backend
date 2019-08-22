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
		<link href="css/empDash.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
	</head>
	<body>
		<div id="header">
			<h1 id="fancyfont">The <span id="brand-key">Golden</span> Bank</h1>
		</div>
		        
		<ul>
			<li><a class="active" href="employeeDash">Home</a></li>
			<li><a href="customerCrud">Customer Management</a></li>
			<li><a href="accountCrud">Account Management</a></li>
			<li><a href="transaction">Transaction Management</a></li>
			<li><a href="loanCrud">Loan Management</a></li>
			<li style="float:right"><a href="login">Logout</a></li>
		</ul>
		
		<h2>Welcome, ${name}</h2>
		<h3>Branch : ${branch}</h3>
		<h3>Designation : ${post}</h3>
	</body>
</html>