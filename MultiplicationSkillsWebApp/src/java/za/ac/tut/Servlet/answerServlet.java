/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.exception.NumberRangeException;
import za.ac.tut.model.multipleCationLocal;

/**
 *
 * @author ripfu
 */
public class answerServlet extends HttpServlet {

@EJB
multipleCationLocal p;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
       
        try{
        HttpSession  session=request.getSession();
        int userAnswer=Integer.parseInt(request.getParameter("userAnswer"));
       
        int ans=p.checkAnswer(userAnswer);
        
        updateSession2(session,ans, userAnswer);
        
        RequestDispatcher disp=request.getRequestDispatcher("AnswerOutput.jsp");
        disp.forward(request, response);
        
        }catch(NumberRangeException ex)
        {
            throw new ServletException(ex); 
        }
    }

    public void updateSession2(HttpSession  session,int ans, int userAnswer)
    {
        String message;
        String question=(String)session.getAttribute("question");
        int numQuestionsAsked=(Integer)session.getAttribute("numQuestionsAsked");
        
        
        int numCorrectAnswers=(Integer)session.getAttribute("numCorrectAnswers"),numWrongAnswers=(Integer)session.getAttribute("numWrongAnswers");
        ArrayList<Integer> listAnswers=(ArrayList<Integer>)session.getAttribute("listAnswers");
        ArrayList<String> outcomes=(ArrayList<String>)session.getAttribute("outcomes");
        
        
        if(ans==userAnswer)
        {
            numCorrectAnswers++;
            message="correct";
        }
        else
        {
            numWrongAnswers++;
            message="wrong";
        }
       listAnswers.add(userAnswer);
       outcomes.add(message);
       
       
       
        session.setAttribute("message",message);
        
       session.setAttribute("userAnswer",userAnswer);
       
       
       session.setAttribute("outcomes",outcomes);
       session.setAttribute("listAnswers", listAnswers);
       
        session.setAttribute("numWrongAnswers", numWrongAnswers);
        session.setAttribute("numCorrectAnswers", numCorrectAnswers);
        session.setAttribute("ans", ans);
    }
 

}
