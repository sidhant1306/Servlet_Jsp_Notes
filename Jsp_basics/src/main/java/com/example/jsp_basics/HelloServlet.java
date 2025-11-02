package com.example.jsp_basics;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /*String name = "Sidhant";
        req.setAttribute("label", name);
        RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
        rd.forward(req, res);*/

       /* Student student = new Student(1, "Sidhant");   // creating the object of a student class
        req.setAttribute("student", student);
        RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
        rd.forward(req, res);*/

        // TO PRINT A LIST OF OBJECTS :

        List<Student> studs = Arrays.asList(new Student(1, "navin"), new Student(2, "Sonam"), new Student(3, "mahak"), new Student(4, "bhavya"));
        req.setAttribute("students", studs);
        RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
        rd.forward(req, res);
    }

}