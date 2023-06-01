/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extraguia3;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio3ExtraGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letraVocal;
        int longitudString;

        System.out.println("Ingrese una letra");
        Scanner x = new Scanner(System.in);

        letraVocal = x.nextLine();

        longitudString = letraVocal.length();

        while (longitudString != 1) {
            System.out.println("Ingrese una sola letra...");
            letraVocal = x.nextLine();
            longitudString = letraVocal.length();
        }
        
        if (letraVocal.equalsIgnoreCase("A") || letraVocal.equalsIgnoreCase("E") || letraVocal.equalsIgnoreCase("I") || letraVocal.equalsIgnoreCase("O") || letraVocal.equalsIgnoreCase("U")) {
            System.out.println("Se trata de una vocal");
        }else{
            System.out.println("No se trata de una vocal.");
        }
        
    }

}
