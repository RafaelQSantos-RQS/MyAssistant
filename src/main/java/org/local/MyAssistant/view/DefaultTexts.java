package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        SGCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AtendimentoSGCWindow janelaParaSGC = new AtendimentoSGCWindow();
                janelaParaSGC.setVisible(true);
            }
        });
    }


}
