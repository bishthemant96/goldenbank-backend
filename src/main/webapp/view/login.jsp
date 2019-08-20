<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login-TGB</title>
		<link href="css/login.css" rel="stylesheet">
</head>
<body>

        <div class="top">
  <h1>The <span style="color:#FFBF00;">Golden</span> Bank</h1>
</div>
        
        <ul>
  <li><a href="index">Home</a></li>
  <li><a class="active" href="login">Login</a></li>
  <li style="float:right"><a href="contact">Contact</a></li>
</ul> <br>
      
      <div class="form">
      <form action="signin" method="POST">
      <h1>Login Into Your Account</h1>
      
      Employee ID : <br> <input type="number" name="empID" size="20"> <br> 
      Password : <br> <input type="password" name="empPassword" size="20"> <br> 
      <input type="submit" value="Submit">
      </form>
      </div>     
            


</body>
</html>
