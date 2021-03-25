package be.heh.observer.tp3.ex1;

public class ConvBin extends Conversion {
    public ConvBin(Saisie saisie) {
        this.saisie = saisie;
    }

    @Override
    public void actualise() {
        System.out.println("Conversion en binaire : " + Integer.toBinaryString(saisie.getNombre()));
    }
}
