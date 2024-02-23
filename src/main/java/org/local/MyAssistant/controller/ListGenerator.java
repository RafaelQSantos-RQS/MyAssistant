package org.local.MyAssistant.controller;

import org.local.MyAssistant.model.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListGenerator {
    public static ArrayList<String> getListOfTechnicians() {
        ArrayList<String> listOfTechnicians = new ArrayList<>();

        try (Connection connection = new ConnectionFactory().CreateConnection();
             Statement statement = connection.createStatement()) {

            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select nome from tecnicos order by 1");  // Seleciona apenas a coluna "nome"

            while (rs.next()) {
                listOfTechnicians.add(rs.getString("nome"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listOfTechnicians;
    }
}
