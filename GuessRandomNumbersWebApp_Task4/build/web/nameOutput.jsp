<%-- 
    Document   : nameOutput
    Created on : Mar 3, 2026, 6:49:40 PM
    Author     : ripfu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
           String name=(String)session.getAttribute("name");
           String computer=application.getInitParameter("Computer");
        %>
        
        <h1>Hello <%=name%>, I'm <%=computer%></h1>
        <h2>we are going to play a number guessing game to continue click below </h2>
        <p><a href="game.html">HERE</a></p>
    </body>
</html>
