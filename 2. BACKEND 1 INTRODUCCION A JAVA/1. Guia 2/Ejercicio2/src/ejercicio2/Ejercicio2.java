/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba su nombre:");
        
        Scanner nombreTeclado = new Scanner(System.in);
        String nombre;
        nombre = nombreTeclado.next();
        
        System.out.println("Su nombre es: " + nombre);
        
    }
    
}
