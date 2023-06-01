/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia3practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio3Guia3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        int largo;

        System.out.println("Ingrese una frase de 8 de largo.");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine();
        largo = frase.length();
        if (largo == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
