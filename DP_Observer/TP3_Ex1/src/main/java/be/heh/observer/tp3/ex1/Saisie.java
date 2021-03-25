package be.heh.observer.tp3.ex1;

import java.util.ArrayList;
import java.util.List;

public class Saisie {
    private List<Conversion> conversions = new ArrayList<Conversion>();
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
        notifieTousConversion();
    }

    public void attach(Conversion conv){
        conversions.add(conv);
    }

    public void notifieTousConversion(){
        for (Conversion conversion : conversions) {
            conversion.actualise();
        }
    }
}
