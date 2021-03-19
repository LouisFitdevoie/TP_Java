package be.heh.strategie.tp2.ex1;

public class AfficheRoyaumeUni implements Affichage {
    @Override
    public void affiche(Double montant) {
        System.out.println("The amount of the invoice is : £" + montant);
    }
}
