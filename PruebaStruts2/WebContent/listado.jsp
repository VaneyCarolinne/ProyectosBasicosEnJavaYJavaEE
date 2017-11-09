<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Usuarios en el Sistema</title>
</head>
<body>

<strong> Lista de Usuarios registrados en el Sistema</strong>
<br><br><br><br>
<table>
	<tr>
		<td><strong>Nombre</strong></td>
		<td><strong>Password </strong></td>
		<td><strong>Login</strong></td>
	</tr>

  <s:iterator value="vector">
	<tr>
		<td><s:property value= "user_name"/></td>
		<td><s:property value= "user_password"/></td>
		<td><s:property value= "user_login"/></td>
	</tr>
  </s:iterator>	
</table>

</body>
</html>