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

<title>Edit branch</title>
</head>
<body>

<div class="card">
<div class="center">
<h1>Edit Branch</h1>

<form:form  action="${pageContext.request.contextPath}/edit" method="POST" modelAttribute="sucursal">
		<form:input type="hidden" name="codigo" path="codigo"/>
		<label>Name: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		<form:errors path="nombre" cssStyle="color: #ff0000;"/><br>
		
		<label>Location: </label>
		<form:input type="text" name="ubicacion" path="ubicacion"/><br>
		<form:errors path="ubicacion" cssStyle="color: #ff0000;"/><br>
		
		<label>Opening: </label>
		<form:input type="text" name="horarioapertura" path="horarioapertura"/><br>
		<form:errors path="horarioapertura" cssStyle="color: #ff0000;"/><br>
		
		<label>Closing: </label>
		<form:input type="text" name="horariocierre" path="horariocierre"/><br>
		<form:errors path="horariocierre" cssStyle="color: #ff0000;"/><br>
		
		<label>Number of tables: </label>
		<form:input type="number" name="nmesas" path="nmesas"/><br>
		<form:errors path="nmesas" cssStyle="color: #ff0000;"/><br>
		
		<label>Manager: </label>
		<form:input type="text" name="nomgerente" path="nomgerente"/><br>
		<form:errors path="nomgerente" cssStyle="color: #ff0000;"/><br>
		
		<input type="submit" value="Save" class="btn btn-success"><br> 
	</form:form>
</div>
</div>

</body>
</html>