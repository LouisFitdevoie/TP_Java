package be.heh.gui.tp4suite.ex2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {

    private SliderColor sliderCouleur;

    public SliderListener(SliderColor sliderCouleur) {
        this.sliderCouleur = sliderCouleur;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JSlider slider = (JSlider)changeEvent.getSource();

        if (slider == sliderCouleur.getSliderR()) {
            sliderCouleur.getCanvas().setValeurRouge(slider.getValue());
            displayRGBColor();
        } else if (slider == sliderCouleur.getSliderG()) {
            sliderCouleur.getCanvas().setValeurVert(slider.getValue());
            displayRGBColor();
        } else if (slider == sliderCouleur.getSliderB()) {
            sliderCouleur.getCanvas().setValeurBleu(slider.getValue());
            displayRGBColor();
        }
        sliderCouleur.getCanvas().repaint();
    }

    public void displayRGBColor() {
        sliderCouleur.getCanvas().setBackgroundColor();
        sliderCouleur.getRgbValue().setText(Integer.toString(sliderCouleur.getCanvas().getCouleur().getRGB() & 0xffffff, 16));
    }

}
