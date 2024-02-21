package org.local.MyAssistant.controller;

public class TextGenerator {
    static public String aberturaDeChamado(String nome_do_cliente, String localizacao, String apoio) {
        String texto =
                "O cliente entrou em contato via WhatsApp solicitando apoio. Durante o atendimento, foram coletadas as seguintes informações:\n" +
                "\nNome do Cliente: " + nome_do_cliente.toUpperCase() +
                "\nLocalização: " + localizacao.toUpperCase() +
                "\nTipo de Apoio Necessário: " + apoio.toUpperCase() +
                "\n\nO atendimento está em andamento e as necessidades do cliente estão sendo tratadas conforme as políticas e procedimentos estabelecidos." +
                "\nSerá fornecida uma atualização assim que o atendimento for concluído ou se houver necessidade de mais informações.";
        return texto;
    }
}
