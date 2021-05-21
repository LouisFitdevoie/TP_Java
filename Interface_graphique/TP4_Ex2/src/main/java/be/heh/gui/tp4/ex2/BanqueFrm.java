package be.heh.gui.tp4.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BanqueFrm extends JPanel {
    private Banque banque;

    private JTextField textField;
    private JTextArea textArea;
    private JComboBox comboBox;
    private JRadioButton depot;
    private JRadioButton retrait;
    private ButtonGroup groupe;

    public BanqueFrm() {
        this.banque = new Banque();
        banque.ajout(new CompteCourant(), new CompteEpargne(), new ComptePayant());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 15, 10));

        panel.add(new JLabel("Montant : "));
        textField = new JTextField();
        panel.add(textField);
        panel.add(new JLabel("Compte : "));
        comboBox = new JComboBox(banque.getNoms());
        panel.add(comboBox);

        groupe = new ButtonGroup();
        JPanel radioBtn = new JPanel();
        depot = new JRadioButton();
        depot.setText("Depot");
        depot.setSelected(true);
        groupe.add(depot);
        radioBtn.add(depot);
        retrait = new JRadioButton();
        retrait.setText("Retrait");
        groupe.add(retrait);
        radioBtn.add(retrait);
        panel.add(new JLabel("Transaction : "));
        panel.add(radioBtn);

        panel.add(new JButton(new AbstractAction("Valider") {
            @Override
            public void actionPerformed(ActionEvent e) {
                double montant = 0.0;
                if(!textField.getText().isEmpty()) {
                    try {
                        montant = Double.parseDouble(textField.getText());
                    } catch (NumberFormatException numberFormatException) {

                    }
                    if(depot.isSelected()) {
                        banque.get(comboBox.getSelectedIndex()).depot(montant);
                    } else if (retrait.isSelected()) {
                        banque.get(comboBox.getSelectedIndex()).retrait(montant);
                    }
                    textArea.append(banque.get(comboBox.getSelectedIndex()).toString() + "\n");
                }
            }
        }));
        panel.add(new JButton(new AbstractAction("Calculer les interets") {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Compte compte : banque.getComptes()) {
                    if(compte.update()) {
                        textArea.append(compte.toString() + "\n");
                    }
                }
            }
        }));

        textArea = new JTextArea(16,30);
        textArea.append("Test\n");
        JScrollPane scroll = new JScrollPane(textArea);

        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.SOUTH);
    }
}
