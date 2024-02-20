package org.local.MyAssistant.view;

import javax.swing.*;

public class DefaultTexts extends JFrame{
    private JPanel MainPanel;
    private JButton atendimentosButton;
    private JButton encaminhamentoTécnicoButton;
    private JButton problemasComSenhasButton;
    private JButton saudacaoButton;
    private JButton SGCButton;

    public DefaultTexts() {
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Textos Padrões");
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }


}
