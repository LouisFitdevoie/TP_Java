package be.heh.gui.TP4.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompteBancaireFrm extends JFrame {
    private CompteBancaire cb;
    private JLabel lblSolde;
    private JTextField txtMontant;
    private JTextArea txtHistorique;
    private JButton btnMontant;
    private JScrollPane scroll;

    public CompteBancaireFrm(double montant) {

        super("Compte bancaire");

        int width = 450;
        int height = 200;

        cb = new CompteBancaire(montant);
        lblSolde = new JLabel();
        txtMontant = new JTextField("", 10);

        txtHistorique = new JTextArea(5, 20);
        txtHistorique.setEditable(false);

        btnMontant = new JButton("Ajouter");
        btnMontant.addActionListener(new AjouteMontantEcouter());

        scroll = new JScrollPane(txtHistorique);

        setMinimumSize(new Dimension(width, height));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(new JLabel("Montant : "));
        add(txtMontant);
        add(btnMontant);
        add(lblSolde);
        add(scroll);
        lblSolde.setText("le montant est "+String.valueOf(cb.getSolde()));
    }
    private  class AjouteMontantEcouter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                cb.depot(Double.parseDouble(txtMontant.getText()));
                lblSolde.setText("le montant est "+String.valueOf(cb.getSolde()));
                txtHistorique.append(lblSolde.getText()+"\n");
            }
            catch(Exception e1)
            {

            }
        }
    }
}