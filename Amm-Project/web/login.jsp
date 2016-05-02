<%-- 
    Document   : login.jsp
    Created on : 29-apr-2016, 18.54.04
    Author     : zenpl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Enrico Meloni">
        <meta charset="UTF-8">
        <meta name="keywords" content="Pagina di Login">
        <link href="CSS/style.css" rel="stylesheet" type="text/css" media="screen" />
        <!-- modifica percorso CSS per matchiare con le cartelle -->
    </head>
       <body>
        <div id="page">
            
                <jsp:include page="header.jsp" />               <!--header-->
            
        <div id="content-login">
            <br><form method="GET">
           <br><div>
                <br><label for="Username"> Username </label>
                <br><input class="input" type="text" name="Username" id="Username">
                <br><label for="Password"> Password </label>
                <br><input class="input" type="password" name="Password" id="Password">
            <br></div>
            <div>
                <br><input class="button" type="submit" value="Login"><br>
                <br><input class="button" type="reset" value="Reset"><br>
            </div>
            <br></form>
        </div>
                <jsp:include page="footer-design.jsp" />        <!--footer-->
        </div>
    </body>
</html>