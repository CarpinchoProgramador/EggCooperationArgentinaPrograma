package ejercicioempleado;

import java.util.Scanner;

public class EjercicioEmpleado {

public static void main(String[] args) {
    Empleado Carpincho = new Empleado();
    Servicio sc = new Servicio();
    Carpincho = sc.datosEmpleado();
    sc.calcular_aumento(Carpincho);
    }
}
