package be.heh.gui.tp4.ex3;

import javax.swing.*;
import java.awt.*;

public class Calculatrice extends JPanel {
    protected final String[][] texteBtns = {{"7","8","9","+"},{"4","5","6","-"},{"3","2","1","*"},{"0",".","/","="}};
    private JPanel panel;
    private JTextField textField;

    public Calculatrice() {
        textField = new JTextField(10);
        textField.setEditable(false);

        CalculatriceListener calculatriceListener = new CalculatriceListener(this);
        JPanel btnPanel = new JPanel((new GridLayout(texteBtns.length, texteBtns[0].length)));
        for (int i = 0 ; i < texteBtns.length ; i++) {
            for(int j = 0 ; j < texteBtns[i].length ; j++) {
                JButton bouton = new JButton(texteBtns[i][j]);
                bouton.addActionListener(calculatriceListener);
                btnPanel.add(bouton);
            }
        }
        panel = new JPanel(new BorderLayout());
        panel.add(textField, BorderLayout.PAGE_START);
        panel.add(btnPanel, BorderLayout.CENTER);
        add(panel);
    }
    public JTextField getTextField() {
        return textField;
    }
    public void setTextField(JTextField textField) {
        this.textField = textField;
    }
}
