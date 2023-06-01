package ejerciciobanco;

import java.util.Scanner;

public class EjercicioBanco {

public static void main(String[] args) {
    System.out.println("Bienvenido al cajero.");
    Cuenta usuarioUno = new Cuenta();
    Servicio sc = new Servicio();
    usuarioUno = sc.titular1();
    sc.retirar_dinero(usuarioUno);
    }
}
