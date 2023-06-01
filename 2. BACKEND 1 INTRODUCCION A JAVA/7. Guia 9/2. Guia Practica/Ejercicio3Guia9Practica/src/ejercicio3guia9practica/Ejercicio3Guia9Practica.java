package ejercicio3guia9practica;

import java.util.Scanner;

public class Ejercicio3Guia9Practica {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double[] A = new double[50];
    double[] B = new double[20];
    System.out.println("Inicializar A");
    Servicio.inicializarA(A);
    System.out.println("Mostrar A y B");
    Servicio.mostrar(A, B);
    System.out.println("--------------------------------------");
    System.out.println("Ordenar A");
    Servicio.ordenar(A);
    System.out.println("--------------------------------------");
    System.out.println("Inicializar B");
    Servicio.inicializarB(A, B);
    System.out.println("Mostrar A y B");
    System.out.println("--------------------------------------");
    Servicio.mostrar(A, B);
    

    }

}
