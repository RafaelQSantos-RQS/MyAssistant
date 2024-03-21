package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtendimentosAcademicos extends JFrame{
    private JPanel mainPanel;
    private JButton abrirChamadoButton;
    private JButton voltarButton;

    public AtendimentosAcademicos() {
        initComponents();
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainWindow janelaPrincipal = new MainWindow();
                janelaPrincipal.setVisible(true);
            }
        });
    }

    private void initComponents() { // Iniciar Componentes
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atendimentos Acadêmicos");
        setMinimumSize(new Dimension(275, 0));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
