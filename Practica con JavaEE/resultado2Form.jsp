<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificación:</title>
</head>
<body>

	<br>Se puede mejorar :)! 

    <%
	   String cod = request.getParameter("codigoEST");
	   String  mater = request.getParameter("materias");
	   
	   String delete = "UPDATE estudiante SET materias = '"+mater+"'  WHERE numEstudiante =  '"+cod+"' ";

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