<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Update Record</title>
		<link href="css/formStyling.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
		<script type="text/javascript" src="js/accountCrud.js"></script>
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
			<form:form action="UpdateAccount"  method ="post" name="fullUpdateAccountForm" onsubmit="return validateFullUpdateAccountForm()" modelAttribute="accModel">
				Account No.:
					<form:input type="number" path="accNo" name="accNo" readonly="true"/> <br>
				Customer ID:
					<form:input type="number" path="cusID" name="cusID" readonly="true"/> <br>
				Branch: 
					<form:input type="text" path="branch"  name="branch" required="required"/> <br>
				Amount: 
					<form:input type="number" path="amount" name="amount" required="required"/> <br>
				Account Type: 
		            <form:select path="accType" name="accType" required="required">
             			<form:option value="Savings Account">Savings Account</form:option>
						<form:option value="Current Account">Current Account</form:option>
     				</form:select>
				Account Nominee: 
					<form:input type="text" path="accNominee" name="accNominee" required="required"/> <br>
					
					<form:input type="submit" path="" value="submit"/>
			</form:form>
		</div>
	</body>
</html>