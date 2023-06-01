/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8guia3practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio8Guia3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimensionCuadrado;
        
        System.out.println("Ingrese un numero entero");
        Scanner x = new Scanner(System.in);
        dimensionCuadrado = x.nextInt();
        
        for (int i = 0; i < dimensionCuadrado; i++) {
            for (int j = 0; j < dimensionCuadrado; j++) {
                if (i == 0 || i == dimensionCuadrado - 1 || j == 0 || j == dimensionCuadrado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
