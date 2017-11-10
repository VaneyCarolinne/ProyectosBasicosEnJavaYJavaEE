<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Lista de Usuarios en el Sistema</title>
</head>
<body>

<div class="login-container">
	<div class="login-header">
	   <h1 title="Lista">Lista de Usuarios registrados en el Sistema <br></h1>
       <p title="close">x</p>
	</div>	
	<div class="login-header">
	<table border="1">
		<tr>
			<td border="1"><h1 tittle="name"><font color=#01DFA5>Nombre:&nbsp;&nbsp;</font></h1></td>
			<td border="1"><h1 tittle="pass"><font color=#01DFA5>&nbsp;Password:&nbsp;&nbsp;</font></h1></td>
			<td border="1"><h1 tittle="login"><font color=#01DFA5>&nbsp;Login:</font></h1></td>
		</tr>

  	<s:iterator value="vector">
		<tr>
			<td border="1"> <h1 title="user_n">  <s:property value= "user_name"/> &nbsp;&nbsp;</h1></td>
			<td border="1"> <h1 title="user_p">  &nbsp;<s:property value= "user_password"/>&nbsp;&nbsp;</h1></td>
			<td border="1"> <h1 title="user_l">  &nbsp;<s:property value= "user_login"/>   </h1>   </td>
		</tr>
  	</s:iterator>	
	</table>	
	</div>		
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="js/index.js"></script>

</body>
</html>