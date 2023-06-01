/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia5practica;

import java.util.Random;

/**
 *
 * @author Laureano
 */
public class Ejercicio3Guia5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random n = new Random();
        int numeroAleatorio, contador1, contador2, contador3, contador4, contador5;
        numeroAleatorio = n.nextInt(15000);
        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        contador4 = 0;
        contador5 = 0;

        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            numeroAleatorio = n.nextInt(15000);
            vector[i] = numeroAleatorio;
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 10) { //Numeros de un digito
                contador1 = contador1 + 1;
            } else if (vector[i] < 100 && vector[i] > 9) { // numeros de dos digitos
                contador2 = contador2 + 1;
            } else if (vector[i] < 1000  && vector[i] > 99) { // numeros de tres digitos
                contador3 = contador3 + 1;
            } else if (vector[i] < 10000 && vector[i] > 999) { // numeros de cuatro digitos
                contador4 = contador4 + 1;
            } else if (vector[i] < 100000 && vector[i] > 9999) { // numeros de cinco digitos
                contador5 = contador5 + 1;
            }

        }

        System.out.println("En total hay: ");
        System.out.println(contador1 + " numeros de un digito");
        System.out.println(contador2 + " numeros de dos digitos");
        System.out.println(contador3 + " numeros de tres digitos");
        System.out.println(contador4 + " numeros de cuatro digitos");
        System.out.println(contador5 + " numeros de cinco digitos");

    }

}
