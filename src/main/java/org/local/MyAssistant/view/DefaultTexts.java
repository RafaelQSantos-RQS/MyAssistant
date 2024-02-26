package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static org.local.MyAssistant.controller.TextGenerator.*;

public class DefaultTexts extends JFrame{
    private JPanel MainPanel;
    private JButton atendimentosButton;
    private JButton encaminhamentoTecnicoButton;
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
                try {
                    String mensagem = getSaudacao();
                    JanelaDeTextoSimples janelaDeTexto = new JanelaDeTextoSimples(mensagem);
                    janelaDeTexto.setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao recuperar o texto:\n" + ex.getMessage(),
                            "ERROR",JOptionPane.ERROR_MESSAGE);
                    MainWindow janelaPrincipal = new MainWindow();
                    janelaPrincipal.setVisible(true);
                }
            }
        });
        problemasComSenhasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] options = {"Login SESI","Primeiro Acesso","Troca de Senha"};
                String resposta = (String) JOptionPane.showInputDialog(null,"Selecione qual texto você deseja copiar:",
                                "Seleção de Texto",JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
                dispose();
                if (resposta != null) {
                String mensagem = null;
                    try {
                        mensagem = getSenhaText(resposta);
                        JanelaDeTextoSimples janelaDeTexto = new JanelaDeTextoSimples(mensagem);
                        janelaDeTexto.setVisible(true);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Erro ao recuperar o texto:\n" + ex.getMessage(),
                                "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    MainWindow janelaPrincipal = new MainWindow();
                    janelaPrincipal.setVisible(true);
                }
            }
        });
        encaminhamentoTecnicoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String mensagem = null;
                try {
                    mensagem = getEncaminhamentoTecnico();
                    JanelaDeTextoSimples janelaDeTexto = new JanelaDeTextoSimples(mensagem);
                    janelaDeTexto.setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao recuperar o texto:\n" + ex.getMessage(),
                            "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


}
