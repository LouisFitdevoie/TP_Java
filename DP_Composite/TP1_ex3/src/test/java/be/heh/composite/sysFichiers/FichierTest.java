package be.heh.composite.sysFichiers;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class FichierTest {
    @Test
    public void listerUnFichier() {
        String nom = "fichier";
        Fichier fichier = new Fichier(nom);
        String nomFichier = fichier.lister();

        assertEquals("fichier",nomFichier);
    }
    @Test
    public void listerPlusieursFichiers() {
        Composite dossier = new Composite();
        String nom1 = "fichier1";
        Fichier fichier1 = new Fichier(nom1);
        dossier.ajouter(fichier1);
        String nom2 = "fichier2";
        Fichier fichier2 = new Fichier(nom2);
        dossier.ajouter(fichier2);
        String noms = dossier.lister();

        assertEquals("fichier1fichier2",noms);
    }
    @Test
    public void listerSystemeFichiers() {
        Composite systemeFichier = new Composite();
        Composite dossier1 = new Composite();
        Composite dossier2 = new Composite();

        String nom1 = "fichier1";
        Fichier fichier1 = new Fichier(nom1);
        dossier1.ajouter(fichier1);
        String nom2 = "fichier2";
        Fichier fichier2 = new Fichier(nom2);
        dossier1.ajouter(fichier2);
        systemeFichier.ajouter(dossier1);

        String nom3 = "fichier3";
        Fichier fichier3 = new Fichier(nom3);
        dossier2.ajouter(fichier3);
        String nom4 = "fichier4";
        Fichier fichier4 = new Fichier(nom4);
        dossier2.ajouter(fichier4);
        systemeFichier.ajouter(dossier2);

        String noms = systemeFichier.lister();

        assertEquals("fichier1fichier2fichier3fichier4",noms);
    }
}
