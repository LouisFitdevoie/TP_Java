package be.heh.observer.tp3.ex2;

public class AffichageCondition implements MeteoListener {
    public void meteoRefreshed(MeteoEvent me) {
        System.out.println("Température : " + me.getDegree() + "°C - Humidité : " + me.getHumidity() + "%");
    }
}
