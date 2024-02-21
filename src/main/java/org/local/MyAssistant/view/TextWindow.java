package org.local.MyAssistant.view;

import javax.swing.*;

public class TextWindow extends JFrame{
    private JPanel MainPanel;
    private JTextArea textAreaPadrao;
    private JButton copiarTextoButton;

    public TextWindow(String TextoPadrao) {
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Texto Padrão");
        this.textAreaPadrao.setText(TextoPadrao);
        this.textAreaPadrao.setEditable(false);
        this.textAreaPadrao.setFocusable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
