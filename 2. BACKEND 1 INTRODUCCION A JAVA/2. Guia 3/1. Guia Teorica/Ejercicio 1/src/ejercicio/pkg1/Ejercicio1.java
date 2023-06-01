/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros");
        
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner (System.in);
        
        int numUser1;
        numUser1 = num1.nextInt();
        int numUser2;
        numUser2 = num2.nextInt();
        
        if (numUser1 > 25 && numUser2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        }else if(numUser1 > 25){
            System.out.println("El primer numero ingresado es mayor a 25");
        }else if(numUser2 > 25){
            System.out.println("El segundo numero ingresdo es mayor a 25");
        }else{
            System.out.println("Ningun numero es mayor a 25");
        }
       
        
        
    }
    
}
