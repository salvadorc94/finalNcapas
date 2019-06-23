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

			
<title>Branches</title>
</head>
<body>
	<h2 id="prueba">List of Employees from ${sucursal.nombre}</h2> <input  class="btn btn-info" type="button" value="Back" onclick="location.href='${pageContext.request.contextPath}/sucursales'">
		<input  class="btn btn-success" type="button" value="New Employee" onclick="location.href='${pageContext.request.contextPath}/ne?cbr=${sucursal.codigo}'"> <br>
	<div class="table-responsive center">          
  		<table class="table table-hover">
    		<thead>
      			<tr>
        			<th>Name</th>
        			<th>Age</th>
        			<th>Gender</th>
        			<th>Status</th>
        			<th>Action</th>
      			</tr>
    		</thead>
    	<tbody>
        		<c:forEach items="${empleados}" var="empleados">
        			<tr>
        				<td>${empleados.nombre}</td>
        				<td>${empleados.edad}</td>
        				<td>${empleados.genero}</td>
        				<td>${empleados.estadoDelegate}</td>
        				<td>
        				<div class="btn-group">
  							<input type="button" class="btn btn-success" value="Edit" onclick="location.href='${pageContext.request.contextPath}/ee?cbr=${empleados.codigo}&cb=${sucursal.codigo}'"/>
  							<input type="button" class="btn btn-danger" value="Delete" onclick="del('${empleados.codigo}','${pageContext.request.contextPath}')"/>
						</div>
        				</td>	
        			</tr>
        		</c:forEach>
    	</tbody>
  		</table>
  	</div>
<script type='text/javascript'>
function del(c,f) {
  var box = confirm("Are you sure you want to delete Employee?")
  var a = ${sucursal.codigo}
  if(box == true){
	  var local = "http://localhost:8080/"
	  var url = local.concat(f,"/dele?cbr=",c,"&cb=",a)
	  location.href = url
  }
}
</script>
</body>
</html>