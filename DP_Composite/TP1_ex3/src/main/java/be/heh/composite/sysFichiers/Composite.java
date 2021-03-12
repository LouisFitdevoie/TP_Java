package be.heh.composite.sysFichiers;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Composant {

    protected List<Composant> composants = new ArrayList<>();

    @Override
    public String lister() {
        String liste = "";
        for(Composant c : composants) {
            liste = liste + c.lister();
        }
        return liste;
    }

    @Override
    public void ajouter(Composant c) {
        composants.add(c);
    }

}
