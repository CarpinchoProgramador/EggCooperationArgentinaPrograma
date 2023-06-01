package ejercicio1guia7extra;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cancion ob1 = new Cancion();

    public Cancion datosCancion() {
        System.out.println("Ingrese un titulo: ");
        ob1.setTitulo(leer.next());
        System.out.println("Ingrese un autor: ");
        ob1.setAutor(leer.next());
        return ob1;
    }
    
    public static void escribirDatos(Cancion ob1) {
        System.out.println("La cancion que usted colocó es: " + ob1.getTitulo() + " de " + ob1.getAutor());
    }
}
