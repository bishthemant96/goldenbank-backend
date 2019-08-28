<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>View Transaction</title>
		<link href="css/formStyling.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
	</head>
	<body>
		<div id="header">
			<h1 id="fancyfont">The <span id="brand-key">Golden</span> Bank</h1>
		</div>
	        
	    <ul>
	  		<li><a href="employeeDash">Home</a></li>
			<li><a href="customerCrud">Customer Management</a></li>
			<li><a class="active" href="accountCrud">Account Management</a></li>
			<li><a href="loanCrud">Loan Management</a></li>
			<li><a href="transactionCrud">Transaction Management</a></li>
			<li style="float:right"><a href="login">Logout</a></li>
		</ul>
	      
		<div class="content">
		
			<br />
			<form:form modelAttribute="transactionModel">
			Transaction ID
			<form:input type="number" path="transId" readonly="true"/><br>
				Sender Account
					<form:input type="number" path="fromAcc" readonly="true"/> <br>
				Receiver Account: 
					<form:input type="text" path="toAcc" readonly="true"/> <br>
				Amount: 
					<form:input type="number" path="amount" readonly="true"/> <br>
			</form:form>
			
			<a id="backButton" href="transactionCrud">Go Back</a>
		</div> 
	</body>
</html>