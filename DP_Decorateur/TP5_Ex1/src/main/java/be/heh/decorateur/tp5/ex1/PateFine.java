package be.heh.decorateur.tp5.ex1;

public class PateFine extends Composant {
    @Override
    public String afficheDescription() {
        return "pâte fine";
    }
    @Override
    public float calculePrix() {
        return 9;
    }
}
