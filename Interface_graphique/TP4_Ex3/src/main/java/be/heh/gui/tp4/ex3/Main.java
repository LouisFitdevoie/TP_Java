package be.heh.gui.tp4.ex3;

import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        getContentPane().add(new Calculatrice());
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
