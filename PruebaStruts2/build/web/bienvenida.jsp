<%-- 
    Document   : bienvenida
    Created on : 10-nov-2017, 20:18:57
    Author     : vaneycaroline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
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
                <h1 title="Bienvenidos">Bienvenido al sistema: <br> <s:property value="user_entity.user_login"/></h1>
                <p title="close">x</p>
            </div>	
            <br>
            <div class="login-form">
                <s:form action = "Listar_amigos">
                    <br /><br />
                    <input id="sm" title="ListarUsuarios" type="submit" value= "Listar"/>
                </s:form>       
                <s:form action="modificar.jsp">
                    <br /><br />
                    <input id="sm" title="Modificar" type="submit" value= "Modificar"/>
                </s:form>       
                <s:form action="eliminar.jsp">
                    <br /><br />
                    <input id="sm" title="Eliminar" type="submit" value= "Eliminar"/>
                </s:form>
                <br /><br />
                <input id="sm" type="button" value="Volver" name="volverAtras" onclick="history.back()" />    
            </div>

        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="js/index.js"></script>

    </body>
</html>
