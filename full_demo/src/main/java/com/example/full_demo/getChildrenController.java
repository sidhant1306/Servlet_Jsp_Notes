package com.example.full_demo;

import java.io.*;

import com.example.dao.Children_dao;
import com.example.model.children_dataModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/getChildren")
public class getChildrenController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("childId"));

        Children_dao dao = new Children_dao();
        children_dataModel c1 = dao.getChildren(id);

        request.setAttribute("child", c1);
        RequestDispatcher rd = request.getRequestDispatcher("showChildren.jsp");
        rd.forward(request, response);

    }

}