<%-- 
    Document   : NumberRangeException
    Created on : Mar 3, 2026, 9:16:34 PM
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
          //String msg=(String)request.getAttribute("errorMsg");
        %>
        
       
       <h1>Error => <%= exception.getMessage() %></h1>
        
        <P> to exit click <a href="EndSession.do">EXIT</a></P>
    </body>
</html>
