<%-- 
    Document   : NumberRange
    Created on : Mar 10, 2026, 4:24:39 PM
    Author     : ripfu
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
         String msge=exception.getMessage();
        %>
        
        <h1>Error => <%=msge%></h1>
        
        <p>to go back click <a href="index.html">BACK</a></p>
    </body>
</html>
