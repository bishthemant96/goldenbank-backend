<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateCustomer" method="post" modelAttribute="updateCustomer">
    Name: <input type="text" name="cusName"><br>
    Age: <input type="number" name="cusAge"><br>
    Gender: <input type="text" name="cusGender"> <br>
    Email ID: <input type="email" name="cusEmail"> <br>
    Address: <input type="text" name="cusAddress"><br>
    Phone No: <input type="number" name="cusNo"><br>
    Nationality: <input type="text" name="cusNationality"><br>
    <input type="submit" value="Update">
    </form>


</body>
</html>