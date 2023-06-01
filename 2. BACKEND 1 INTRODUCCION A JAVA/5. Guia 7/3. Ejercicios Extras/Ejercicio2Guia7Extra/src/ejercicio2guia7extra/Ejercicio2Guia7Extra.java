package ejercicio2guia7extra;

import java.util.Scanner;

public class Ejercicio2Guia7Extra {

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Puntos objeto = new Puntos();
    Servicio so = new Servicio();
    objeto = so.crearPuntos();
    so.calcularPuntos(objeto);
    
    }

}
