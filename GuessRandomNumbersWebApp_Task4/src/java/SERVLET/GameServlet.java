/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import exception.NumberRangeException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.numberGauessGameModel;

/**
 *
 * @author ripfu
 */
public class GameServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        
        try{
        HttpSession session=request.getSession();
        int userNumber=Integer.parseInt(request.getParameter("userNumber"));
        
        numberGauessGameModel c=new numberGauessGameModel();
        int computerNumber=c.guessComputer(userNumber);
        
        request.setAttribute("computerNumber", computerNumber);
        request.setAttribute("userNumber", userNumber);
        
        String name=(String)request.getSession().getAttribute("name");
        
        if(userNumber==computerNumber)
        {
           String message=name+" won" ;
           request.setAttribute("message", message);
        }
        else
        {
           String message="Siri Won the game" ; 
           request.setAttribute("message", message);
        }
        
       
        
        
         
        updateSession(session,name,userNumber,computerNumber);
        
        RequestDispatcher disp=request.getRequestDispatcher("gameOutPut.jsp");
        disp.forward(request, response);
        
        }catch(NumberRangeException ex)
        {
            throw new ServletException(ex);
        }
        
       
    }
    
    private void updateSession(HttpSession session,String name,int userNumber,int computerNumber)
    {
        int numberGamesPlayed=(Integer)session.getAttribute("numberGamesPlayed") , numberGamesWon=(Integer)session.getAttribute("numberGamesWon");
        
        numberGamesPlayed++;
         if(userNumber==computerNumber)
        {
           numberGamesWon++ ;
        }
         
         session.setAttribute("name", name);
         session.setAttribute("numberGamesPlayed",numberGamesPlayed);
         session.setAttribute("numberGamesWon", numberGamesWon);
        
    }



}
