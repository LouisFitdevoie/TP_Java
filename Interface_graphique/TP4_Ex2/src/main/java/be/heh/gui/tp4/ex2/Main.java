package be.heh.gui.tp4.ex2;

import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        getContentPane().add(new BanqueFrm());
        setSize(400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
