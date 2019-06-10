package com.webHome;

import com.personModel.Senzor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class Home extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("user");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        Senzor person = new Senzor();
        if (userName != null) {
            if (userName.equals("Sami") && password.equals("Sami")) {
                RequestDispatcher rque = req.getRequestDispatcher("home");
                HttpSession session = req.getSession();
                session.setAttribute("name", userName);
                HttpSession passwrod = req.getSession();
                passwrod.setAttribute("password", password);
                rque.forward(req, resp);
            } else {
                out.println("Sorry this form is not ok");
                resp.sendRedirect("index.jsp");

            }
        }else {
            req.getRequestDispatcher("index.jsp");
        }
    }
}
