<%-- 
    Document   : QuestionOutput
    Created on : Mar 9, 2026, 11:36:03 PM
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
          String question=(String)session.getAttribute("question");
        %>
        <h1>Answer the question below : </h1>
        
        <form action="answerServlet.do" method="POST">
            <table>
                <tr>
                    <td><%=question%> : </td>
                    <td><input type="text" name="userAnswer" required=""/></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="Check Answer"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
