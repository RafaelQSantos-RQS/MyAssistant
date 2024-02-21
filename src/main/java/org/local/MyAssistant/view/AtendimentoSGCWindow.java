package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static org.local.MyAssistant.controller.TextGenerator.getTextoChamado;

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
                String nome_do_cliente = textFieldNomeDoCliente.getText().strip();
                String localizacao = textFieldLocalizacao.getText().strip();
                String apoio = textFieldTipoDeApoio.getText().strip();
                if (nome_do_cliente == "" || localizacao == "" || apoio == ""){
                    JOptionPane.showMessageDialog(null,"Todos os campos devem estar preeenchidos","ERROR",JOptionPane.ERROR_MESSAGE);
                } else {
                    dispose();
                    String texto_padrao = getTextoChamado(nome_do_cliente, localizacao, apoio);
                    TextWindow janelaDoTexto = new TextWindow(texto_padrao);
                    janelaDoTexto.setVisible(true);
                }
            }
        });
        textFieldTipoDeApoio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    gerarTextoButton.doClick();
                }
            }
        });
        textFieldLocalizacao.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    gerarTextoButton.doClick();
                }
            }
        });
        textFieldNomeDoCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    gerarTextoButton.doClick();
                }
            }
        });
    }
}
