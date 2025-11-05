package com.example.dao;

import com.example.model.info_dataModel;

import java.sql.*;

// We'll use the class name as the default URL pattern

public class info_dao {
    String db_url = "jdbc:mysql://127.0.0.1:3306/get_info";
    String db_username = "root";
    String db_password = "Sonam@1108";

    
    public info_dataModel isValid(String username, String password) throws SQLException {
        info_dataModel model = null;        // it is kept null so that we can know if it is not updated at all, it means login failed and no user data was fetched
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        
        try {
            Connection connection = DriverManager.getConnection(db_url, db_username, db_password);

            String login_query = "SELECT * FROM info WHERE username = ? AND password = ?";
            PreparedStatement login_prep = connection.prepareStatement(login_query);
            login_prep.setString(1, username);
            login_prep.setString(2, password);
            ResultSet rs = login_prep.executeQuery();

           if (rs.next()) {
               model = new info_dataModel();    // the instance is made here because we want a new instance for every user
               // assigning the values to the variables in the info_dataModel method (which has the format of printing these)
               model.setPrint_username(rs.getString("username"));
               model.setPrint_school(rs.getString("school"));
               model.setPrint_grades(rs.getString("grades"));
               model.setPrint_height(rs.getInt("height"));
               model.setPrint_weight(rs.getInt("weight"));
           }
           rs.close();
           login_prep.close();
           connection.close();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return model;
    }

}