package be.heh.observer.tp3.ex1;

public class ConvOctale extends Conversion {
    public ConvOctale(Saisie saisie) {
        this.saisie = saisie;
    }

    @Override
    public void actualise() {
        System.out.println("Conversion en octal : " + Integer.toOctalString(saisie.getNombre()));
    }
}
