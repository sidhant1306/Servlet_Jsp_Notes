package com.example.servletjsppractice;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        String op = req.getParameter("operation");
        int j = Integer.parseInt(req.getParameter("num2"));
        PrintWriter out = res.getWriter();
        int ans = 0;
        switch (op){
            case "+" :  ans = i + j;
            break;
            case "-" : ans = i - j;
            break;
            case "*" : ans = i * j;
            break;
            case "/" : ans = i / j;
            break;

            default: out.println("wrong input operation selected.Please try again");
        }

        req.setAttribute("ans", ans);
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, res);
    }
}