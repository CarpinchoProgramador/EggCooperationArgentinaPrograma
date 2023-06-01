package ejercicioherenciaanimales;

public class Animal {

    protected String nombre;
    protected String color;
    protected int edad;
    
    public Animal() {
    }

    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + '}';
    }
       
    
    public String hacerRuido() {
        return "Holaa";
    }

}
