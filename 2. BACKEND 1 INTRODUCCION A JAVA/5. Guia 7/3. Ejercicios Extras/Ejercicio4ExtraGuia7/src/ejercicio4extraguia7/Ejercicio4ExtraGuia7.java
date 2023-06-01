package ejercicio4extraguia7;

import java.util.Scanner;

public class Ejercicio4ExtraGuia7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta user1 = new Cuenta();
        Servicio sc = new Servicio();

        user1 = sc.establecerNombre();
        sc.retirar_dinero(user1);
    }

}
