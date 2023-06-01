/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioegg1;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class EjercicioEgg1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("Ingrese el primer numero: ");
       
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        numero = reader.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        
        Scanner reader1 = new Scanner(System.in);
        int numero1 = 0;
        numero1 = reader1.nextInt();
        
        int suma;
        suma = numero + numero1;
        
        System.out.println("La suma de los numeros " + numero + " y " + numero1 + " = " + suma);
   }	
}



    

