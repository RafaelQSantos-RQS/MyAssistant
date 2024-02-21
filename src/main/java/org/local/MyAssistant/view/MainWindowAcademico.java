package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.local.MyAssistant.controller.TextGenerator.getContatos;

public class MainWindowAcademico extends JFrame{
    private JPanel MainPanel;
    private JButton DefaultTextButton;
    private JButton sairButton;
    private JButton contatosButton;

    public MainWindowAcademico(){

        // Preferências da janela
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyAssistant App (Ambiente Acadêmico)");
        pack();
        setMinimumSize(new Dimension(275,0));
        setLocationRelativeTo(null);
        setResizable(false);

        // ActionListener
        DefaultTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                DefaultTextsAcademico janelaDeTextosPadroes = new DefaultTextsAcademico();
                janelaDeTextosPadroes.setVisible(true);
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        contatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String text = getContatos();
                TextWindow textWindow = new TextWindow(text);
                textWindow.setVisible(true);
            }
        });
    }
}
