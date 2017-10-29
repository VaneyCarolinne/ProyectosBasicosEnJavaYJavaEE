<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingresando Datos en la Base de datos</title>
</head>
<body>

	<%
		String nombreColumna1 = "Nombre: ";
		String nombreColumna2 = "Apellido: ";
		String nombreColumna3 = "Edad: ";
		String nombreColumna4 = "Sexo: ";
		String nombreColumna5 = "Fecha de Nacimiento: ";
		String nombreColumna6 = "Semestre: ";
		String nombreColumna7 = "Codigo: ";
		String nombreColumna8 = "Materias: ";
		String nombreColumna9 = "Carrera: ";
		
		String name = request.getParameter("nombre");
		String lastname = request.getParameter("apellido");
		String year = request.getParameter("edad");
		String sex = request.getParameter("sexo");
		String date = request.getParameter("fecha_nacimiento");
		String semester = request.getParameter("semestre");
		String cod = request.getParameter("codigoEST");
		String  mater = request.getParameter("materias");
		String career = request.getParameter("carrera");
		
		String insert = "INSERT INTO estudiante(nombre, apellido, edad, sexo, fecha_nacimiento, semestre, numEstudiante, materias, carrera) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controldeestudio", "root", "");

			//Statement statement = con.createStatement();
			PreparedStatement pS = con.prepareStatement(insert);

			pS.setString(1, name);
			pS.setString(2, lastname);
			pS.setString(3, year);
			pS.setString(4, sex);
			pS.setString(5, date);
			int semestry = Integer.parseInt(semester);;
			pS.setInt(6, semestry);
			pS.setString(7, cod);
			pS.setString(8, mater);
			pS.setString(9, career);
			//pS.setFloat(2, new Float(precio));
			pS.executeUpdate();
			out.println("<script> alert(\"Operación Exitosa...\");</script>");
		} catch (Exception e){
			out.println("<script> alert(\"Error: " + e.getMessage() + "\");</script>");
		}
		String query = "SELECT * FROM estudiante";		
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(query);
	
		
		


		
	%>
	<table> 
		<tr>
			<th><%=nombreColumna1%></th>
			<th><%=nombreColumna2%></th>
			<th><%=nombreColumna3%></th>
			<th><%=nombreColumna4%></th>
			<th><%=nombreColumna5%></th>
			<th><%=nombreColumna6%></th>
			<th><%=nombreColumna7%></th>
			<th><%=nombreColumna8%></th>
			<th><%=nombreColumna9%></th>
		</tr>
		<%	while (rs.next()) { %>
		<tr>
			<td><%= rs.getString(1) %></td>
			<td><%= rs.getString(2) %></td>
			<td><%= rs.getString(3) %></td>
			<td><%= rs.getString(4) %></td>
			<td><%= rs.getString(5) %></td>
			<td><%= rs.getInt(6) %></td>
			<td><%= rs.getString(7) %></td>
			<td><%= rs.getString(8) %></td>
			<td><%= rs.getString(9) %></td>
		</tr>
		
		<%	} 
		rs.close();
		String query2 = "SELECT nombre, materias FROM estudiante WHERE numEstudiante = '" + cod + "' ";
		ResultSet rs2 = statement.executeQuery(query2);
		%>
		
		<tr>
			<th><%= nombreColumna1 %></th>
			<th><%= nombreColumna8 %></th>
		</tr>	
		
		<%while (rs2.next()){ %>
		<tr>
			<td><%= rs2.getString(1) %></td>
			<td><%= rs2.getString(2) %></td>
		<%} rs2.close(); %>
		
	</table>
	
</body>
</html>