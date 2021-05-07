package be.heh.decorateur.tp5.ex1;

public class BoulettesDeViande extends Decorateur {
    public BoulettesDeViande(Composant pizza) {
        this.pizza=pizza;
    }
    @Override
    public String afficheDescription() {
        return pizza.afficheDescription() + " avec des boulettes";
    }
    @Override
    public float calculePrix() {
        return pizza.calculePrix()+4;
    }
}
