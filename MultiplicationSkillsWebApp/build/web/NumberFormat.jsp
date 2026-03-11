<%-- 
    Document   : NumberFormat
    Created on : Mar 10, 2026, 3:47:44 PM
    Author     : ripfu
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error Page</title>
    </head>
    <body>
        
        <%
          String msg=exception.getMessage();
        %>
        <h1>error => <%=msg%></h1>
        
        <p>to go back click <a href="index.html">BACK</a></p>
    </body>
</html>
