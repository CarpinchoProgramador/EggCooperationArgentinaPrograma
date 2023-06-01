package ejercicio3guia9practica;

import java.util.Arrays;

public class Servicio {

    public static void inicializarA(double[] arregloA) {
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random() * 10000;
        }
    }

    public static void mostrar(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 50; i++) {
            System.out.println("Arreglo A Nro: (" + i + ") [" + arregloA[i] + "]");
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < 20; i++) {
            if (arregloB[i] != 0) {
                System.out.println("Arreglo B Nro: (" + i + ") [" + arregloB[i] + "]");
            }
        }
    }

    public static void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
    }

    public static void inicializarB(double[] arregloA, double[] arregloB) {
        Arrays.fill(arregloB, 0.5);
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
    }

}
