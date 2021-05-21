package be.heh.gui.tp4suite.ex2;

import javax.swing.*;
import java.awt.*;

public class SliderColor extends JPanel {

    private DrawCanvas canvas = new DrawCanvas();
    private JLabel valeurRGB = new JLabel("");
    private JSlider sliderR, sliderG, sliderB;

    public SliderColor() {
        sliderR = getSlider(0, 255, 0, 50, 5);
        sliderG = getSlider(0, 255, 0, 50, 5);
        sliderB = getSlider(0, 255, 0, 50, 5);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 15, 0));

        panel.add(new JLabel("R-G-B Sliders (0 - 255)"));
        panel.add(sliderR);
        panel.add(sliderG);
        panel.add(sliderB);

        panel.add(new JLabel("RGB Value: ", JLabel.RIGHT));

        valeurRGB.setBackground(Color.white);
        valeurRGB.setForeground(Color.black);
        valeurRGB.setOpaque(true);
        panel.add(valeurRGB);

        add(panel, BorderLayout.SOUTH);
        add(canvas);
    }

    public JSlider getSlider(int min, int max, int init, int mjrTkSp, int mnrTkSp) {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, init);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(mjrTkSp);
        slider.setMinorTickSpacing(mnrTkSp);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListener(this));
        return slider;
    }

    public DrawCanvas getCanvas() {
        return canvas;
    }

    public JLabel getRgbValue() {
        return valeurRGB;
    }

    public JSlider getSliderR() {
        return sliderR;
    }

    public JSlider getSliderG() {
        return sliderG;
    }

    public JSlider getSliderB() {
        return sliderB;
    }

}
