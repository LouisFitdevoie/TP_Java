package be.heh.gui.tp4.ex2;

public class CompteEpargne extends Compte {
    public CompteEpargne() {
        super.nom = getClass().getSimpleName();
    }
    public boolean update() {
        super.getBalance().add(balance.stream().mapToDouble(a -> a).sum() * 0.05);
        return true;
    }
}
