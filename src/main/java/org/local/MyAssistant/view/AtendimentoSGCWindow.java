package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.local.MyAssistant.controller.TextGenerator.aberturaDeChamado;

public class AtendimentoSGCWindow extends JFrame{
    private JTextField textFieldNomeDoCliente;
    private JTextField textFieldLocalizacao;
    private JTextField textFieldTipoDeApoio;
    private JButton gerarTextoButton;
    private JPanel MainPanel;

    public AtendimentoSGCWindow() {
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Gerador de Texto para SGC");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        gerarTextoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome_do_cliente = textFieldNomeDoCliente.getText();
                String localizacao = textFieldLocalizacao.getText();
                String apoio = textFieldTipoDeApoio.getText();
                String texto_padrao = aberturaDeChamado(nome_do_cliente,localizacao,apoio);
                TextWindow janelaDoTexto = new TextWindow(texto_padrao);
                janelaDoTexto.setVisible(true);
            }
        });
    }
}
