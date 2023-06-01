/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia5practica;

import java.util.Random;

/**
 *
 * @author Laureano
 */
public class Ejercicio5Guia5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random n = new Random();
        int numeroAleatorio;

        int[][] matrizA = new int[3][3];
        int[][] matrizAT = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numeroAleatorio = n.nextInt(100);
                matrizA[i][j] = numeroAleatorio;
                matrizAT[j][i] = -(numeroAleatorio);
            }
        }

        // Comprobacion de si son transpuestas antisimetricas
        // matrizA es antisimetrica si y solo si matrizA = -matrizAT
        boolean esAntisimetrica = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] == matrizAT[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
        System.out.println("");
        System.out.println("Matriz normal");
        System.out.println("");

        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Matriz traspuesta");
        System.out.println("");
        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[j][i] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz antisimetrica");

        System.out.println("");

        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
