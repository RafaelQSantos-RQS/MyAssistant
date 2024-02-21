package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    private JPanel MainPanel;
    private JButton DefaultTextButton;
    private JButton sairButton;

    public MainWindow(){

        // Preferências da janela
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyAssistant App");
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        // ActionListener
        DefaultTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTexts janelaDeTextosPadroes = new DefaultTexts();
                janelaDeTextosPadroes.setVisible(true);
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
