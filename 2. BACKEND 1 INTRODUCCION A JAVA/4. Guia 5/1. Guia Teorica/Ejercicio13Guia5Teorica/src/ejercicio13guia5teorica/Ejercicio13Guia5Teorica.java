/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13guia5teorica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio13Guia5Teorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] Equipo = new String[9];
        Scanner x = new Scanner(System.in);
        String nombreEquipo;
        
        System.out.println("Ingrese el nombre de los integrantes de su equipo.");
        
        for (int i = 0; i < 9; i++) {
            nombreEquipo = x.nextLine();
            Equipo[i]= nombreEquipo;
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.println("[" + Equipo[i] + "]");
        }
    }

}
