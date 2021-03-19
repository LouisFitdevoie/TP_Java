package be.heh.strategie.tp2.ex1;

public class Client {
    public static void main(String[] args) {
        Facture maFacture = new Facture(50.50);
        System.out.println("Par défaut (Belgique)");
        System.out.println("---------------------");
        maFacture.setAffichage(new AffichageBelgique());
        maFacture.affiche();
        System.out.println("\nAllemagne");
        System.out.println("----------");
        maFacture.setAffichage(new AffichageAllemagne());
        maFacture.affiche();
        System.out.println("\nRoyaume-Uni");
        System.out.println("----------");
        maFacture.setAffichage(new AfficheRoyaumeUni());
        maFacture.affiche();
    }
}