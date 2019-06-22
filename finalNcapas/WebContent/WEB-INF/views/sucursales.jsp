<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">

<style>
	.center{
		width: 70%;
		margin-left: auto;
  		margin-right: auto;
	}

</style>

<c:forEach items="${students}" var="students">
				<tr>
					<td>${students.sName}</td>
					<td>${students.lName}</td>
					<td>${students.sAge}</td>
					<td>${students.activoDelegate}</td>
					<td><input type="button" value="Editar" onclick="location.href='${pageContext.request.contextPath}/editar?cstudent=${students.cCLiente}'"></td>
				</tr>
					
			</c:forEach>
<title>Branches</title>
</head>
<body>
	<h2>List of branches.</h2><br>
	<div class="table-responsive center">          
  		<table class="table table-hover">
    		<thead>
      			<tr>
        			<th>Name</th>
        			<th>Location</th>
        			<th>Opening</th>
        			<th>Closing</th>
        			<th>Tables</th>
        			<th>Manager</th>
        			<th>Action</th>
      			</tr>
    		</thead>
    	<tbody>
        		<c:forEach items="${sucursales}" var="sucursales">
        			<tr>
        				<td>${sucursales.nombre}</td>
        				<td>${sucursales.ubicacion}</td>
        				<td>${sucursales.horarioapertura}</td>
        				<td>${sucursales.horariocierre}</td>
        				<td>${sucursales.nmesas}</td>
        				<td>${sucursales.nomgerente}</td>
        				<td>
        				<div class="btn-group">
  							<button type="button" class="btn btn-primary">View</button>
  							<button type="button" class="btn btn-success">Edit</button>
  							<button type="button" class="btn btn-danger">Delete</button>
						</div>
        				</td>	
        			</tr>
        		</c:forEach>
    	</tbody>
  		</table>
  	</div>
</div>
</body>
</html>