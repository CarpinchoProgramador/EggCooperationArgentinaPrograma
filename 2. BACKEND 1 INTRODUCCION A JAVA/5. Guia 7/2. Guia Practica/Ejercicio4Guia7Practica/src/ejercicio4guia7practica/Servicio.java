/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia7practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    Rectangulo ob1 = new Rectangulo();
    double superficie, perimetro;

    public Rectangulo ingresarDatos() {
        System.out.println("Ingrese la altura del rectangulo: ");
        ob1.setAltura(leer.nextInt());
        System.out.println("Ingrese la base del rectangulo: ");
        ob1.setBase(leer.nextInt());
        return ob1;
    }

    public double calcSuperficie(Rectangulo ob1) {
        superficie = ob1.getAltura() * ob1.getBase();
        return superficie;
    }

    public double calcPerimetro(Rectangulo ob1) {
        perimetro = (ob1.getAltura() * ob1.getBase()) * 2;
        return perimetro;
    }

    public void DibujaRectanguloAsteriscos(Rectangulo ob1) {
        for (int i = 1; i <= ob1.getAltura(); i++) {
            for (int j = 1; j <= ob1.getBase(); j++) {
                if (i == 1 || i == ob1.getAltura() || j == 1 || j == ob1.getBase()) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
