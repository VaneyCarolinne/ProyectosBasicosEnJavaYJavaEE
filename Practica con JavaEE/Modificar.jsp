<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestión de Modificar estudiante</title>
</head>
<body>
  <h3>Control de Estudios PEPA</h3>
	<form action="resultado2Form.jsp" method="get">
		Ingrese codigo del estudiante para modificar sus Materias:<br><br>
		
		Codigo del estudiante: <br>
		<input type="text" name= "codigoEST" required ="required" > <br>
		Materias: <br>
		<input type="text" name= "materias" required ="required" > <br>
		<br>            
		<input type="submit" name="Modificar" value="Guardar">
		<input type= "reset" name="limpiar" value="Limpiar">

</body>
</html>