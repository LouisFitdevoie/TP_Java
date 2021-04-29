package be.heh.strategie.tp2.ex1;

public class Facture {

    private Double montant = 0.0;
    private Affichage a = new Default();
    public Facture(Double montant) {
        this.montant = montant;
    }
    public void affiche() {
        getAffichage().affiche(montant);
    }
    public void setAffichage(Affichage a) {
        this.a = a;
    }
    public Affichage getAffichage() {
        return a;
    }
}
