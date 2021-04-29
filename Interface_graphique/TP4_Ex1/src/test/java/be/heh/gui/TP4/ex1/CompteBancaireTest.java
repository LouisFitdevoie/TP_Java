package be.heh.gui.TP4.ex1;

import org.junit.Test;

public class CompteBancaireTest {
    @Test
    public void test() {
        CompteBancaire compte1 = new CompteBancaire(50.0);
        CompteBancaire compte2 = new CompteBancaire(-7.50);

        System.out.println("Solde compte1 : " + compte1.getSolde() + " €");
        System.out.println("Solde compte2 : " + compte2.getSolde() + " €");

        compte1.depot(10);

        System.out.println("Solde compte1 : " + compte1.getSolde() + " €");
        System.out.println("Solde compte2 : " + compte2.getSolde() + " €");

        compte2.depot(15);

        System.out.println("Solde compte1 : " + compte1.getSolde() + " €");
        System.out.println("Solde compte2 : " + compte2.getSolde() + " €");
    }
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(50);
        CompteBancaireFrm window = new CompteBancaireFrm(compte);
    }
}
