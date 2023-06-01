package ejercicio3guia7practica;

public class Ejercicio3Guia7Practica {

    public static void main(String[] args) {
        Operacion ob2 = new Operacion();
        Servicio so = new Servicio();

        ob2 = so.crearOperacion();
        so.suma(ob2);
        System.out.println("");
        System.out.println("El resultado de la suma es: " + so.suma);
        System.out.println("");
        so.resta(ob2);
        so.multiplicacion(ob2);
        so.division(ob2);
    }
}
