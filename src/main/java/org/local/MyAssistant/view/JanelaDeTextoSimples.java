package org.local.MyAssistant.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JanelaDeTextoSimples extends JFrame implements WindowListener {
    private JPanel MainPanel;
    private JTextArea textAreaPadrao;
    private JButton copiarTextoButton;

    public JanelaDeTextoSimples(String TextoPadrao) {
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Texto Padrão");
        this.configurarJTextArea(TextoPadrao);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        addWindowListener(this);
        copiarTextoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection data = new StringSelection(textAreaPadrao.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(data,data);
            }
        });
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        MainWindow janelaPrincipal = new MainWindow();
        janelaPrincipal.setVisible(true);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    private void configurarJTextArea(String Texto) {
        this.textAreaPadrao.setText(Texto);
        this.textAreaPadrao.setEditable(false);
        this.textAreaPadrao.setFocusable(false);
        this.textAreaPadrao.setOpaque(true);
        this.textAreaPadrao.setBackground(getContentPane().getBackground());
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        this.textAreaPadrao.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }
}
