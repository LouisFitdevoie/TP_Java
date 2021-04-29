package be.heh.observer.tp3.ex1;

public class ConvOctale implements Conversion {
    public ConvOctale() {
    }

    @Override
    public void actualise(int nombre) {
        System.out.println("Conversion en octal : " + Integer.toOctalString(nombre));
    }
}
