<%-- 
    Document   : summary
    Created on : Mar 3, 2026, 8:25:10 PM
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
           int numberGamesPlayed = (Integer)session.getAttribute("numberGamesPlayed");
           int numberGamesWon =(Integer)session.getAttribute("numberGamesWon");
        %>
        
        <h1>Here is your summary</h1>
        <table>
            <tr>
                <td>Number of games Played : </td>
                <td><%=numberGamesPlayed%></td>
            </tr>
            
            <tr>
                <td>Number of games Won : </td>
                <td><%=numberGamesWon%></td>
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
