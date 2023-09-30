package edu.umg;

import java.sql.*;

public class Employees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "Himundo99";
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
            while(resultSet.next()){
                System.out.println(resultSet.getString("ID") + " | " + resultSet.getString("name") + " | " + resultSet.getString("lastName")
                        + " | " + resultSet.getString("rDate") + " | " + resultSet.getString("bSalary") + " | " + resultSet.getString("gender")
                        + " | " + resultSet.getString("age") + " | " + resultSet.getString("hLength") + " | " + resultSet.getString("hLatitude"));

            }
            connection.close();
            statement.close();
            resultSet.close();

        }catch(SQLException e) {
            e.printStackTrace();

        }

    }
}
