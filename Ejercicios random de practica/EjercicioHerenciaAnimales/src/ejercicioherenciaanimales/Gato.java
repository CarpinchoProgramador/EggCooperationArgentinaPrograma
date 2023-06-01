package ejercicioherenciaanimales;

public class Gato extends Animal {

    protected String raza;

    public Gato() {
    }

    public Gato(String raza, String nombre, String color, int edad) {
        super(nombre, color, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Gato crearGato() {
        Gato michi = new Gato();
        michi.setEdad(4);
        michi.setRaza("calle");
        michi.setColor("Naranja");
        michi.setNombre("Pinta");
        return michi;
    }
    
    public String hacerRuido(){
        return "miau";
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }

}
