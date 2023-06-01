/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una temperatura en grados celsius para realizar la conversión a fahrenheint: ");
        Scanner c = new Scanner(System.in);
        int tempCels;
        int tempFahr;
        
        tempCels = c.nextInt();
        
        tempFahr = 32 + (9 * tempCels / 5);
        
        System.out.println("Celsius = " + tempCels);
        System.out.println("Fahrenheint = " + tempFahr);
             
        
    }
    
}
