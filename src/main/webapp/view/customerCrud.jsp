<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer CRUD</title>
		<link href="css/cusCrud.css" rel="stylesheet">
</head>
<body>

        <div class="top">
  <h1>The <span style="color:#FFBF00;">Golden</span> Bank</h1>
</div>
        
        <ul>
  <li><a href="employeeDash">Home</a></li>
  <li><a class="active" href="customerCrud">Customer Management</a></li>
  <li><a href="accountCrud">Account Management</a></li>
    <li><a href="transaction">Transaction Management</a></li>
  
  <li style="float:right"><a href="index">Logout</a></li>
</ul>
     <form>
     <br><br>
     Create New Entry<br> <a href="newCustomer"><input type="button" name="add" value="Add Customer"></a> <br><br>
     Delete Existing Record <br> <a href="deleteCustomer"><input type="button" name="delete" value="Delete Customer"></a> <br><br>
     Edit/Update Record<br> <a href="editCustomer"><input type="button" name="update" value="Update Customer"></a> <br><br>
     Read/View Record<br> <a href="viewCustomer"><input type="button" name="view" value="View Customer"></a> <br>
     </form>
  

</body>
</html>