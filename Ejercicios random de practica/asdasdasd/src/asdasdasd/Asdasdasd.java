package asdasdasd;

import java.util.Scanner;

public class Asdasdasd {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PerroService se = new PerroService();

        se.crearPersona();
        se.crearPerros();
        se.eleccion();
    }

}


