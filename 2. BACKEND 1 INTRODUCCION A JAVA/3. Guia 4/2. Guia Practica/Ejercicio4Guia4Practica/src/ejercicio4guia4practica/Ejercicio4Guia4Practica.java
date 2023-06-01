/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia4practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio4Guia4Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numUser;
        Scanner x = new Scanner(System.in);
        System.out.print("Ingrese un numero para averiguar si es primo o no --> ");

        numUser = x.nextInt();

        System.out.println(numUser + " es " + numPrimo(numUser));
    }

    public static boolean numPrimo(int numUser) {
        if (numUser == 0 || numUser == 1 || numUser == 4) {
            return false;
        }
        for (int i = 2; i < numUser / 2; i++) {
            if (numUser % i == 0) {
                return false;
            }
        }
        return true;
    }

}
