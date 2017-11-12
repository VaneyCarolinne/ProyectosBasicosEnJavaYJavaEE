<%-- 
    Document   : eliminar.jsp
    Created on : 12-nov-2017, 14:09:19
    Author     : vaneycaroline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Eliminar Onlinne</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <div class="login-container">
            <div class="login-header">
                <h1 title="EliminacionDeUsuario">Eliminar usuarios:</h1>
                <p title="close">x</p>
            </div>
            <div class="login-form">
                <s:form action ="eliminar">
                    <input id="tf" type="text" placeholder="Login" name= "user_entity.user_login" />
                    <br /><br />   
                    <input id="sm" title="Borrar" type="submit" value="Borrar" />
                    &nbsp;&nbsp;
                    <input id="sm" type="button" value="Volver" name="volverAtras" onclick="history.back()" />
                    <div class="login-header">
                        <h2 title="Mensaje"> Ingrese el login del usuario que quiera Borrar </h2>
                    </div>
                </s:form>
                <div class="login-header">
                    <h3 title="Mensaje"><font color=#01DFA5>&nbsp;&nbsp;<s:actionmessage/></font></h3>
                    <h3 title="Mensaje"><font color=#01DFA5>&nbsp;&nbsp;<s:actionerror/></font></h3>
                </div>

            </div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="js/index.js"></script>
    </body>
</html>



