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
		

<script language="JavaScript">
function myFunction1() {
    var x = document.getElementById('div1');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}

function myFunction2() {
    var x = document.getElementById('div2');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}

function myFunction3() {
    var x = document.getElementById('div3');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}

function myFunction4() {
    var x = document.getElementById('div4');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}

function main()
{
    $('#showdiv1').on('click', function() 
	{
        $('#div1').toggle();
    });
	
	
    $('#showdiv2').on('click', function() 
	{
        $('#div2').toggle();
    });
	
	
	$('#showdiv3').on('click', function() 
	{
        $('#div3').toggle();
    });

	$('#showdiv4').on('click', function() 
	{
		$('#div4').toggle();
    });
}
$(document).ready(main);

 </script>

		
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


<div class="content">
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv1"><button onclick="myFunction1()" name="add">Add Customer</button></h2><br><br>
     </div>
     ${message} <br>
     <div id= "div1">
     <form action="addCustomer" method="post" modelAttribute="addCustomer">
     Name: <input type="text" name="cusName"> <br>
     Age: <input type="number" name="cusAge"> <br>
     Gender: <input type="text" name="cusGender"> <br>
     Email ID: <input type="email" name="cusEmail"> <br>
     Create Password: <input type="password" name="cusPassword"><br>
     
     Address: <input type="text" name="cusAddress"><br>
     Phone No: <input type="number" name="cusNo"><br>
     Nationality: <input type="text" name="cusNationality"><br>
     ID Proof: <br>
     <input type="checkbox" name="cusIDProof"> Aadhar Card<br>
     <input type="checkbox" name="cusIDProof"> Driving License<br>
     <input type="checkbox" name="cusIDProof">Passport<br><br>
     
     
     <input type="submit" value="Add">
     <div class ="vert-line"></div>
     </form>
     </div>
     
     
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv2"><button onclick="myFunction2()" name="update"> Update Customer </button></h2> <br><br>
     </div>
     				${message1} <br>
     
     <div id="div2">
     <form action="updateCustomerForm" method="post" modelAttribute="updateCustomerForm">
     User ID: <input type="number" name="cusId"><br>
    
     <input type="submit" value="Update"> 
     <div class ="vert-line"></div>
     </form>
     </div>
     
     
     
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv3"><button onclick="myFunction3()" name="delete">Delete Customer</button></h2> <br><br>
     </div>
     ${message2} <br>
     <div id="div3">
     <form action="deleteCustomer" method="post" modelAttribute="deleteCus">
     User ID: <input type="number" name="cusID">
     <input type="submit" value="Delete">
     <div class ="vert-line"></div> 
     </form>
     </div>
     
    
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv4"><button onclick="myFunction4()" name="view">View Customer</button></h2> <br><br>
     </div>
     
     <div id="div4">
     <form action="viewCustomer" method="post" modelAttribute="viewCustomer">
     User ID: <input type="number" name="cusId">
     <input type="submit" value="View">  
     <div class ="vert-line"></div>   
     </form>
     </div>
  
 </div> 

</body>
</html>