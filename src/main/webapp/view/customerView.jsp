<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<li><a href="loan">Loan Management</a></li>
		<li><a href="transaction">Transaction Management</a></li>
		<li style="float: right"><a href="index">Logout</a></li>
	</ul>

	<div class="content">

		<div id="div2">
			<br />
			<center>View existing Customer:</center>
			<form modelAttribute="viewCustomer" method="post">
				Customer ID:
				<c:out value=" ${viewCustomer.getCusID()}" />
				<br> Customer Name:
				<c:out value="${viewCustomer.getCusName()}" />
				<br> Age:
				<c:out value="${viewCustomer.getCusAge()}" />
				<br> Gender:
				<c:out value="${viewCustomer.getCusGender()}" />
				<br> Phone No:
				<c:out value="${viewCustomer.getCusNo()}" />
				<br> Email:
				<c:out value="${viewCustomer.getCusEmail()}" />
				<br> Address:
				<c:out value="${viewCustomer.getCusAddress()}" />
				<br> Nationality:
				<c:out value="${viewCustomer.getCusNationality()}" />
				<br>
			</form>
			<a id="backButton" href="customerCrud">Go Back</a>
		</div>
	</div>
</body>
</html>
