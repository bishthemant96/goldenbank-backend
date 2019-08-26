<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	isELIgnored="false"%>
	
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Transaction Management</title>
		<link href="css/formStyling.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
		<script type="text/javascript" src="js/transactionCrud.js"></script>
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
			<li><a href="loanCrud">Loan Management</a></li>
			<li><a class="active" href="transactionCrud">Transaction Management</a></li>
			<li style="float: right"><a href="index">Logout</a></li>
		</ul>
	
		<nav>
			<ul class="sub-nav">
				<li>
					<button class="subnav-button active" onclick="toggleFunction(event)"
						name="add">Create Transaction</button>
				</li>
				<li>
					<button class="subnav-button" onclick="toggleFunction(event)"
						name="view">View Transaction</button>
				</li>
			</ul>
		</nav>
	
		<div class="content">
			<div id="div1">
				<br />
				<center>Create Transaction</center>
				<br /></br>
			
				<form action="addTransaction" method="POST" modelAttribute="transactionModel">
					From Account : <input type="number" name="fromAcc" /> <br> To
					Account : <input type="number" name="toAcc"> <br>
					Amount: <input type="number" name="amount"> <br> <input
						type="submit" value="Create Transaction">
				</form>
			</div>
	
			<div id="div2">
				<br />
				<center>View Transaction</center>
				<br />
				<form action="readTransaction" method="GET" modelAttribute="transactionModel">
					Transaction ID : <input type="number" name="transId" /> <br> <input
						type="submit" value="Search Transaction">
				</form>
			</div>
		</div>
	</body>
</html>


