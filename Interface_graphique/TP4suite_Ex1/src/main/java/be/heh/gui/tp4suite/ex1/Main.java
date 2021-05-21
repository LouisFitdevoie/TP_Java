package be.heh.gui.tp4suite.ex1;

import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        getContentPane().add(new ConvertisseurFRM());
        setSize(500,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
