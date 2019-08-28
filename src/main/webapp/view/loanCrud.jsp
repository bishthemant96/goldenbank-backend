<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Management</title>
<link href="css/formStyling.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap"
	rel="stylesheet">
<script type="text/javascript" src="js/loanCrud.js"></script>
</head>

<body>

	<input type="hidden" id="status" value='${loanModel.status}' />
	<input type="hidden" id="error" value='${loanModel.error}' />
	<input type="hidden" id="loanAccNo" value='${loanModel.loanAccNo}' />

	<div id="header">
		<h1 id="fancyfont">
			The <span id="brand-key">Golden</span> Bank
		</h1>
	</div>

	<ul>
		<li><a href="employeeDash">Home</a></li>
		<li><a href="customerCrud">Customer Management</a></li>
		<li><a href="accountCrud">Account Management</a></li>
		<li><a class="active" href="loanCrud">Loan Management</a></li>
		<li><a href="transactionCrud">Transaction Management</a></li>
		<li style="float: right"><a href="login">Logout</a></li>
	</ul>

	<nav>
		<ul class="sub-nav">
			<li>
				<button class="subnav-button active" onclick="toggleFunction(event)"
					name="add">Create Loan</button>
			</li>
			<li>
				<button class="subnav-button" onclick="toggleFunction(event)"
					name="delete">Close Loan</button>
			</li>
			<li>
				<button class="subnav-button" onclick="toggleFunction(event)"
					name="view">View Current Loan</button>
			</li>
		</ul>
	</nav>

	<div class="content">
		<div id="div1">
			<br />
			<center>Create Loan:</center>
			<br />
			<form name="myform1" onSubmit="return validateform1()"
				action="createLoan" method="POST" modelAttribute="loanModel">
				Customer ID: <input type="number" name="cusID" required /> <br>
				Branch: <input type="text" name="branch" required /> <br>
				Amount: <input type="number" name="amount" required /> <br>
				Loan Type: <select name="cusGender" id="cusGender" required>
					<option value="Personal Loan">Personal Loan</option>
					<option value="Home Loan">Home Loan</option>
					<option value="Car Loan">Car Loan</option>
					<option value="Education Loan">Education Loan</option>
				</select> <br> <input type="submit" value="Create">

			</form>
		</div>

		<div id="div3">
			<br />
			<center>Close existing Loan:</center>
			<br />
			<form name="myform2" onSubmit="return validateform2()"
				action="deleteLoan" method="post" modelAttribute="loanModel">
				Loan Account Number: <input type="number" name="loanAccNo" required /><br>
				<input type="submit" value="Delete">
			</form>
		</div>

		<div id="div4">
			<br />
			<center>View existing Loan:</center>
			<br />
			<form name="myform3" onSubmit="return validateform3()"
				action="readLoan" method="GET" modelAttribute="loanModel">
				<label> Loan Account Number: </label> <input type="number"
					id="LoanAccNo" name="loanAccNo" required /><br> <input
					type="submit" value="View">
			</form>
		</div>
	</div>
</body>
</html>