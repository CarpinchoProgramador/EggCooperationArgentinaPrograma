/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia5practica;

/**
 *
 * @author Laureano
 */
public class Ejercicio1Guia5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[100];

        
        for (int i = 0; i < 100; i++) {
            numeros[i] = i;
        }

        for (int i = 100-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}
