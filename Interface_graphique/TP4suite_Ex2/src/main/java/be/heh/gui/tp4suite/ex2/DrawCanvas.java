package be.heh.gui.tp4suite.ex2;

import java.awt.*;

public class DrawCanvas extends Canvas {

    private Color couleur;
    private int valeurRouge, valeurVert, valeurBleu;

    public DrawCanvas() {
        setSize(350, 350);
        couleur = new Color(0, 0, 0);
        setBackgroundColor();
    }

    public void setBackgroundColor() {
        couleur = new Color(valeurRouge, valeurVert, valeurBleu);
        setBackground(couleur);
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setValeurRouge(int valeurRouge) {
        this.valeurRouge = valeurRouge;
    }

    public void setValeurVert(int valeurVert) {
        this.valeurVert = valeurVert;
    }

    public void setValeurBleu(int valeurBleu) {
        this.valeurBleu = valeurBleu;
    }

}
