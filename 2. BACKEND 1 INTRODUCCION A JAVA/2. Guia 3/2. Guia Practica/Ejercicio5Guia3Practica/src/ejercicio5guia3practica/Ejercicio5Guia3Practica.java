/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia3practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio5Guia3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorLimite;
        int pepe;
        int suma;
        suma = 0;
        
        System.out.println("Ingrese un valor limite positivo");
        Scanner leer = new Scanner(System.in);

        valorLimite = leer.nextInt();

        System.out.println("Ingrese numeros positivos y se sumaran hasta llegar o superar el valor limite");
        Scanner leerNum = new Scanner(System.in);

        while (suma < valorLimite) {
            pepe = leerNum.nextInt();
            suma = pepe + suma;
        }

    }

}
