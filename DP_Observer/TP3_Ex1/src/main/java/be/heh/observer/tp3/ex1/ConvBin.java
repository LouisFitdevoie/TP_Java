package be.heh.observer.tp3.ex1;

public class ConvBin implements Conversion {
    public ConvBin() {

    }

    @Override
    public void actualise(int nombre) {
        System.out.println("Conversion en binaire : " + Integer.toBinaryString(nombre));
    }
}
