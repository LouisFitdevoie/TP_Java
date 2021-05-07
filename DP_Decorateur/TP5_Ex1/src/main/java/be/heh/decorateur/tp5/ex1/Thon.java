package be.heh.decorateur.tp5.ex1;

public class Thon extends Decorateur {
    public Thon(Composant pizza) {
        this.pizza=pizza;
    }
    @Override
    public String afficheDescription() {
        return pizza.afficheDescription() + " avec du thon";
    }
    @Override
    public float calculePrix() {
        return pizza.calculePrix()+2;
    }
}
