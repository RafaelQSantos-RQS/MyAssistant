package org.local.MyAssistant.controller;

import org.local.MyAssistant.model.ConnectionFactory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TextGenerator {
    static public String[] getTextoChamado(String cliente, String localizacao, String apoio) throws SQLException {
        String text = null;
        try (Connection connection = new ConnectionFactory().CreateConnection();
             Statement statement = connection.createStatement()) {

            statement.setQueryTimeout(30);

            String query = "select nome, texto from textos where nome = 'Abertura de Chamado'";
            ResultSet rst = statement.executeQuery(query);

            if (rst.next()) {
                text = rst.getString("texto");
            }

            text = text.replace("[CLIENTE]",cliente.toUpperCase());
            text = text.replace("[LOCAL]",localizacao.toUpperCase());
            text = text.replace("[APOIO]",apoio.toUpperCase());

        } catch (SQLException e) {
            throw new SQLException("Erro ao recuperar texto de Saudação:\n", e);
        }
        return new String[]{text, null};
    }

    static public String getSaudacao() throws SQLException {
        String text = null;
        try (Connection connection = new ConnectionFactory().CreateConnection();
             Statement statement = connection.createStatement()) {

            statement.setQueryTimeout(30);

            String query = "select nome, texto from textos where nome = 'Saudação'";
            ResultSet rst = statement.executeQuery(query);

            if (rst.next()) {
                text = rst.getString("texto");
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao recuperar texto de Saudação:\n", e);
        }
        return text;
    }

    static public String getSenhaText(String nome) throws SQLException {
        String text = null;
        try (Connection connection = new ConnectionFactory().CreateConnection();
             Statement statement = connection.createStatement()) {

            statement.setQueryTimeout(30);

            String query = "select nome, texto from textos where nome = '" + nome +"'";
            ResultSet rst = statement.executeQuery(query);

            if (rst.next()) {
                text = rst.getString("texto");
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao recuperar texto de " + nome + ":", e);
        }
        return text;
    }

    static public String getContatos() {
        String contatoString =
                "Central de Matrículas:\n" +
                "1. (71) 3462-9501 / 9502\n" +
                "2. 98110-4473 (WhatsApp)" +
                "\n\n" +
                "Secretária Geral de Cursos:\n" +
                "1. (71) 3462-9558\n" +
                "2. Email: cimatecsecretariageraldecursos@fieb.org.br" +
                "\n\n" +
                "Financeiro:\n" +
                "1. (71) 3462-9576 / 9589\n" +
                "2. Email: financeirosenaicimatec@fieb.org.br" +
                "\n\n" +
                "Central de Atendimento ao Aluno:\n" +
                "1. (71) 3287-8337 (Apenas WhatsApp)\n" +
                "2. Email: caasenaiba@fieb.org.br" +
                "\n\n" +
                "Núcleo de Carreiras:\n" +
                "1. (71) 3462-5675 / 8423\n" +
                "2. Email: carreiras.cimatec@fieb.org.br" +
                "\n\n" +
                "Megazap:\n" +
                "1. (71) 98110-4473";
        return contatoString;
    }

    static public String getEncaminhamentoTecnico() throws SQLException {
        String text = null;
        try (Connection connection = new ConnectionFactory().CreateConnection();
             Statement statement = connection.createStatement()) {

            statement.setQueryTimeout(30);

            String query = "select nome, texto from textos where nome = 'Encaminhar Técnico'";
            ResultSet rst = statement.executeQuery(query);

            if (rst.next()) {
                text = rst.getString("texto");
            }

        } catch (SQLException e) {
            throw new SQLException("Erro ao recuperar texto de encaminhamento técnico", e);
        }
        return text;
    }
}
