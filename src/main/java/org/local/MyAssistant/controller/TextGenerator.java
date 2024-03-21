package org.local.MyAssistant.controller;

import org.local.MyAssistant.model.ConnectionFactory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TextGenerator {
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

}
