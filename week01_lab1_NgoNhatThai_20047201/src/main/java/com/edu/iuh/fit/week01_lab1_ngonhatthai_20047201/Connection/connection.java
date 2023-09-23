package com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "ngothai123";

    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL Driver found");
        } catch (ClassNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
            return connection;
        } catch (SQLException e1) {
            System.out.println("Error" + e1.getMessage());
        }
        return null;
    }
}
