/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9guiateorica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio9GuiaTeorica {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int num, suma = 0, i = 0;
         
         do {
            i++;
            System.out.print("Introduce el número " + i + ": ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (num > 0) {
                suma += num;
            }
        } while (i < 20);
        
        System.out.println("La suma de los números positivos es: " + suma);
        sc.close();
    }
         
        
    

}
    

