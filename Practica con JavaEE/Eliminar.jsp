<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestión para eliminar un Estudiante: </title>
</head>
<body>
  <h3>Control de Estudios PEPA</h3>
	<form action="resultado3Form.jsp" method="get">
		<br><br>
	    Ingrese codigo del estudiante para eliminarlo de la base de datos:<br><br>
		
		Codigo del estudiante: <br>
		<input type="text" name= "codigoEST" required ="required" > <br>
		<br>            
		<input type="submit" name="Eliminar" value="Eliminar">
		<input type= "reset" name="limpiar" value="Limpiar">


</body>
</html>