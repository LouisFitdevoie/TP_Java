package be.heh.observer.tp3.ex2;

import java.util.IntSummaryStatistics;

public class AffichageStatistiquesMeteo implements Observer {
    @Override
    public void update(Object o) {
        IntSummaryStatistics statistiques = ((StationMeteo)o).getTemperatures().stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Affichage statistiques météo : " + "température max : " + statistiques.getMax() + ", température min : " + statistiques.getMin() + ", température moyenne : " + statistiques.getAverage());
    }
}
