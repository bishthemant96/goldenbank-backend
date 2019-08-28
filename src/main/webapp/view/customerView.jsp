<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer CRUD</title>
<link href="css/formStyling.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
</head>
	<body>
		<div id="header">
			<h1 id="fancyfont">The <span id="brand-key">Golden</span> Bank</h1>
		</div>

	<ul>
		<li><a href="employeeDash">Home</a></li>
		<li><a class="active" href="customerCrud">Customer Management</a></li>
		<li><a href="accountCrud">Account Management</a></li>
		<li><a href="loanCrud">Loan Management</a></li>
		<li><a href="transactionCrud">Transaction Management</a></li>
		<li style="float: right"><a href="login">Logout</a></li>
	</ul>
		
		<div class="content">
			<br />
			<form:form modelAttribute="customerModel">
				Customer ID:
	                    <form:input type="number" path="cusID"
					readonly="true" />
				<br>
					Customer Name:
						<form:input type="text" path="cusName" readonly="true" />
				<br>
					Age: 
						<form:input type="number" path="cusAge" readonly="true" />
				<br>
					Phone No: 
						<form:input type="number" path="cusNo" readonly="true" />
				<br>
					Email: 
						<form:input type="text" path="cusEmail" readonly="true" />
				<br>
					Address: 
						<form:input type="text" path="cusAddress" readonly="true" />
				<br>
					Nationality: 
						<form:input type="text" path="cusNationality" readonly="true" />
				<br>
			</form:form>
			<a id="backButton" href="customerCrud">Go Back</a>
		</div>
	</body>
</html>
