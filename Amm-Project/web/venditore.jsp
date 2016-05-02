<%-- 
    Document   : venditore
    Created on : 29-apr-2016, 21.33.47
    Author     : zenpl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Venditore</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Enrico Meloni">
        <meta charset="UTF-8">
        <meta name="keywords" content="Pagina del venditore">
        <link href="M3/CSS/style.css" rel="stylesheet" type="text/css" media="screen" />
        <!-- modifica percorso CSS per matchiare con le cartelle -->
    </head>
       <body>
        <div id="page">

            <jsp:include page="header.jsp" />               <!--header-->
            
        <div id="content-seller">
        <br><form method="GET">

            <!-- Nome, Url immagine, descrzione, Prezzo, quantità -->
            <br><label for="NameApp"> Nome applicazione </label>
            <br><input type="text" name="NameApp" id="NameApp">
            
            <br><label for="URLImage"> URL immagine </label>
            <br><input type="url" name="URLImage" id="URLImage">
            
            <br><label for="Prezzo"> Prezzo </label>
            <!-- 0.00 == gratis --><!-- non ho trovato un type adeguato per le valute -->
            <br><input type="number" name="Prezzo" min="0,00" max="1000,00" value="0,00" id="Prezzo">
            
            <br><label for="Quantità"> Quantità </label>
            <br><input type="number" name="Quantità" id="Quantità">
            
            <br><label for="Descrizone">Descrizione</label>
            <br><textarea name="Descrizone" id="Descrizone" rows="10" cols="40"></textarea><br>
            <!-- submit e reset -->
            <br><br>
            <br><input class="seller" type="submit" value="Invia"><br>
            <br><input class="seller" type="reset" value="Reset"><br>
            <br>  
       <br></form>
            </div>

                <jsp:include page="footer-design.jsp" />        <!--footer-->
            
            </div>
    </body>
</html>
