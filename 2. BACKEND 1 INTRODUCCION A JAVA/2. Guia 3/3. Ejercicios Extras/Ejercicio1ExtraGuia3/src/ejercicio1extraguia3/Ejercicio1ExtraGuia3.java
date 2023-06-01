/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extraguia3;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio1ExtraGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempoMinuto, tiempoDia, tiempoHora;
        System.out.println("Ingrese un valor expresado en minutos: ");

        Scanner leer = new Scanner(System.in);

        tiempoMinuto = leer.nextInt();

        tiempoDia = tiempoMinuto / 1440;
        tiempoHora = (tiempoMinuto % 1440) / 60;

        System.out.println("Tiempo en dias: " + tiempoDia);
        System.out.println("Tiempo en horas: " + tiempoHora);

    }
}
