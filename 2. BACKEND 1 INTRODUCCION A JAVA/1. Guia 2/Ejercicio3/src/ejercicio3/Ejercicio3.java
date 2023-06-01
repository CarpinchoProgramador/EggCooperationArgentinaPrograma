/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        String frase;
        String fraseMinus;
        String fraseMayus;
        Scanner frasesita = new Scanner(System.in);
        
        frase = frasesita.nextLine();
        
        fraseMinus = frase.toLowerCase();
        fraseMayus = frase.toUpperCase();
        
        System.out.println("Frase minuscula: " + fraseMinus);
        System.out.println("Frase mayuscula: " + fraseMayus);
        
    }

}
