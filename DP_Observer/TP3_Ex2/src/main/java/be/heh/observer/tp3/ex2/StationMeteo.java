package be.heh.observer.tp3.ex2;

import java.util.ArrayList;
import java.util.List;

public class StationMeteo {
    private List<MeteoListener> meteoListeners;
    public StationMeteo() {
         this.meteoListeners = new ArrayList<MeteoListener>();
    }
    public void addMeteoListener(MeteoListener listener) {
        this.meteoListeners.add(listener);
    }
    public void removeMeteoListener(MeteoListener listener) {
        this.meteoListeners.remove(listener);
    }
    public void ajouterDonnees(int degreCelsius, int humidity) {
        final MeteoEvent me = new MeteoEvent(degreCelsius,humidity);
        fireMeteoListeners(me);
    }
    protected void fireMeteoListeners(MeteoEvent me) {
        for(MeteoListener listener : meteoListeners) {
            listener.meteoRefreshed(me);
        }
    }
}
