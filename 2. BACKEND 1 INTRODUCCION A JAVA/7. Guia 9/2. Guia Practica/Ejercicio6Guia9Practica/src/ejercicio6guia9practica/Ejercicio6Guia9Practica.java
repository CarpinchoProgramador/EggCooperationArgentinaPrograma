package ejercicio6guia9practica;

import java.util.Scanner;

public class Ejercicio6Guia9Practica {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso escuela1 = new Curso();
    escuela1.crearCurso();
    escuela1.calcularGananciaSemanal();

    }

}
