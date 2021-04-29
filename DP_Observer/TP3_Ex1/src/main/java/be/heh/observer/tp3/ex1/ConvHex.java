package be.heh.observer.tp3.ex1;

public class ConvHex implements Conversion {
    public ConvHex() {

    }

    @Override
    public void actualise(int nombre) {
        System.out.println("Conversion en hexa : " + Integer.toHexString(nombre));
    }
}
