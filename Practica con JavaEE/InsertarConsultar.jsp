<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicación Web Control De estudios PEPA</title>
</head>
<body>
	<h3>Control de Estudios PEPA</h3>
	<form action="resultadoForm.jsp" method="get">
		Inserte los datos principales:<br><br>
		Nombre: <br>
		<input type="text" name= "nombre" required ="required" > <br>
		Apellido: <br>
		<input type="text" name= "apellido" required ="required" > <br>
		Edad: <br>
		<input type="number" name= "edad" required ="required" > <br>
		Sexo: <br>
		<input type="text" name= "sexo" required ="required" > <br>
		Fecha de Nacimiento: <br>
		<input type="text" name= "fecha_nacimiento" required ="required" > <br>
		Semestre: <br>
		<input type="text" name= "semestre" required ="required" > <br>
		Codigo del estudiante: <br>
		<input type="text" name= "codigoEST" required ="required" > <br>
		Materias: <br>
		<input type="text" name= "materias" required ="required" > <br>
		Carrera: <br>
		<input type="text" name= "carrera" required ="required" > <br>
		<br>            
		<input type="submit" name="guardar" value="Guardar">
		<input type= "reset" name="limpiar" value="Limpiar">
		
		
	
	
	</form>
</body>
</html>   