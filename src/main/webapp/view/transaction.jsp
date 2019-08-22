<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Management</title>
<link href="css/transaction.css" rel="stylesheet">
</head>
<body>

	<div class="top">
		<h1>
			The <span style="color: #FFBF00;">Golden</span> Bank
		</h1>
	</div>

	<ul>
		<li><a href="employeeDash">Home</a></li>
		<li><a href="customerCrud">Customer Management</a></li>
		<li><a href="accountCrud">Account Management</a></li>
		<li><a class="active" href="transaction">Transaction
				Management</a></li>

		<li style="float: right"><a href="index">Logout</a></li>
	</ul>

	<div id="defaultTransaction">
		<form>
			<br> <br> Make New Transaction<br> <a href=""><input
				type="button" name="add" value="Create"></a> <br> <br>
			View Transaction<br> <a href=""><input type="button"
				name="view" value="View"></a> <br>
		</form>
	</div>
	
	
	<nav>
			<ul>
				<li><button onclick="toggleTrans(event)" name="create">Create Transaction</button></li>
				<li><button onclick="toggleTrans(event)" name="read">Read Transaction</button></li>
			</ul>
		</nav>
	
	
	

	<div id="addsTrans">

		${message}
		<form action="addTransaction" method="POST"	modelAttribute="addTransaction">
			From Account : <input type="number" name="fromAcc" /> <br> To
			Account : <input type="number" name="toAcc"> <br>
			Amount: <input type="number" name="amount"> <br>
			<input type="submit" value="Create Transaction">
		</form>
	</div>

	<div id="readTrans">

		<form action="readTransaction" method="POST"  modelAttribute="readTransaction">
			Transaction ID : <input type="number" name="transId" /> <br>
			<input type="submit" value="Search Transaction">
		</form>
	</div>

  
</body>
</html>