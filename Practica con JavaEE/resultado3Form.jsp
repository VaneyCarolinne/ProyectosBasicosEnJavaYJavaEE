<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eliminar un estudiante</title>
</head>
<body>

	<br>Se puede mejorar también esto... :)! 

    <%
	   String cod = request.getParameter("codigoEST");
	   
	   String delete = "DELETE FROM estudiante WHERE numEstudiante =  '"+cod+"' ";

		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/controldeestudio", "root", "");

			PreparedStatement pS = con.prepareStatement(delete);
			pS.executeUpdate();
			out.println("<script> alert(\"Operación Exitosa...\");</script>");
		} catch (Exception e){
			out.println("<script> alert(\"Error: " + e.getMessage() + "\");</script>");
		}
	
	%>



</body>
</html>