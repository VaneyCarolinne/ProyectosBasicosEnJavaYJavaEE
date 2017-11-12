<%-- 
    Document   : Listado
    Created on : 10-nov-2017, 21:35:18
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
        <title>Lista de Usuarios en el Sistema</title>
    </head>
    <body>

        <div class="login-container">
            <div class="login-header">
                <h1 title="Lista">Lista de Usuarios registrados en la Base de Datos <br></h1>
                <p title="close">x</p>
            </div>	
            <div class="login-form">    
                <br>
                <input id="sm" type="button" value="Volver" name="volverAtras" onclick="history.back()" />
                <br/>
            </div>
            <div class="login-header">
                <table border="1">
                    <tr>
                        <td border="1"><h3 tittle="name"><font color=#01DFA5>Nombre:&nbsp;&nbsp;</font></h3></td>
                        <td border="1"><h3 tittle="pass"><font color=#01DFA5>&nbsp;Password:&nbsp;&nbsp;</font></h3></td>
                        <td border="1"><h3 tittle="login"><font color=#01DFA5>&nbsp;Login:</font></h3></td>
                    </tr>

                    <s:iterator value="L">
                        <tr>
                            <td border="1"> <h2 title="user_n">  <s:property value= "user_name"/> &nbsp;&nbsp;</h2></td>
                            <td border="1"> <h2 title="user_p">  &nbsp;<s:property value= "user_password"/>&nbsp;&nbsp;</h2></td>
                            <td border="1"> <h2 title="user_l">  &nbsp;<s:property value= "user_login"/>   </h2>   </td>
                        </tr>
                    </s:iterator>	
                </table>	
            </div>		
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="js/index.js"></script>

    </body>
</html>
