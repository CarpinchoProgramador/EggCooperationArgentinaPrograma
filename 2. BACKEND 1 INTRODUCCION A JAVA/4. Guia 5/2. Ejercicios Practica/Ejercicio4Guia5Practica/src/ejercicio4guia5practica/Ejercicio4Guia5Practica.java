/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia5practica;

import java.util.Random;

/**
 *
 * @author Laureano
 */
public class Ejercicio4Guia5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random n = new Random();
        int numeroAleatorio;
        numeroAleatorio = n.nextInt(50);
        
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numeroAleatorio = n.nextInt(50);
                matriz[i][j] = numeroAleatorio;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numeroAleatorio = n.nextInt(50);
                matrizT[i][j] = matriz[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizT[i][j] + "]" );
            }
            System.out.println("");
        }
        
    }

}
