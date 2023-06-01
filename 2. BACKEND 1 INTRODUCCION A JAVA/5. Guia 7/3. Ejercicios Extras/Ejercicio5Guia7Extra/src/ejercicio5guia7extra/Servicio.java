package ejercicio5guia7extra;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Empleado sujetoX = new Empleado();

    public Empleado nombreEdad() {
        System.out.println("Ingrese el nombre del empleado: ");
        sujetoX.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del empleado: ");
        sujetoX.setEdad(leer.nextInt());
        System.out.print("Ingrese el salario del empleado: $");
        sujetoX.setSalario(leer.nextDouble());
        return sujetoX;
    }

    public void calculcar_aumento(Empleado sujetoX) {
        if (sujetoX.getEdad() >= 30) {
            System.out.println(sujetoX.getNombre() + " obtuvo un aumento del 10%. Obtuvo un aumento de: $" + sujetoX.getSalario() * 0.10);
            sujetoX.setSalario(sujetoX.getSalario() * 1.10);
            System.out.println("Ahora el salario de " + sujetoX.getNombre() + " es de : $" + sujetoX.getSalario());
        } else if (sujetoX.getEdad() < 30) {
            System.out.println(sujetoX.getNombre() + " obtuvo un aumento del 5%.  Obtuvo un aumento de: $" + sujetoX.getSalario() * 0.05);
            sujetoX.setSalario(sujetoX.getSalario() * 1.05);
            System.out.println("Ahora el salario de " + sujetoX.getNombre() + " es de : $" + sujetoX.getSalario());
        }
    }
}
