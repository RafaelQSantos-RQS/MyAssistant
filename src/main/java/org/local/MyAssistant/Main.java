package org.local.MyAssistant;

import org.local.MyAssistant.controller.ListGenerator;
import org.local.MyAssistant.model.ConnectionFactory;
import org.local.MyAssistant.view.MainWindowAcademico;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //MainWindowAcademico janelaPrincipal = new MainWindowAcademico();
        //janelaPrincipal.setVisible(true);
        try {
        Connection connection = new ConnectionFactory().CreateConnection();
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);

        ResultSet resultSet = statement.executeQuery("select * from textos");

        while (resultSet.next()) {
            System.out.println("Nome: " + resultSet.getString("nome"));
            System.out.println("Texto:\n" + resultSet.getString("texto"));
        }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}