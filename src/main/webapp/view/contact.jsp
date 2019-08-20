<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact-TGB</title>
		<link href="css/contact.css" rel="stylesheet">
</head>
<body>

        <div class="top">
  <h1>The <span style="color:#FFBF00;">Golden</span> Bank</h1>
</div>
        
        <ul>
  <li><a href="index">Home</a></li>
  <li><a href="login">Login</a></li>
  <li style="float:right"><a class="active" href="contact">Contact</a></li>
</ul>
      
       <div class="contact">
      
      <h1>Reach Us</h1>
      <p>
      Ahmed Raza  99xxxxxx77 <br>
      Hemant Bisht 99xxxxxx77 <br>
      Bharat Gupta  99xxxxxx77 <br>
      Rishabh Omar  99xxxxxx77 </p>
      </div> 
      
      <div class ="vert-line">
<h2 class= "vertline" id= "showdiv1"></h2>
</div>
      
  <div class="second">    
  <form action="query" id="conform">
  Your Email Id: <input type="email" name="email" size="20">
  <input type="submit" value="Submit">
</form>
<br>
<textarea class="" rows="8" cols="30" name="comment" form="conform">
Enter text here...</textarea>
</div>
        


</body>
</html>
