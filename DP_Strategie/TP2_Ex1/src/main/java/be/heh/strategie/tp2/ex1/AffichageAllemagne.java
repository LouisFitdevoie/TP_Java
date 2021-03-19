package be.heh.strategie.tp2.ex1;

public class AffichageAllemagne implements Affichage {

    @Override
    public void affiche(Double montant) {
        System.out.println("Der Rechnungsbetrag ist : € " + montant);
    }
}
