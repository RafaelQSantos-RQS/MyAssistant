package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.local.MyAssistant.controller.TextGenerator.getContatos;

public class MainWindow extends JFrame{
    private JPanel MainPanel;
    private JButton atenderButton;
    private JButton sairButton;
    private JButton contatosButton;
    private JButton sobreButton;

    public MainWindow() {
        initComponents();

        // ActionListener
        atenderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String[] options = new String[] {"Acadêmico","Corporativo"};
                int response = JOptionPane.showOptionDialog(null,"Vai prestar atendimento para qual Ambiente?",
                        "Escolha o Ambiente",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (response == -1) {
                    MainWindow janelaPrincipal = new MainWindow();
                    janelaPrincipal.setVisible(true);
                } else if (response == 0) {
                    AtendimentosAcademicos atendimentosAcademicos = new AtendimentosAcademicos();
                    atendimentosAcademicos.setVisible(true);
                } else if (response == 1) {
                }
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
    }
}
