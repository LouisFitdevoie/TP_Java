package be.heh.gui.tp4.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banque {
    private List<Compte> comptes;

    public Banque() {
        this.comptes = new ArrayList<>();
    }
    public void ajout(Compte compte) {
        this.comptes.add(compte);
    }
    public void ajout(Compte... comptes) {
        this.comptes.addAll(Arrays.asList(comptes));
    }
    public Compte get(int i) {
        return this.comptes.get(i);
    }
    public List<Compte> getComptes() {
        return this.comptes;
    }
    public String[] getNoms() {
        String noms[] = new String[comptes.size()];
        for (int i = 0 ; i < comptes.size() ; i++) {
            noms[i] = comptes.get(i).getNom();
        }
        return noms;
    }
}
