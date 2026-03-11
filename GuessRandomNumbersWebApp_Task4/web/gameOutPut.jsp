<%-- 
    Document   : gameOutPut
    Created on : Mar 3, 2026, 7:27:39 PM
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
          Integer userNumber=(Integer)request.getAttribute("userNumber");
          int ComputerNumber=(Integer)request.getAttribute("computerNumber");
          String computer=application.getInitParameter("Computer");
          String name=(String)session.getAttribute("name");
          String output=(String)request.getAttribute("message");
          
        %>
        
        <h1>The output</h1>
        
        <table>
            <tr>
                <td><%=name%> : </td>
                <td><%=userNumber%></td>
            </tr>
            
            <tr>
                <td><%=computer%> : </td>
                <td><%=ComputerNumber%></td>
            </tr>
            
            <tr>
                <td>Output : </td>
                <td><%=output%></td>
            </tr>
        </table>
            
            <p>to continue playing click <a href="game.html">PLAY HERE</a>
                <br>
                to see the summary click <a href="summary.jsp">SUMMARY</a>
                <br>
                to exit click <a href="EndSession.do">EXIT</a>
            </p>
    </body>
</html>
