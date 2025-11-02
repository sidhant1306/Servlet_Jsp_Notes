package com.example.jsp_sql_basic;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/first")
public class first extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("sName");
        out.print("Hello " + name);
    }

}