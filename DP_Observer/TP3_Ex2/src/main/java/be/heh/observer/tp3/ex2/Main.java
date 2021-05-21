package be.heh.observer.tp3.ex2;

public class Main {
    public static void main(String[] args) {
        StationMeteo stationMeteo = new StationMeteo();
        stationMeteo.addObservers(new AffichageMeteo(), new AffichageStatistiquesMeteo());
        stationMeteo.setTemperatureHumidite(20,50);
        stationMeteo.setTemperatureHumidite(25,65);
        stationMeteo.setTemperatureHumidite(27,70);
        stationMeteo.setTemperatureHumidite(19,50);
    }
}
