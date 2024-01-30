<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ERROR OCCURED</title>
<script>
		function myFunction() {
		  alert("GIVEN MAIL ID IS ALREADY EXISTS. TRY ANOTHER :)");
		 // window.location.href = "localhost:8080/Teddy/index.html";
		 // returnUrl = window.location.protocol + "//" + window.location.host + localhost:8080/Teddy/index.html""
		  window.history.back();
		}
</script>
</head>
<body onload='myFunction()'>
</body>
