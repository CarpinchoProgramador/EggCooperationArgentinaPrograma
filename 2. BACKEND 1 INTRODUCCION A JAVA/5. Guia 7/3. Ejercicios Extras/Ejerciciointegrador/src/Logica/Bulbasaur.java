package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur utiliza placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Bulbasaur utiliza arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur utiliza mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur utiliza drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur utiliza paralizar");
    }

}
