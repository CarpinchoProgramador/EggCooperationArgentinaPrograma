/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extraguia3;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio4ExtraGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;

        System.out.println("Ingrese un numero del 1 al 10");
        Scanner x = new Scanner(System.in);

        num = x.nextInt();

        switch (num) {
            case 1:
                System.out.println("1 en romano es: I");
                break;
            case 2:
                System.out.println("2 en romano es: II");
                break;
            case 3:
                System.out.println("3 en romano es: III");
                break;
            case 4:
                System.out.println("4 en romano es: IV");
                break;
            case 5:
                System.out.println("5 en romano es: V");
                break;
            case 6:
                System.out.println("6 en romano es: VI");
                break;
            case 7:
                System.out.println("7 en romano es: VII");
                break;
            case 8:
                System.out.println("8 en romano es: VIII");
                break;
            case 9:
                System.out.println("9 en romano es: IX");
                break;
            case 10:
                System.out.println("10 en romano es: X");
                break;
            default:
                System.out.println("Valor no valido.");
                break;
        }

    }

}
