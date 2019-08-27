<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Crud</title>
<link href="css/formStyling.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap"
	rel="stylesheet">

<script type="text/javascript" src="js/customerCrud.js"></script>
	
</head>

<body>
	<div id="header">
		<h1 id="fancyfont">
			The <span id="brand-key">Golden</span> Bank
		</h1>
	</div>

	<ul>
		<li><a href="employeeDash">Home</a></li>
		<li><a class="active" href="customerCrud">Customer Management</a></li>
		<li><a href="accountCrud">Account Management</a></li>
		<li><a href="loanCrud">Loan Management</a></li>
		<li><a href="transactionCrud">Transaction Management</a></li>
		<li style="float: right"><a href="index">Logout</a></li>
	</ul>

	<div class="content">
		<br />
		<form:form action="updateCustomer" method="post"
			modelAttribute="updateCustomerForm" name="myform1" onSubmit="return validateform1()">
						ID :
						<form:input type="number" readonly="true" path="cusID" /><br>

						Name :
						<form:input type="text" path="cusName" /><br>

						Age :
						<form:input type="number" path="cusAge" /><br>

						Gender :
						<form:input type="text" path="cusGender" /><br>

						Email :
						<form:input type="email" path="cusEmail" /><br>

						Address :
						<form:input type="text" path="cusAddress" /><br>

						Phone No. :
						<form:input type="number" path="cusNo" /><br>

						Nationality :
						<form:input type="text" path="cusNationality" /><br>
			<input type="submit" value="Update">
		</form:form>
	</div>
</body>
</html>
