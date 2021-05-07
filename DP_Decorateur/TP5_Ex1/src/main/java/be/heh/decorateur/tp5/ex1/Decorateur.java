package be.heh.decorateur.tp5.ex1;

public abstract class Decorateur extends Composant {

    protected Composant pizza;

    public abstract String afficheDescription();

    public abstract float calculePrix();

}
