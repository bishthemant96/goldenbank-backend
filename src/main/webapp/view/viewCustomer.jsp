<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form modelAttribute="viewCustomer">
Customer ID: ${cusID} <br>
Customer Name: ${Name}<br>
Age: ${age} <br>
Address: ${address} <br>
Gender: ${gender}  <br>
Email: ${email}<br>
</form>
</body>
</html>