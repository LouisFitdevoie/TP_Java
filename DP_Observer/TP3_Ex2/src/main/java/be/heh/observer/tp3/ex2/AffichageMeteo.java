package be.heh.observer.tp3.ex2;

public class AffichageMeteo implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("Station météo : " + "température : " + ((StationMeteo)o).getTemperature() + ", humidité : " + ((StationMeteo)o).getHumidite());
    }
}
