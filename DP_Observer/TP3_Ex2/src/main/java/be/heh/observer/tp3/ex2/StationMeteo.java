package be.heh.observer.tp3.ex2;

import java.util.ArrayList;
import java.util.List;

public class StationMeteo extends Observable {
    private int temperature;
    private List<Integer> temperatures;
    private int humidite;

    public StationMeteo() {
        this.temperatures = new ArrayList<>();
    }
    public int getTemperature() {
        return this.temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.temperatures.add(temperature);
        super.notifierTousObservers();
    }
    public int getHumidite() {
        return this.humidite;
    }
    public void setHumidite(int humidite) {
        this.humidite = humidite;
        super.notifierTousObservers();
    }
    public List<Integer> getTemperatures() {
        return this.temperatures;
    }
    public void setTemperatureHumidite(int temperature, int humidite) {
        this.temperature = temperature;
        this.temperatures.add(temperature);
        this.humidite = humidite;
        super.notifierTousObservers();
    }
}
