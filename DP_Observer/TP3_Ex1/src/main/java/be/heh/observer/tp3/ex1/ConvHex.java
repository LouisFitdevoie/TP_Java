package be.heh.observer.tp3.ex1;

public class ConvHex extends Conversion {
    public ConvHex(Saisie saisie) {
        this.saisie = saisie;
    }

    @Override
    public void actualise() {
        System.out.println("Conversion en hexa : " + Integer.toHexString(saisie.getNombre()));
    }
}
