package be.heh.observer.tp3.ex2;

import java.util.EventListener;

public interface MeteoListener extends EventListener {
    public void meteoRefreshed(MeteoEvent me);
}
