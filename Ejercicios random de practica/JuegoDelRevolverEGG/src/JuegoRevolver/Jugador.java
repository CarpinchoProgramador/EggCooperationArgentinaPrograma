package JuegoRevolver;

public class Jugador {

    private int id;
    private String nombre;
    public boolean mojado;
    private RevolverDeAgua revolver;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado, RevolverDeAgua revolver) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
        this.revolver = revolver;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverDeAgua revolver) {
        if (revolver.mojar()) {
            setMojado(true);
            System.out.println(" moriste...");
            revolver.siguienteChorro();
            return true;
        } else {
            revolver.siguienteChorro();
            setMojado(false);
            System.out.println(" viviste...");
            return false;
        }

    }

}
