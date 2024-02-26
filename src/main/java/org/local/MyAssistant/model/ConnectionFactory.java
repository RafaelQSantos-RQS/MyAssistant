package org.local.MyAssistant.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection CreateConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/database.db");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
