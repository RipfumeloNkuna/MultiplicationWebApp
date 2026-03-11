<%-- 
    Document   : nameOutput
    Created on : Mar 9, 2026, 10:35:13 PM
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
        <h1>Hello <%=name%>, i am <%=computer%> </h1>
        
        <h2>there are questions that you will answer to continue click <a href="questionsSevlet.do">HERE</a></h2>
    </body>
</html>
