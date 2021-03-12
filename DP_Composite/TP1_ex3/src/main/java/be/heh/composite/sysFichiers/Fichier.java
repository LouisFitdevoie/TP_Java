package be.heh.composite.sysFichiers;

public class Fichier implements Composant{
    protected String nom;

    public Fichier(String nom) { this.nom = nom; }

    @Override
    public String lister() {
        return this.nom;
    }

    @Override
    public void ajouter(Composant c) {

    }
}
