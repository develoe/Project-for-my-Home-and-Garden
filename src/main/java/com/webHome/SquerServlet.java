package com.webHome;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SquerServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int number = Integer.parseInt(req.getParameter("nameSenzor"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/homeDetail.jsp");
        requestDispatcher.forward(req,resp);


    }
}
