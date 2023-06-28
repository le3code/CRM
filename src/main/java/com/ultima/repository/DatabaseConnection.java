package com.ultima.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private Connection connection;

    private static DatabaseConnection instance;
    public static DatabaseConnection getInstance() {

        if( instance ==  null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    private DatabaseConnection() {

        try {
            this.createConnection();
        } catch (SQLException e) {
            System.out.println("SQL Error " + e.getMessage());
        }
    }
    private  void createConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/crm";
        String user = "root";
        String passaword = "#motifxf7";

        this.connection = DriverManager.getConnection(url, user,passaword);
        this.connection.setAutoCommit(true);

    }

    public Connection getConnetion() {
        return this.connection;
    }

    public void closeConnection() {

        try {
            this.connection.close();
        } catch (SQLException e ) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }

}
