package com.example.dao;

import com.example.model.info_dataModel;
import com.example.model.register_model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class register_dao {
    String db_url = "jdbc:mysql://127.0.0.1:3306/get_info";
    String db_username = "root";
    String db_password = "Sonam@1108";

    public boolean register_user(register_model model) throws SQLException {
        // this function takes an object as parameter, and we create a new object in servlet and pass that into this function
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);
            String insert_query = "INSERT INTO info(username, password, school, grades, height, weight) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insert_prep = connection.prepareStatement(insert_query);
            // model is the passed object
            insert_prep.setString(1, model.getUsername());
            insert_prep.setString(2, model.getPassword());
            insert_prep.setString(3, model.getSchool());
            insert_prep.setString(4, model.getGrades());
            insert_prep.setInt(5, model.getHeight());
            insert_prep.setInt(6, model.getWeight());

            int rowsAffected = insert_prep.executeUpdate();
            if(rowsAffected > 0) {
                return true;        // if rows of data were affected, it means data was inserted
            }
            else {
                System.out.println("Data could not be inserted.");
            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}

