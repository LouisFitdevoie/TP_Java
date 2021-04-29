package be.heh.gui.TP4.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompteBancaireFrm extends JFrame {
    public CompteBancaireFrm(CompteBancaire compte) {
        super();
        buildWindow(compte);
    }
    private void buildWindow(CompteBancaire compte) {
        JFrame window = new JFrame();

        window.setTitle("Compte bancaire");
        window.setSize(450,100);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(buildContent(compte));
    }

    private JPanel buildContent(CompteBancaire compte) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel lblMontant = new JLabel("Montant : ");
        JTextField tfDepot = new JTextField();
        JButton btnAdd = new JButton("Ajouter montant");
        JLabel lblSolde = new JLabel("Votre solde = " + compte.getSolde());

        panel.add(lblMontant);
        panel.add(tfDepot);
        panel.add(btnAdd);
        panel.add(lblSolde);
        btnAdd.addActionListener(new AjouteMontantEcouteur(lblSolde,compte,tfDepot.getText()));

        return panel;
    }

    public class AjouteMontantEcouteur implements ActionListener {
        private JLabel lblCompte;
        private CompteBancaire compte;
        private double montant;
        public AjouteMontantEcouteur(JLabel lblCompte, CompteBancaire compte, String string) {
            this.lblCompte = lblCompte;
            this.compte = compte;
            double montant;
            if(string.isEmpty()) {
                montant = compte.getSolde();
            } else {
                montant = Double.parseDouble(string);
                this.montant = montant;
            }
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            compte.depot(this.montant);
            lblCompte.setText("Votre solde = " + compte.getSolde());
        }
    }
}
