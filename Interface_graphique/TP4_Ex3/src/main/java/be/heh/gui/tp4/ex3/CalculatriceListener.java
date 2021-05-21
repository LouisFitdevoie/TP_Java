package be.heh.gui.tp4.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatriceListener implements ActionListener {

    private Calculatrice calculatrice;
    private String operateur = "", operateur1Str = "", operateur2Str = "";
    private Double operateur1, operateur2;
    private boolean reset = false;

    public CalculatriceListener(Calculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String txtBouton = ((JButton) actionEvent.getSource()).getText();
        System.out.println(txtBouton);
        if (reset) {
            reset = false;
            operateur = "";
            operateur1Str = "";
            operateur2Str = "";
            calculatrice.getTextField().setText("");
        }
        if (isEqual(txtBouton)) {
            calculatrice.getTextField().setText(calculatrice.getTextField().getText() + txtBouton);
            operateur2 = Double.parseDouble(operateur2Str);
            operateur1 = Double.parseDouble(operateur1Str);
            switch (operateur) {
                case "+":
                    calculatrice.getTextField().setText(calculatrice.getTextField().getText() + somme().toString());
                    break;
                case "*":
                    calculatrice.getTextField().setText(calculatrice.getTextField().getText() + multiplication().toString());
                    break;
                case "-":
                    calculatrice.getTextField().setText(calculatrice.getTextField().getText() + difference().toString());
                    break;
                case "/":
                    calculatrice.getTextField().setText(calculatrice.getTextField().getText() + division().toString());
                    break;
            }
            reset = true;
        } else if (isOperator(txtBouton)) {
            operateur = txtBouton;
            calculatrice.getTextField().setText(calculatrice.getTextField().getText() + operateur);
        } else {
            if (operateur.isEmpty())
                operateur1Str += txtBouton;
            else
                operateur2Str += txtBouton;
            calculatrice.getTextField().setText(calculatrice.getTextField().getText() + txtBouton);
        }

        System.out.println(toString());
        System.out.println("------------");
    }

    @Override
    public String toString() {
        return "CalculatriceListener{" +
                "operateur='" + operateur + '\'' +
                ", operateur1=" + operateur1Str +
                ", operateur2=" + operateur2Str +
                '}';
    }

    private Double somme() {
        return operateur1 + operateur2;
    }

    private Double difference() {
        return operateur1 - operateur2;
    }

    private Double division() {
        return operateur1 / operateur2;
    }

    private Double multiplication() {
        return operateur1 * operateur2;
    }

    private boolean isOperator(String str) {
        switch (str) {
            case "+":
            case "*":
            case "-":
            case "/":
                return true;
        }
        return false;
    }

    private boolean isEqual(String str) {
        return str.equals("=");
    }
}

