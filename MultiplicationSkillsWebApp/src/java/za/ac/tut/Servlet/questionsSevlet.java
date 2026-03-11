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
import za.ac.tut.model.multipleCation;
import za.ac.tut.model.multipleCationLocal;

/**
 *
 * @author ripfu
 */
public class questionsSevlet extends HttpServlet {

   @EJB
   multipleCationLocal p;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession  session=request.getSession();
        
        
        String question=p.multipleQuestion();
        
        updatreSession( session,question);
        
         RequestDispatcher disp=request.getRequestDispatcher("QuestionOutput.jsp");
        disp.forward(request, response);
    }

    public void updatreSession(HttpSession  session,String question)
    {
        int numQuestionsAsked=(Integer)session.getAttribute("numQuestionsAsked");//numCorrectAnswers=(Integer)session.getAttribute("numCorrectAnswers"),numWrongAnswers=(Integer)session.getAttribute("numWrongAnswers");
        ArrayList<String> listQuestions=( ArrayList<String>)session.getAttribute("listQuestions");
        numQuestionsAsked++;
        listQuestions.add(question);
       session.setAttribute("question", question);
       session.setAttribute("numQuestionsAsked", numQuestionsAsked);
       session.setAttribute("listQuestions",listQuestions);
    }
   

}
