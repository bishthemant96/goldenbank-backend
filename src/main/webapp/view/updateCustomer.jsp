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
<title>Account Crud</title>
<link href="css/accCrud.css" rel="stylesheet">
</head>

<body>

	<div class="top">
		<h1>
			The <span style="color: #FFBF00;">Golden</span> Bank
		</h1>
	</div>

	<ul>
		<li><a href="employeeDash">Home</a></li>
		<li><a class="active" href="customerCrud">Customer Management</a></li>
		<li><a href="accountCrud">Account Management</a></li>
		<li><a href="transaction">Transaction Management</a></li>
		<li style="float: right"><a href="index">Logout</a></li>
	</ul>

	<div class="content">

		<div id="div2">
			<br />
			<center>Update existing account:</center>
			<form:form action="updateCustomer" method="post"
				modelAttribute="updateCustomerForm">

				<table>
					<tr>
						<td>ID :</td>
						<td><form:input readonly="true" path="cusID"/></td>
					</tr>
					<tr>
						<td>Name :</td>
						<td><form:input path="cusName" /></td>
					</tr>
					<tr>
						<td>Age :</td>
						<td><form:input path="cusAge" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:input path="cusGender" /></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="cusEmail" /></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="cusAddress" /></td>
					</tr>
					<tr>
						<td>Phone No. :</td>
						<td><form:input path="cusNo" /></td>
					</tr>
					<tr>
						<td>Nationality :</td>
						<td><form:input path="cusNationality" /></td>
					</tr>
				</table>
				<input type="submit" value="Update">
			</form:form>
		</div>
	</div>
</body>
</html>
