/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero y se mostrará el doble, el triple y su raiz cuadrada: ");
        Scanner numUser = new Scanner(System.in);
        int numUser1 = numUser.nextInt();
        int numDoble;
        int numTriple;
        double numRaiz;
        
        numDoble = numUser1 * 2;
        numTriple = numUser1 * 3;
        numRaiz = Math.sqrt(numUser1);
        
        System.out.println("El doble del numero es: " + numDoble);
        System.out.println("El triple del numero es: " + numTriple);
        System.out.println("La raiz del numero es: " + numRaiz);
        
        
    }
    
}
