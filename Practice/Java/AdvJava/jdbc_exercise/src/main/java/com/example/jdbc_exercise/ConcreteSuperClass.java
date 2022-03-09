package com.example.jdbc_exercise;

import java.sql.*;

public class ConcreteSuperClass {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    String driver = "com.mysql.cj.jdbc.Driver";
    String dbUrl ="jdbc:mysql://localhost/classicmodels";

    String userName = "root";
    String password = "jonkim29";

    public void connect() throws SQLTransientException {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dbUrl,userName,password);
        } catch (SQLException e) {
            throw new SQLTransientException();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        System.out.println("connected successfully");
    }

    public void closeCon(){
       try {
           conn.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
        System.out.println("Successfully closed");
    }
}
