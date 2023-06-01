package ejerciciorectangulo;

import java.util.Scanner;

public class EjercicioRectangulo {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        Servicio sc = new Servicio();
        rectangulo1.setLado1(4);
        rectangulo1.setLado2(6);

        rectangulo1 = sc.calcular_area(rectangulo1);
    }
}
