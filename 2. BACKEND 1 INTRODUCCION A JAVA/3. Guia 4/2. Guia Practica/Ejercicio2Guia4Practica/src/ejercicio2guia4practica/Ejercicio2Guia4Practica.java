/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia4practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio2Guia4Practica {

    /**
     * @param args the command line arguments
     */
    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los 
    datos de las personas ingresadas por teclado e indique si son mayores o 
    menores de edad. Después de cada persona, el programa debe preguntarle al 
    usuario si quiere seguir mostrando personas y frenar cuando el usuario 
    ingrese la palabra “No”.

     */
    public static void main(String[] args) {

        String n;
        n = "si";

        Scanner x = new Scanner(System.in);

        while (n.equalsIgnoreCase("si")) {
            x();
            System.out.println("¿Desea continuar con el programa? Si / No");
            n = x.nextLine();
        }
        System.out.println("Gracias por usar el programa!");
    }

    public static void x() {
        String nombrePersona;
        int edadPersona;

        Scanner nombre = new Scanner(System.in);
        Scanner edad = new Scanner(System.in);

        System.out.print("Ingrese una edad -> ");
        edadPersona = edad.nextInt();
        System.out.print("Ingrese un nombre -> ");
        nombrePersona = nombre.nextLine();

        if (edadPersona >= 18) {
            System.out.println(nombrePersona + " es mayor de edad.");
        } else if (edadPersona < 0) {
            System.out.println(nombrePersona + " ni siquiera nació");
        } else if (edadPersona <= 17) {
            System.out.println(nombrePersona + " es menor de edad.");
        }

    }
}
