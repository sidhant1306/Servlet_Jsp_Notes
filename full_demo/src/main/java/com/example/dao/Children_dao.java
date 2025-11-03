package com.example.dao;

import com.example.model.children_dataModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

// We'll use the class name as the default URL pattern

public class Children_dao {
    String db_url = "jdbc:mysql://127.0.0.1:3306/jspPractice";
    String db_username = "root";
    String db_password = "Sonam@1108";
    children_dataModel model = null;    // it is the class which has the format of printing the object
   public children_dataModel getChildren(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            e.getStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            String id_query = "SELECT * FROM children WHERE id = ?" ;
            PreparedStatement id_prep = connection.prepareStatement(id_query);
            id_prep.setInt(1, id);
            ResultSet st = id_prep.executeQuery();
            if(st.next()) {
                model = new children_dataModel();
                model.setId(st.getInt("id"));
                model.setMarks(st.getInt("marks"));
                model.setName(st.getString("name"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return model;
    }



}