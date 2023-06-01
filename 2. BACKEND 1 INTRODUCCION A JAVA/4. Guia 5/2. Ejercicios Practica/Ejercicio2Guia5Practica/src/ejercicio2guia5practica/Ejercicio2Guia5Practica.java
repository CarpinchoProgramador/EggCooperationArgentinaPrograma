/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia5practica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio2Guia5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random n = new Random();
        int numeroAleatorio;
        

        int[] vector = new int[1000];

        for (int i = 0; i < vector.length; i++) {
            numeroAleatorio = n.nextInt(100);
            vector[i] = numeroAleatorio;
        }

        System.out.println("Ingrese un numero a buscar en el array");
        Scanner x = new Scanner(System.in);
        int numeroUsuario = x.nextInt();
        int contador;
        contador = 0;
        

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroUsuario) {
                System.out.println("El numero se encuentra en el array en la posicion: " + i);
                contador = contador + 1;
            }
            
        }
        if (contador == 0) {
            System.out.println("El numero no se encuentra en el array.");
        } else if (contador >= 1) {
            System.out.println("El numero se encontró " + contador + " veces.");
        }
    }

}
