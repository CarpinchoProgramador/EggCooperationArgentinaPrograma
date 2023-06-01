/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia3practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio4Guia3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase, caracter;
        int largoFrase;
        frase = leer.nextLine();

        caracter = frase.substring(0, 1);

        if (caracter.equals("A")) {
            System.out.println("CORRECTO");
        } else if (caracter.equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
