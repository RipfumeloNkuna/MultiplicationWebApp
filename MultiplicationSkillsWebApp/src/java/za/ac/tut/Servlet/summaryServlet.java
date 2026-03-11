/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ripfu
 */
public class summaryServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        HttpSession  session=request.getSession();
       
        int numbQuestionsAsked=(Integer)session.getAttribute("numQuestionsAsked");
        int numWrongAnswers=(Integer)session.getAttribute("numWrongAnswers");
        int numCorrectAnswers=(Integer)session.getAttribute("numCorrectAnswers");
        
        ArrayList<String> listQuestions=( ArrayList<String>)session.getAttribute("listQuestions");
        ArrayList<Integer> listAnswers=(ArrayList<Integer>)session.getAttribute("listAnswers");
        ArrayList<String> outcomes=(ArrayList<String>)session.getAttribute("outcomes");
        
        RequestDispatcher disp=request.getRequestDispatcher("summary.jsp");
        disp.forward(request, response);
        
    }

   
}
