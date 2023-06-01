package ejercicio5guia9practica;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio5Guia9Practica {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date fechaActual = new Date();
    PersonaService sc = new PersonaService();
    Persona per1 = new Persona();
    per1 =sc.crearPersona();
    System.out.println("--------------------------");
    System.out.println(per1.toString());
    sc.calcularEdad(per1,fechaActual);
    sc.mostrarPersona(per1);
    }
}
