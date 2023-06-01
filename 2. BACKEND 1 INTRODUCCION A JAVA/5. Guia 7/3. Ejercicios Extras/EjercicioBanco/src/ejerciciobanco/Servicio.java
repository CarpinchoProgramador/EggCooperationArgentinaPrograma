package ejerciciobanco;

import java.util.Scanner;

public class Servicio {
    double saldoRetiro = 0;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta titular1 = new Cuenta();
    
    public Cuenta titular1(){
        titular1.setSaldo(20000);
        titular1.setTitular("Laureano");
        return titular1;
    }
    
    public Cuenta retirar_dinero(Cuenta titular1) {
        System.out.print("Ingrese la cantidad de dinero a retirar: $");
        saldoRetiro = leer.nextDouble();
        if (saldoRetiro > titular1.getSaldo()) {
            System.out.println("No puede retirar esa cantidad de dinero.");
            
        } else if (saldoRetiro <= titular1.getSaldo()) {
            titular1.setSaldo(titular1.getSaldo()-saldoRetiro);
            System.out.println("Usted retiró: $" + saldoRetiro);
            System.out.println("Su saldo ahora es de: " + titular1.getSaldo());
        }
        return titular1;
    }
    
}
