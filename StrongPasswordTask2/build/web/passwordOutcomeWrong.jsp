<%-- 
    Document   : passwordOutcomeWrong
    Created on : Mar 4, 2026, 8:57:23 PM
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
         String message=(String)request.getAttribute("message");
         String password=(String)request.getAttribute("password");
        %>
        <h1>password : <%=password%> <br> <%=message%></h1>
        <p>to go back click <a href="password.html">HERE</a></p>
    </body>
</html>
