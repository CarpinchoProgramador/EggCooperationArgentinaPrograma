/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12guia4teorica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio12Guia4Teorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un primer numero -> ");
        num1 = leer.nextInt();
        Scanner leer2 = new Scanner(System.in);
        System.out.print("Ingrese un primer numero -> ");
        num2 = leer2.nextInt();
        
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        int multiplo;
        multiplo = num1 % num2;

        if (multiplo == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }
}
