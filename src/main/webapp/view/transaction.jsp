<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Management</title>
		<link href="css/transaction.css" rel="stylesheet">
</head>
<body>

        <div class="top">
  <h1>The <span style="color:#FFBF00;">Golden</span> Bank</h1>
</div>
        
        <ul>
  <li><a href="employeeDash">Home</a></li>
  <li><a href="customerCrud">Customer Management</a></li>
  <li><a href="accountCrud">Account Management</a></li>
    <li><a class="active" href="transaction">Transaction Management</a></li>
  
  <li style="float:right"><a href="login">Logout</a></li>
</ul>
      
     <form>
     <br><br>
     Make New Transaction<br> <a href=""><input type="button" name="add" value="Create"></a> <br><br>
     View Transaction<br> <a href=""><input type="button" name="view" value="View"></a> <br>
     </form>

  

</body>
</html>