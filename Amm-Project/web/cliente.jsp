<%-- 
    Document   : cliente
    Created on : 29-apr-2016, 21.30.51
    Author     : zenpl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Enrico Meloni">
        <meta charset="UTF-8">
        <meta name="keywords" content="Pagina per il cliente">
        <link href="CSS/style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
       <body>
        <div id="page">

            <jsp:include page="header.jsp" />               <!--header-->
            
        <div id="content-client">
        <table>
                <h3>Bentornato ${Cliente.nome} ${Cliente.cognome}</h3>
            <br>
            <caption><h3>Applicazioni in vendita</h3></caption>
                <tr>
                    <th> Nome </th>
                    <th> Descrizione</th>
                    <th> Foto </th>
                    <th> Quantità </th>
                    <th> Prezzo </th>
                    <th> Link </th>
                </tr>
            <!--Stolen by Google Play, sorry Google :D -->
            <c:forEach var="oggetti" items="${Oggetto.esamiSuperati}">
                <tr class="uno due">                    
                    <td class="name">${Oggetto.nome}</td>
                    <td class="desc">${Oggetto.descrizione}</td>
                    <td class="generale">
                        <img src="${Oggetto.icona}"
                         title="${Oggetto.nome}" alt="${Oggetto.nome}"
                         width="100" height="100"/>
                    </td>
                    <td class="generale">nessun limite</td>
                    <td class="generale">${Oggetto.prezzo}</td>
                     <td><a href="cliente.html?idOggetto=${Oggetto.id}">Acquista</a></td>
                </tr>
            </c:forEach>
        </table>
        </div>
                <jsp:include page="footer-design.jsp" />        <!--footer-->
        </div>
    </body>
</html>
