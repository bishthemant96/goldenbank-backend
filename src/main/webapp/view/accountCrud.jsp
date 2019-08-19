<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Crud</title>
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
      
     <form>
     <br><br>
     Create New Account<br> <a href=""><input type="button" name="add" value="Create"></a> <br><br>
     Delete Existing Account<br> <a href=""><input type="button" name="delete" value="Delete"></a> <br><br>
     Update Account Info<br> <a href=""><input type="button" name="update" value="Update"></a> <br><br>
     View Account Info<br> <a href=""><input type="button" name="view" value="View"></a> <br>
     </form>
     
     


</body>
</html>