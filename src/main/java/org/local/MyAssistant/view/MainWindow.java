package org.local.MyAssistant.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import static org.local.MyAssistant.controller.TextGenerator.getContatos;

public class MainWindow extends JFrame{
    private JPanel MainPanel;
    private JButton DefaultTextButton;
    private JButton sairButton;
    private JButton contatosButton;

    public MainWindow() {
        initComponents();

        // ActionListener
        DefaultTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
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
        contatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String text = getContatos();
                JanelaDeTextoSimples janelaDeTextoSimples = new JanelaDeTextoSimples(text);
                janelaDeTextoSimples.setVisible(true);
            }
        });
    }

    private void initComponents() {
        // Preferências da janela
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyAssistant App (Ambiente Acadêmico)");
        pack();
        setMinimumSize(new Dimension(275, 0));
        setLocationRelativeTo(null);
        setResizable(false);
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("src/main/java/org/local/MyAssistant/images/AssistentIcon.png")));
    }
}
