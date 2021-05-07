package be.heh.decorateur.tp5.ex1;
import be.heh.decorateur.tp5.ex1.Composant;

public class Main {
    public static void main(String[] args) {
        Composant pizza = new BoulettesDeViande(new Thon(new FourreFromage()));
        System.out.println(pizza.calculePrix()+" " + pizza.afficheDescription());
    }
}
