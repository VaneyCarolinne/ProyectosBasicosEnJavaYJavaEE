<%-- 
    Document   : registro
    Created on : 10-nov-2017, 22:23:09
    Author     : vaneycaroline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Registro onlinne</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <div class="login-container">
            <div class="login-header">
                <h1 title="RegistroDeUsuario">Registro de Usuarios</h1>
                <p title="close">x</p>
            </div>
            <div class="login-form">
                <s:form action ="Register">
                    <input id="tf"  type="text" placeholder="UserLogin" name="user_entity.user_login"/>

                    <br /><br />
                    <input id="tf" type="password" placeholder="Passowrd" name= "user_entity.user_password" />
                    <br /><br />

                    <input id="tf" type="text" placeholder="Nombre" name= "user_entity.user_name" />
                    <br /><br />

                    <input id="sm" title="login" type="submit" value="Registrar" />
                    &nbsp;&nbsp;
                    <input id="sm" type="button" value="Volver" name="volverAtras" onclick="history.back()" />
                </s:form>
                <div class="login-header">
                    <h3 title="Mensaje"><s:actionmessage/></h3>
                </div>
            </div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="js/index.js"></script>
    </body>
</html>

