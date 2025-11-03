package com.example.loginpage;

import java.io.*;

import com.login.Dao.login_dao;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
        PrintWriter out = response.getWriter();
        login_dao dao = new login_dao();
        if (dao.check_credentials(uname, pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("Welcome.jsp");
        } else {
            out.print("Invalid credentials");
            response.sendRedirect("login.jsp");
        }
    }
}