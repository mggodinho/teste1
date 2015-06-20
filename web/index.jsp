<%-- 
    Document   : index
    Created on : 20/06/2015, 09:55:46
    Author     : godinho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formul&aacute;de Acesso</title>
    </head>
    <body>
        <h1>Dados do usu&aacute;rio:</h1>
        <form name="FLogin" method="POST" action="ControleLogin">
            Nome: <input type="text" name="txnome" size="50" /><br />
            Senha; <input type="password" name="txsenha" size="50"/><br />
            <input type="submit" name="btOK" value="Fazer Login"/><br/>
        </form>
    </body>
</html>
