package be.heh.observer.tp3.ex2;

import java.util.EventObject;

public class MeteoEvent extends EventObject {
    private int degree, humidity;
    public MeteoEvent(int degreCelsius, int humidityPercentage) {
        super(null);
        this.degree = degreCelsius;
        this.humidity = humidityPercentage;
    }
    public int getDegree() {
        return this.degree;
    }
    public int getHumidity() {
        return this.humidity;
    }
}
