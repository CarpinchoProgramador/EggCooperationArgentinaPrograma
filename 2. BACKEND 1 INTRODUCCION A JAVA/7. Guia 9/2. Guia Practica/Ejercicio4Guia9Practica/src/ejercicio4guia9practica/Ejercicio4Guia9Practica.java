package ejercicio4guia9practica;

import java.util.Scanner;

public class Ejercicio4Guia9Practica {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    FechaService fs = new FechaService();
    
    fs.diferencia(fs.fechaNacimiento(), fs.fechaActual());
    
    }
}
