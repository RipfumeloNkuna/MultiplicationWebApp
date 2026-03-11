<%-- 
    Document   : summary
    Created on : Mar 10, 2026, 12:33:39 AM
    Author     : ripfu
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          int numQuestionsAsked=(Integer)session.getAttribute("numQuestionsAsked");
          int numCorrectAnswers=(Integer)session.getAttribute("numCorrectAnswers");
          int numWrongAnswers=(Integer)session.getAttribute("numWrongAnswers");
          
           ArrayList<String> listQuestions=( ArrayList<String>)session.getAttribute("listQuestions");
           ArrayList<Integer> listAnswers=(ArrayList<Integer>)session.getAttribute("listAnswers");
         ArrayList<String> outcomes=(ArrayList<String>)session.getAttribute("outcomes");
        %>
        
        <h1>Here is your summary below</h1>
        
        <table>
            <tr>
                <td>Number of questions asked : </td>
                <td><%=numQuestionsAsked%></td>
            </tr>
            
            <tr>
                <td>Number of wrong answers : </td>
                <td><%=numWrongAnswers%></td>
            </tr>
            
            <tr>
                <td>Number of correct answers : </td>
                <td><%=numCorrectAnswers%></td>
            </tr>
        </table>
            
            <h2>here are the list of questions, answers and outputs below : </h2>
            <table border="1">
                <tr>
                    <th>number</th>
                    <th>Questions</th>
                    <th>answers</th>
                    <th>outcomes</th>
                 </tr>    
                    <%
                     for(int i=0;i<listAnswers.size();i++)
                     {
                         Integer answers=listAnswers.get(i);
                         String questions=listQuestions.get(i);
                         String outcome=outcomes.get(i);
                      
                    %>
                    <tr>
                        <td><%=i+1%></td>
                        <td><%=questions%> </td>
                        <td><%=answers%></td>
                        <td><%=outcome%> </td>
                    </tr>
                    
                    <%
                        }
                    %>
               
            </table>
            
            <ul><li>to end session click <a href="endSession.do">EXIT</a></li>
                <li>to get the question again click <a href="questionsSevlet.do">Questions</a></li>
                 <li>to get the summary click <a href="summary.jsp">summary</a></li>
            </ul>
    </body>
</html>
