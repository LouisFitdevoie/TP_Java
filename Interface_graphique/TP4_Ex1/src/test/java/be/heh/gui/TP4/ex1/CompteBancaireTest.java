package be.heh.gui.TP4.ex1;

import org.junit.Test;
import javax.swing.*;

public class CompteBancaireTest {
    @Test
    public static void main(String[] args)
    {
        CompteBancaire cb1 = new CompteBancaire(50);
        cb1.afficherSolde();

        CompteBancaire cb2 = new CompteBancaire(-7.50);
        cb2.depot(100);
        cb2.afficherSolde();

        CompteBancaire cb3 = new CompteBancaire(50);

        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                CompteBancaireFrm fenetre = new CompteBancaireFrm(cb3);
            }
        });
    }
}
