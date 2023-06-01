package ejercicio4guia10practica;

import java.util.Scanner;

public class Ejercicio4Guia10Practica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PeliculaService y = new PeliculaService();
        y.crearPelicula();
        y.mostrarPeliculas();
    }
}
