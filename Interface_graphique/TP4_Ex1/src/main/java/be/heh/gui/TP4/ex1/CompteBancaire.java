package be.heh.gui.TP4.ex1;

public class CompteBancaire {
    private double solde = 0.0;

    public CompteBancaire(double solde) {
        if(solde >= 0) {
            this.solde = solde;
        } else {
            this.solde = 0.0;
        }
    }

    public void depot(double solde) {
        this.solde += solde;
    }

    public double getSolde() {
        return this.solde;
    }

}
