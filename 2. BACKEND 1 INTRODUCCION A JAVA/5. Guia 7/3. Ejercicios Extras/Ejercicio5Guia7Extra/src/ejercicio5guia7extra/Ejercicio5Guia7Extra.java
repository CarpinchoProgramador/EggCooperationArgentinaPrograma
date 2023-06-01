package ejercicio5guia7extra;

import java.util.Scanner;

public class Ejercicio5Guia7Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado empleadoUno = new Empleado();
        Servicio sc = new Servicio();

        empleadoUno = sc.nombreEdad();
        sc.calculcar_aumento(empleadoUno);
    }
}
