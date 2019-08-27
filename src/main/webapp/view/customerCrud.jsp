<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Customer Crud</title>
		<link href="css/formStyling.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
		<script type="text/javascript" src="js/customerCrud.js"></script>
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
			<li style="float: right"><a href="login">Logout</a></li>
		</ul>
	
		<nav>
			<ul class="sub-nav">
				<li><button class="subnav-button active" onclick="toggleFunction(event)" name="add">Add
						New Customer</button></li>
				<li><button class="subnav-button" onclick="toggleFunction(event)" name="update">
						Update Existing Customer</button></li>
				<li><button class="subnav-button" onclick="toggleFunction(event)" name="delete">Delete
						Existing Customer</button></li>
				<li><button class="subnav-button " onclick="toggleFunction(event)" name="view">View
						Existing Customer</button></li>
			</ul>
		</nav>
	
		<div class="content">
			<div id="div1">
				<br />
				<center>Add new Customer:</center>
				<br/>
				<form name="myform1" onSubmit="return validateform1()" action="addCustomer" method="post" modelAttribute="addCustomer">
					<label for="cusName"> Name: </label> 
					<input type="text" id="cusName" name="cusName">
					
					<label for="cusAge"> Age: </label>
					<input type="number" id="cusAge" name="cusAge">
					
					<label for="cusGender"> Gender: </label>
					<input type="text" id="cusGender" name="cusGender">
					
					<label for="cusEmail"> Email ID: </label>
					<input type="email" id="cusEmail" name="cusEmail" required>
					
					<label for="cusPassword">Create Password: </label>
					<input type="password" id="cusPassword" name="cusPassword">
					
					<label for="cusAddress"> Address: </label>
					<input type="text" id="cusAddress" name="cusAddress">
					
					<label for="cusNo"> Phone No: </label>
					<input type="number" id="cusNo" name="cusNo">
					
					<label for="cusNationality"> Nationality: </label>
					<input type="text" id="cusNationality" name="cusNationality" required>
				
					ID Proof:
					<label class="check-label"> Aadhar Card </label><input type="checkbox" name="cusIDProof">  
					<label class="check-label"> Driving License </label><input type="checkbox" name="cusIDProof"> 
					<label class="check-label"> Passport</label> <input type="checkbox" name="cusIDProof">
					<input type="submit" value="Add Customer">
				</form>
				<br/>
			</div>
	
			<div id="div2">
				<br />
				<center>Update existing Customer:</center>
				<br />
				<form name="myform2" onSubmit="return validateform2()" action="updateCustomer" modelAttribute="updateCustomerForm">
					User ID: <input type="number" name="cusID"><br> <input
						type="submit" value="Update Customer">
				</form>
			</div>
	
			<div id="div3">
				<br />
				
				<center>Delete existing Customer:</center>
				<br />
				<form name="myform3" onSubmit="return validateform3()" action="deleteCustomer" method="post" modelAttribute="deleteCus">
					User ID: <input type="number" name="cusID"> <input
						type="submit" value="Delete Customer">
				</form>
			</div>
	
			<div id="div4">
				<br />
				<center>View existing Customer:</center>
				<form name="myform4" onSubmit="return validateform4()" action="viewCustomer" method="post" modelAttribute="viewCustomer">
					<label>User ID: </label>
					<input type="number" name="cusID"> 
					<input type="submit" value="View Customer">
				</form>
			</div>
		</div>
	</body>
</html>