package be.heh.decorateur.tp5.ex1;

public class FourreFromage extends Composant {
    @Override
    public String afficheDescription() {
        return "fourrée au fromage";
    }
    @Override
    public float calculePrix() {
        return 12;
    }
}
