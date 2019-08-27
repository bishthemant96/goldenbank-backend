<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Loan</title>
<link href="css/formStyling.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap"
	rel="stylesheet">
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
		<li><a class="active" href="loanCrud">Loan Management</a></li>
		<li><a href="transactionCrud">Transaction Management</a></li>
		<li style="float: right"><a href="index">Logout</a></li>
	</ul>

	<div class="content">
		<br />
		<form:form modelAttribute="loanModel">
			Loan Account No:
                    <form:input type="number" path="loanAccNo"
				readonly="true" />
			<br>
				Customer ID:
					<form:input type="number" path="cusID" readonly="true" />
			<br>
				Branch: 
					<form:input type="text" path="branch" readonly="true" />
			<br>
				Loan Amount: 
					<form:input type="number" path="amount" readonly="true" />
			<br>
				Loan Type: 
					<form:input type="text" path="loanType" readonly="true" />
			<br>
		</form:form>
		<a id="backButton" href="loanCrud">Go Back</a>
	</div>
</body>
</html>