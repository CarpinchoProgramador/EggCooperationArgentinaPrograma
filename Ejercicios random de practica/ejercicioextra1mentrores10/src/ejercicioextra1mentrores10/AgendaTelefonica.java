package ejercicioextra1mentrores10;

public class AgendaTelefonica {

    private int numTel;
    private String nombre;

    public AgendaTelefonica(int numTel, String nombre) {
        this.numTel = numTel;
        this.nombre = nombre;
    }

    public AgendaTelefonica() {
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "AgendaTelefonica{" + "numTel=" + numTel + ", nombre=" + nombre + '}';
    }

    
    
    
}
