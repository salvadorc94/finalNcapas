<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">

<style>

.card {
  /* Add shadows to create the "card" effect */
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  width: 50%;
  padding: 5px;
  margin-top: 10px;
  margin-left: auto;
  margin-right: auto;
}

/* On mouse-over, add a deeper shadow */
.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
 } 
.center{
	  text-align: center;
}
</style>

<title>Welcome</title>
</head>
<body>
<div class="card">
<div class="center">
<h1>Enter your credentials:</h1>

<form:form  action="${pageContext.request.contextPath}/login" method="POST" modelAttribute="usuario">
		<label>Enter your username: </label>
		<form:input type="text" name="usuario" path="usuario"/><br>
		<form:errors path="usuario" cssStyle="color: #ff0000;"/><br>
		
		<label>Enter your password: </label>
		<form:input type="password" name="clave" path="clave"/><br>
		<form:errors path="clave" cssStyle="color: #ff0000;"/><br>
		
		<input type="submit" value="Sign In"><br>
		<label>${mal}</label>
	</form:form>
</div>
</div>
</body>
</html>