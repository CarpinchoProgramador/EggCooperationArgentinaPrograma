/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio2Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tipo de motor");
        
        Scanner motor = new Scanner(System.in);
        
        int tipoMotor;
        tipoMotor = motor.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("“La bomba es una bomba de agua”");
                break;
                
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break:
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
                break;
        }
    }
    
}
