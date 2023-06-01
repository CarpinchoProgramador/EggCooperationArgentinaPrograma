/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8guiateorica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio8GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int notaUser = 17;
        System.out.println("Ingrese una nota entre 0 y 10.");
       
        
        while(notaUser < 0 || notaUser > 10){
            
            Scanner nota = new Scanner(System.in);
            notaUser = nota.nextInt();
            if (notaUser < 0 || notaUser > 10) {
              System.out.println("Nota invalida. Intentelo nuevamente.");  
            }
        }
           System.out.println("La nota introducida es: " + notaUser);
    }
    
}
