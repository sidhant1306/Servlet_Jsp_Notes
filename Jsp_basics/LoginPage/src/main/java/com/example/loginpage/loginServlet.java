package com.example.loginpage;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
        PrintWriter out = response.getWriter();
        if (uname.equalsIgnoreCase("sidhant") && pass.equals("Sonam@1108")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("Welcome.jsp");
        } else {
            out.print("Invalid credentials");
            response.sendRedirect("login.jsp");
        }
    }
}