/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guiateoricacompañero;
import java.util.Scanner;

public class Ejercicio10GuiaTeoricaCompañero {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int numero;

        for (int j = 0; j < 4 ; j++) {

            System.out.println("Ingrese un numero");
            numero = leer.nextInt();

            if ( numero >= 1 && numero <= 20) {
                
                System.out.print(numero + " ");
                for ( int i = 0 ; i < numero ; i++ ){

                System.out.print("*");
                
                }

                System.out.println("");

            }else if( numero < 1 || numero > 20 ){

                System.out.println("El numero a ingresar tiene que estar entre 1 y 20");
                j =  j - 1;

            }

        }

        System.out.println("Ya ingreso 4 numeros! :D");

    }

}
