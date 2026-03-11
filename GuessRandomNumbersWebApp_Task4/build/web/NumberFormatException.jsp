<%-- 
    Document   : NumberFormatException
    Created on : Mar 3, 2026, 8:51:46 PM
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
         String error=exception.getMessage();
        %>
        
        <h1>Error => <%=error%></h1>
        <h2>use numbers</h2>
        
        <P> to exit click <a href="EndSession.do">EXIT</a></P>
    </body>
</html>
