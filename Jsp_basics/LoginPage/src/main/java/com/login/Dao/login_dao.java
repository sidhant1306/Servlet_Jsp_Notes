package com.login.Dao;

import java.sql.*;

public class login_dao {

    String url = "jdbc:mysql://127.0.0.1:3306/login_database";
    String dbUsername = "root";
    String dbPassword = "Sonam@1108";
   public boolean check_credentials(String username, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

            try {
                String data_query = "SELECT * FROM login_data WHERE username = ? AND PASSWORD = ?";
                Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
                PreparedStatement data_statement = connection.prepareStatement(data_query);
                data_statement.setString(1, username);
                data_statement.setString(2, password);

                ResultSet rs = data_statement.executeQuery();
                if(rs.next()) {
                    return true;
                }

            } catch (SQLException e) {
                e.getStackTrace();
            }
        return false;
    }


}
