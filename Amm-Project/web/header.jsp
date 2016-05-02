<%-- 
    Document   : header
    Created on : 29-apr-2016, 20.58.20
    Author     : zenpl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
            <header>
                <div id="header">
                    <div id="logo">
                        <!-- aggiunto logo da CSS -->
                        <h1>All Thing App Market</h1>
                    </div> <!-- sezione per il cambio di layout -->
                    <select class="menu">
                        <option>Cliente</option>
                        <option>Venditore</option>
                        <option>Descrizione</option>
                        <option>Login</option>
                    </select>
                    <div id="menu">
                        <ul>
                            <li><a href="cliente.jsp">Cliente</a></li>
                            <li><a href="venditore.jsp">Venditore</a></li>
                            <li><a href="descrizione.jsp">Descrizione</a></li>
                            <li><a href="login.jsp">Login</a></li>
                        </ul>
                    </div> 
                </div>
            </header>
</html>
