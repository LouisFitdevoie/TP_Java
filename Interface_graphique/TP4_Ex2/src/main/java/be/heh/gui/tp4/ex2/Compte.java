package be.heh.gui.tp4.ex2;

import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
    protected List<Double> balance;
    protected String nom;

    public Compte() {
        this.balance = new ArrayList<>();
        this.balance.add(0.0);
    }

    public void depot(Double valeur) {
        this.balance.add(valeur);
    }

    public void retrait(Double valeur) {
        this.balance.add(- valeur);
    }

    public boolean update() {
        return false;
    }

    public List<Double> getBalance() {
        return this.balance;
    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        double somme = balance.stream().mapToDouble(a -> a).sum();
        return "<" + this.nom + "> : " + somme + "- Dernière opération : " + balance.get(balance.size() - 1).toString();
    }
}
