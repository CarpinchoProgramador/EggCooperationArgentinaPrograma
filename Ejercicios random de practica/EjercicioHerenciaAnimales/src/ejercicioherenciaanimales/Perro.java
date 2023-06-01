package ejercicioherenciaanimales;

public class Perro extends Animal {

    protected String raza;
    protected String tamano;

    public Perro() {
    }

    public Perro(String raza, String tamano, String nombre, String color, int edad) {
        super(nombre, color, edad);
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
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

    public Perro crearPerro() {
        Perro pichicho = new Perro();
        pichicho.setEdad(4);
        pichicho.setRaza("calle");
        pichicho.setColor("Naranja");
        pichicho.setNombre("Pinta");
        pichicho.setTamano("Mediano");
        System.out.println(pichicho.toString());
        return new Perro();
    }
    
    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tamano=" + tamano + '}';
    }
    
    public String hacerRuido() {
        return "guau";
    }

}
