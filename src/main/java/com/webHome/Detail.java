package com.webHome;


import com.arduino.Controller;
import com.personModel.Senzor;
import com.dataBase.DataBase;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Detail extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int a = Integer.parseInt(req.getParameter("nameSenzor"));
        DataBase dataBase = new DataBase();
        Senzor senzor = dataBase.getId();
        Controller controller = new Controller();


        req.setAttribute("senz", senzor);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("detail.jsp");
        requestDispatcher.forward(req,resp);
    }
}
