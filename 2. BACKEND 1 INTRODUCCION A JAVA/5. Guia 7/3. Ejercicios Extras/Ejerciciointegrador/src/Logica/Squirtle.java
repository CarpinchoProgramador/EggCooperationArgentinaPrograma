package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirttle utiliza placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Squirttle utiliza arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirttle utiliza mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirttle utiliza hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirttle utiliza burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirttle utiliza pistola agua");
    }

}
