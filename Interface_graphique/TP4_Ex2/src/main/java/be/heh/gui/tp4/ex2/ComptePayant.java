package be.heh.gui.tp4.ex2;

public class ComptePayant extends Compte {
    public ComptePayant() {
        super.nom = getClass().getSimpleName();
    }
    public void depot(double montant) {
        super.balance.add(montant - montant * 0.05);
    }
    public void retrait(double montant) {
        super.balance.add(- (montant + montant * 0.05));
    }
}
