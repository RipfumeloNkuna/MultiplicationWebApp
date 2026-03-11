/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.PasswordChecker;

/**
 *
 * @author ripfu
 */
public class createServlet extends HttpServlet {

 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String password=request.getParameter("password");
        request.setAttribute("password", password);
        
        PasswordChecker d=new PasswordChecker();
        boolean valid=d.isValid(password);
        if(valid==true)
        {
            String message="the password is valid";
            request.setAttribute("message", message);
             RequestDispatcher disp=request.getRequestDispatcher("passwordOutcome.jsp");
             disp.forward(request, response);
        }
        else
        {
            String message="the password is not valid";
            request.setAttribute("message", message);
            RequestDispatcher disp=request.getRequestDispatcher("passwordOutcomeWrong.jsp");
             disp.forward(request, response);
        }
        
        
       
    }


}
