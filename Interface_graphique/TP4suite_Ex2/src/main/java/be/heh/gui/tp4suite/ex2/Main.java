package be.heh.gui.tp4suite.ex2;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        getContentPane().add(new SliderColor());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
