<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Crud</title>
<link href="css/formStyling.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap"
	rel="stylesheet">
<script type="text/javascript" src="js/loanCrud.js"></script>
</head>

<body>
	<div id="header">
		<h1 id="fancyfont">
			The <span id="brand-key">Golden</span> Bank
		</h1>
	</div>

	<ul>
		<li><a href="employeeDash">Home</a></li>
		<li><a href="customerCrud">Customer Management</a></li>
		<li><a href="accountCrud">Account Management</a></li>
		<li><a href="transaction">Transaction Management</a></li>
		<li><a class="active" href="loanCrud">Loan Management</a></li>
		<li style="float: right"><a href="login">Logout</a></li>
	</ul>

	<nav>
		<ul class="sub-nav">
			<li><button class="subnav-button"
					onclick="toggleFunction(event)" name="add">Add New Loan</button></li>
			<li><button class="subnav-button active"
					onclick="toggleFunction(event)" name="view">View Existing
					Loan</button></li>
		</ul>
	</nav>

	<div class="content">
		<div id="div1">
			<br />
			<center>Add new Loan:</center>
			<br />
			<form action="" method="post" modelAttribute="">
				<label for="cusID"> Customer ID:</label> <input type="number" id="cusID" name="cusID">
			    <label for="branch"> Branch: </label> <input type="text" id="branch" name="branch">
				<label for="amount"> Amount: </label> <input type="number" id="amount" name="amount">
				<label for="loanType"> Loan Type:</label> <input type="email" id="loanType" name="loanType">
				<input type="submit" value="Add Loan">
			</form>
			<br />
		</div>

		<div id="div2">
			<br />
			<center>View Existing Loan:</center>
			<br />
			<form action="" modelAttribute="">
				Loan Account No: <input type="number" name="loanAccNo"><br> <input
					type="submit" value="View Loan">
			</form>
		</div>
	</div>
</body>
</html>