package be.heh.strategie.tp2.ex1;

public class Facture {

    private Double montant = 0.0;
    private Affichage a;
    public Facture(Double montant) {
        this.montant = montant;
    }
    public void affiche() {
        a.affiche(getMontant());
    }
    public void setAffichage(Affichage a) {
        this.a = a;
    }
    public Double getMontant() {
        return this.montant;
    }
}
