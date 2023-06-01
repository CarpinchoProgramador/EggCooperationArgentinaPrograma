package ejercicio4extraguia7;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta ob1 = new Cuenta();

    public Cuenta establecerNombre() {
        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        ob1.setTitular(leer.nextLine());
        ob1.setSaldo(23143);
        System.out.println("El saldo de " + ob1.getTitular() + " es de : $" + ob1.getSaldo());
        return ob1;
    }

    public void retirar_dinero(Cuenta ob1) {
        double retiroSaldo = 0;

        System.out.print("Ingrese el saldo a retirar: $");

        retiroSaldo = leer.nextDouble();

        if (retiroSaldo < 0) {
            System.out.println("Operacion Invalida");
        } else if (retiroSaldo <= ob1.getSaldo()) {
            ob1.setSaldo(ob1.getSaldo() - retiroSaldo);
            System.out.println("Usted retiró exitosamente la suma de: $" + retiroSaldo);
            System.out.println("Su saldo actual es de: $" + ob1.getSaldo());
            System.out.println("---------------------------------");

        } else if (retiroSaldo > ob1.getSaldo()) {
            System.out.println("El dinero que desea retirar es mayor al que usted posee en su caja de ahorro. Intentelo nuevamente");
            System.out.println("Saldo actual: $" + ob1.getSaldo());
        } else {
            System.out.println("Rompiste el codigo, felicidades!");
        }

    }

}
