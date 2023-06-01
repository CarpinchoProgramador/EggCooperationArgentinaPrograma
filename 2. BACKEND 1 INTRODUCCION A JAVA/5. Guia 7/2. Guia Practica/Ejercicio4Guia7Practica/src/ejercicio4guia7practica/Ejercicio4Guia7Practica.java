/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia7practica;

/**
 *
 * @author Laureano
 */
public class Ejercicio4Guia7Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio so = new Servicio();

        Rectangulo ob2 = new Rectangulo();
        ob2 = so.ingresarDatos();
        so.calcSuperficie(ob2);
        so.calcPerimetro(ob2);
        so.DibujaRectanguloAsteriscos(ob2);
    }
}
