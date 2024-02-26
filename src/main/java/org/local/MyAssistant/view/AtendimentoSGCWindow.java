package org.local.MyAssistant.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.local.MyAssistant.controller.ListGenerator.getListOfTechnicians;
import static org.local.MyAssistant.controller.TextGenerator.getTextoChamado;

public class AtendimentoSGCWindow extends JFrame{
    private JTextField textFieldNomeDoCliente;
    private JTextField textFieldLocalizacao;
    private JTextField textFieldTipoDeApoio;
    private JButton gerarTextoButton;
    private JPanel MainPanel;
    private JComboBox tecnicoComboBox;

    public AtendimentoSGCWindow() {
        // Iniciando os componentes
        iniComponents();

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
                    String[] lista_de_textos = new String[0];
                    try {
                        lista_de_textos = getTextoChamado(nome_do_cliente, localizacao, apoio);
                        JanelaDeTextoSimples janelaDoTexto = new JanelaDeTextoSimples(lista_de_textos[0]);
                        janelaDoTexto.setVisible(true);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
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

    private void iniComponents() {
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Gerador de Texto para SGC");
        configComboBox();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void configComboBox() {
        ArrayList<String> listOfTechinician = getListOfTechnicians();
        for (String techinician: listOfTechinician) tecnicoComboBox.addItem(techinician);
    }
}
