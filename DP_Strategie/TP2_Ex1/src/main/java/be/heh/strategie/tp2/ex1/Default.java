package be.heh.strategie.tp2.ex1;

public class Default implements Affichage {
    @Override
    public void affiche(Double montant) {
        System.out.println("Le montant de la facture est de : " + montant + "€");
    }
}
