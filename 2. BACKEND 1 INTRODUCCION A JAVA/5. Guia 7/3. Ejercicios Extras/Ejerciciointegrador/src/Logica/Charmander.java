package Logica;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander utiliza placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Charmander utiliza arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander utiliza mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander utiliza puño fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander utiliza lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander utiliza ascuas");
    }

}
