/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extraguia3;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio2ExtraGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B, C, D, aux;

        System.out.println("Ingrese un valor para A");
        Scanner x = new Scanner(System.in);
        A = x.nextInt();

        System.out.println("Ingrese un valor para B");
        Scanner y = new Scanner(System.in);
        B = y.nextInt();

        System.out.println("Ingrese un valor para C");
        Scanner z = new Scanner(System.in);
        C = z.nextInt();

        System.out.println("Ingrese un valor para D");
        Scanner m = new Scanner(System.in);
        D = m.nextInt();

        System.out.println("El valor de A: " + A);
        System.out.println("El valor de B: " + B);
        System.out.println("El valor de C: " + C);
        System.out.println("El valor de D: " + D);

        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        
        System.out.println("");
        
        System.out.println("El nuevo valor de A: " + A);
        System.out.println("El nuevo valor de B: " + B);
        System.out.println("El nuevo valor de C: " + C);
        System.out.println("El nuevo valor de D: " + D);
    }

}
