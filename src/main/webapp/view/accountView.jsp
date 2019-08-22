<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link href="css/accCrud.css" rel="stylesheet">
	</head>
	<body>
		<div class="top">
			<h1>The <span style="color:#FFBF00;">Golden</span> Bank</h1>
		</div>
	        
	    <ul>
	  		<li><a href="employeeDash">Home</a></li>
			<li><a href="customerCrud">Customer Management</a></li>
			<li><a class="active" href="accountCrud">Account Management</a></li>
			<li><a href="transaction">Transaction Management</a></li>
			<li style="float:right"><a href="index">Logout</a></li>
		</ul>
	      
		<div class="content">
			<br />
			<form modelAttribute=${accModel}>
				Customer ID:
					<input type="number" name="cusID" readOnly/> <br>
				Branch: 
					<input type="text" name="branch" readOnly/> <br>
				Initial Amount: 
					<input type="number" name="amount" readOnly/> <br>
				Account Type: 
					<input type="text" name="accType" readOnly/> <br>
				Account Nominee: 
					<input type="text" name="accNominee" readOnly/> <br>
			</form>
		</div> 
	</body>
</html>