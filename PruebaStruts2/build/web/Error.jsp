<%-- 
    Document   : Error
    Created on : 10-nov-2017, 21:36:58
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
        <title>Error en Sistema</title>
    </head>
    <body>

        <div class="login-container">
            <div class="login-header">
                <h1 title="Error">ERROR 415, <br>No fue posible ingresar al sistema <br><br><br> <h2><s:actionerror/> <s:property value="user_entity.user_name"/></h2></h1>
                <p title="close">x</p>
                <br><br>
            </div>		
            <div class="login-form">
                <input id="sm" type="button" value="Volver" name="volverAtras" onclick="history.back()" /></div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="js/index.js"></script>

    </body>
</html>
