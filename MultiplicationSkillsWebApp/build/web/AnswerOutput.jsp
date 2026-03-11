<%-- 
    Document   : AnswerOutput
    Created on : Mar 10, 2026, 12:03:15 AM
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
         String question= (String)session.getAttribute("question");
         Integer ans=(Integer)session.getAttribute("userAnswer");
         String outcome=(String)session.getAttribute("message");
        %>
        
        <h1>Here is the outcome below : </h1>
        
        <table>
            <tr>
                <td>Question : </td>
                <td><%=question%></td>
            </tr>
            
            <tr>
                <td>your answer : </td>
                <td><%=ans%></td>
            </tr>
            
            <tr>
                <td>Outcome : </td>
                <td><%=outcome%></td>
            </tr>
        </table>
            
            <ul><li>to end session click <a href="endSession.do">EXIT</a></li>
                <li>to get the question again click <a href="questionsSevlet.do">Questions</a></li>
                 <li>to get the summary click <a href="summaryServlet.do">summary</a></li>
            </ul>
    </body>
</html>
