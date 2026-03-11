/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
        
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name") ;
        
        initializeSession(session,name );
        
        RequestDispatcher disp = request.getRequestDispatcher("nameOutput.jsp");
        disp.forward(request, response);
    }


    private void initializeSession(HttpSession session,String name )
    {
        int numberGamesPlayed=0 , numberGamesWon=0;
        
        session.setAttribute("name", name);
        session.setAttribute("numberGamesPlayed",numberGamesPlayed);
        session.setAttribute("numberGamesWon", numberGamesWon);
    }

}
