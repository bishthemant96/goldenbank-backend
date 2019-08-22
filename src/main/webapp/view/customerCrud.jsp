<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Crud</title>
<link href="css/accCrud.css" rel="stylesheet">
<script type="text/javascript" src="js/customerCrud.js"></script>
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
		<li style="float: right"><a href="login">Logout</a></li>
	</ul>

	<nav>
		<ul>
			<li><button onclick="toggleFunction(event)" name="add">Add
					New Customer</button></li>
			<li><button onclick="toggleFunction(event)" name="update">
					Update Existing Customer</button></li>
			<li><button onclick="toggleFunction(event)" name="delete">Delete
					Existing Customer</button></li>
			<li><button onclick="toggleFunction(event)" name="view">View
					Existing Customer</button></li>
		</ul>
	</nav>

	<div class="content">
		<div id="div1">
			<br />
			<center>Add new Customer:</center>
			<form action="addCustomer" method="post" modelAttribute="addCustomer">
				Name: <input type="text" name="cusName"> <br> Age: <input
					type="number" name="cusAge"> <br> Gender: <input
					type="text" name="cusGender"> <br> Email ID: <input
					type="email" name="cusEmail"> <br> Create Password: <input
					type="password" name="cusPassword"><br> Address: <input
					type="text" name="cusAddress"><br> Phone No: <input
					type="number" name="cusNo"><br> Nationality: <input
					type="text" name="cusNationality"><br> ID Proof: <br>
				<input type="checkbox" name="cusIDProof"> Aadhar Card<br>
				<input type="checkbox" name="cusIDProof"> Driving License<br>
				<input type="checkbox" name="cusIDProof">Passport<br> <br>
				<input type="submit" value="Add">
			</form>
		</div>

		<div id="div2">
			<br />
			<center>Update existing Customer:</center>
			<form action="updateCustomer" modelAttribute="updateCustomerForm">
				User ID: <input type="number" name="cusID"><br> <input
					type="submit" value="Update">
			</form>
		</div>

		<div id="div3">
			<br />
			<center>Delete existing Customer:</center>
			<form action="deleteCustomer" method="post"
				modelAttribute="deleteCus">
				User ID: <input type="number" name="cusID"> <input
					type="submit" value="Delete">
			</form>
		</div>

		<div id="div4">
			<br />
			<h3>${message}</h3><br>
			<center>View existing Customer:</center>
			<form action="viewCustomer" method="post"
				modelAttribute="viewCustomer">
				User ID: <input type="number" name="cusID"> <input
					type="submit" value="View">
			</form>
		</div>
	</div>
</body>
</html>