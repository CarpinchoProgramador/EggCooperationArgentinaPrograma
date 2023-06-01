package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu utiliza placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Pikachu utiliza arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu utiliza mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu utiliza impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu utiliza puño trueno");
    }

}
