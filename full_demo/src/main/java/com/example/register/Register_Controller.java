package com.example.register;

import com.example.dao.register_dao;
import com.example.model.register_model;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

// We'll use the class name as the default URL pattern
@WebServlet("/register_controller")
public class Register_Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // taking all the parameters passed by register_info :
        String username = request.getParameter("newUsername");
        String password = request.getParameter("newPassword");
        String school = request.getParameter("newSchool");
        String grades = request.getParameter("newGrades");
        int height = Integer.parseInt(request.getParameter("newHeight"));
        int weight = Integer.parseInt(request.getParameter("newWeight"));

        // creating a new object for all the information, register_model is used for converting all the data into an object
        register_model reg_mod = new register_model();
        // setting the values using setters in the register_model function :
        reg_mod.setUsername(username);
        reg_mod.setPassword(password);
        reg_mod.setSchool(school);
        reg_mod.setGrades(grades);
        reg_mod.setHeight(height);
        reg_mod.setWeight(weight);
        // creating the object instance of dao which has the insert query and tells us if the data has been inserted or not
        register_dao reg_dao = new register_dao();
        try {
            boolean inserted = reg_dao.register_user(reg_mod);
            if(inserted) {
                response.sendRedirect("success.jsp");   // if the data is inserted send it to the success page
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}