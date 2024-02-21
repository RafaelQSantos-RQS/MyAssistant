package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.local.MyAssistant.controller.TextGenerator.getSaudacao;
import static org.local.MyAssistant.controller.TextGenerator.getSenhaText;

public class DefaultTexts extends JFrame{
    private JPanel MainPanel;
    private JButton atendimentosButton;
    private JButton encaminhamentoTécnicoButton;
    private JButton problemasComSenhasButton;
    private JButton saudacaoButton;
    private JButton SGCButton;
    private JButton voltarButton;

    public DefaultTexts() {
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Textos Padrões");
        setMinimumSize(new Dimension(300,200));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        SGCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AtendimentoSGCWindow janelaParaSGC = new AtendimentoSGCWindow();
                janelaParaSGC.setVisible(true);
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainWindow janelaPrincipal = new MainWindow();
                janelaPrincipal.setVisible(true);
            }
        });
        saudacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String mensagem = getSaudacao();
                TextWindow janelaDeTexto = new TextWindow(mensagem);
                janelaDeTexto.setVisible(true);
            }
        });
        problemasComSenhasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagem = getSenhaText();
                if (mensagem != null) {
                    dispose();
                    TextWindow janelaDeTexto = new TextWindow(mensagem);
                    janelaDeTexto.setVisible(true);
                } else {
                    JOptionPane.
                            showMessageDialog(null,"Texto padrão não gerado, valor não escolhido","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


}
