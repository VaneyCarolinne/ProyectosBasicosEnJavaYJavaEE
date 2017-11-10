<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Bienvenido al sistema</title>
</head>
<body>

<div class="login-container">
	<div class="login-header">
	   <h1 title="Bienvenidos">Bienvenidos al sistema <br> <s:property value="user.user_name"/> </h1>
       <p title="close">x</p>
	</div>	
		<br>
		<div class="login-form">
			<s:form action = "Listar_amigos">
			     <br /><br />
				<input id="sm" title="ListarUsuarios" type="submit" value= "Listar"/>
			</s:form>
		</div>
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="js/index.js"></script>
  
</body>
</html>