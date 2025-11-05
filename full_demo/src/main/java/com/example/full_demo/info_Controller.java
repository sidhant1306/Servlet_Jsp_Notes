package com.example.full_demo;

import java.io.*;
import java.sql.SQLException;

import com.example.dao.info_dao;
import com.example.model.info_dataModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/get_data")
public class info_Controller extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String entered_username = request.getParameter("username");
        String entered_password = request.getParameter("password");

        info_dao dao = new info_dao();
        try {
            PrintWriter out = response.getWriter();
            info_dataModel exist = dao.isValid(entered_username, entered_password); // returns null if no output was made in info_dao
            // if a user was found :
                if(exist != null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("data", exist);
                    response.sendRedirect("showChildren.jsp");
                }
                else {
                    response.sendRedirect("login.jsp");
                }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}