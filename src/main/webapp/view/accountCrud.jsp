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
  <li><a href="customerCrud">Customer Management</a></li>
  <li><a class="active" href="accountCrud">Account Management</a></li>
  <li><a href="transaction">Transaction Management</a></li>
  <li style="float:right"><a href="index">Logout</a></li>
</ul>
      
<div class="content">
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv1"><button onclick="myFunction1()" name="add">Add New Account</button></h2><br><br>
     </div>
     
     <div id= "div1">
     <form action="addAccount" method="post" modelAttribute="AccountModel">
     Branch: <input type="text" name="branch"> <br>
     Initial Amount: <input type="number" name="amount"> <br>
     Account Type: <input type="text" name="accType"> <br>
     Account Nominee: <input type="email" name="accNominee"> <br>
     
     <input type="submit" value="Add">
     <div class ="vert-line"></div>
     </form>
     </div>
     
     
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv2"><button onclick="myFunction2()" name="update"> Update Existing Account </button></h2> <br><br>
     </div>
     
     <div id="div2">
     <form action="updateAccount" method="post" modelAttribute="AccountModel">
     Account Number: <input type="number" name="accNo" readonly><br>
     Branch: <input type="text" name="branch"> <br>
     Account Nominee: <input type="email" name="accNominee"> <br>
     <input type="submit" value="Update"> 
     <div class ="vert-line"></div>
     </form>
     </div>
     
     
     
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv3"><button onclick="myFunction3()" name="delete">Delete Existing Account</button></h2> <br><br>
     </div>
     
     <div id="div3">
     <form action="deleteAccount" method="post" modelAttribute="AccountModel">
     Account Number: <input type="number" name="accNo"><br>
     <input type="submit" value="Delete">
     <div class ="vert-line"></div> 
     </form>
     </div>
     
    
     <div class ="vert-line">
     <h2 class= "vertline" id= "showdiv4"><button onclick="myFunction4()" name="view">View Account</button></h2> <br><br>
     </div>
     
     <div id="div4">
     <form action="viewAccount" method="post" modelAttribute="AccountModel">
     Account Number: <input type="number" name="accNo"><br>
     <input type="submit" value="View">  
     <div class ="vert-line"></div>   
     </form>
     </div>
  
 </div> 
    
     
     


</body>
</html>