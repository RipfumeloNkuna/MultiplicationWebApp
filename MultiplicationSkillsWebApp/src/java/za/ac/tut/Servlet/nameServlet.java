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
public class nameServlet extends HttpServlet {




  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session=request.getSession(true);
        String name=request.getParameter("name");
        
        initializeSession(session,name);
        
        RequestDispatcher disp=request.getRequestDispatcher("nameOutput.jsp");
        disp.forward(request, response);
    }
    
    public void initializeSession(HttpSession session,String name)
    {
        int numQuestionsAsked=0,numCorrectAnswers=0,numWrongAnswers=0;
        ArrayList<String> listQuestions=new ArrayList<>();
        ArrayList<Integer> listAnswers=new ArrayList<>();
        ArrayList<String> outcomes=new ArrayList<>();
        
        session.setAttribute("name", name);
        session.setAttribute("numQuestionsAsked", numQuestionsAsked);
        session.setAttribute("numCorrectAnswers", numCorrectAnswers);
        session.setAttribute("numWrongAnswers", numWrongAnswers);
        session.setAttribute("listQuestions", listQuestions);
        session.setAttribute("outcomes", outcomes);
        session.setAttribute("listAnswers",listAnswers);
    }

 

}
