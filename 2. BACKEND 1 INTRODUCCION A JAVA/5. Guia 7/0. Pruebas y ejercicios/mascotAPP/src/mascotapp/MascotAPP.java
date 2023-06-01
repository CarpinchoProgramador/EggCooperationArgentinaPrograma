/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Victor", "Copito", "Perro", "Dorado/Amarillo", 7, true, "Golden Retriever");

        m1.pasear(100, 10);
        System.out.println(m1.toString());
        
    }

}
