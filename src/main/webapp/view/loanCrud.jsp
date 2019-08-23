<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Loan Management</title>
		<link href="css/formStyling.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
		<script type="text/javascript" src="js/loanCrud.js"></script>
	</head>
	
	<body>
		<div id="header">
			<h1 id="fancyfont">The <span id="brand-key">Golden</span> Bank</h1>
		</div>
	        
	    <ul>
	  		<li><a href="employeeDash">Home</a></li>
			<li><a href="customerCrud">Customer Management</a></li>
			<li><a href="accountCrud">Account Management</a></li>
			<li><a class="active" href="loan">Loan Management</a></li>
			<li><a href="transaction">Transaction Management</a></li>
			<li style="float:right"><a href="login">Logout</a></li>
		</ul>
		
		<nav>
			<ul class="sub-nav">
				<li>
					<button class="subnav-button active" onclick="toggleFunction(event)" name="add">
						Create Loan
					</button>
				</li>
				<li>
					<button class="subnav-button" onclick="toggleFunction(event)" name="delete">
					Close Loan
					</button>
				</li>
				<li>
					<button class="subnav-button" onclick="toggleFunction(event)" name="view">
					View Current Loan
					</button>
				</li>
			</ul>
		</nav>
	      
		<div class="content">
			<div id= "div1">
				<br />
				<center>Create Loan:</center>
				<br/>
				<form action="createLoan" method="POST" modelAttribute="loanModel">
					Customer ID:
						<input type="number" name="cusID"/> <br>
					Branch: 
						<input type="text" name="branch"> <br>
					Amount: 
						<input type="number" name="amount"> <br>
					Loan Type: 
						<input type="text" name="loanType"> <br>
						<input type="submit" value="Create">
						
				</form>
			</div>
	     
			<div id="div3">
				<br />
				<center>Close existing Loan:</center>
				<br/>
				<form action="deleteLoan" method="post" modelAttribute="loanModel">
					Loan Account Number: 
						<input type="number" name="loanAccNo"><br>
						<input type="submit" value="Delete">
				</form>
			</div>
	     
			<div id="div4">
				<br />
				<center>View existing Loan:</center>
				<br/>
				<form action="readLoan" method="GET" modelAttribute="loanModel">
					<label> Loan Account Number: </label> 
					<input type="number" id="LoanAccNo" name="loanAccNo"><br>
					<input type="submit" value="View"> 
				</form>
			</div>
		</div> 
	</body>
</html>