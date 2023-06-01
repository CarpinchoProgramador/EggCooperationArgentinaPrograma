package ejercicioempleado;

import java.util.Scanner;

//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
//Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función 
//de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o 
//del 5% si tiene menos de 30 años.

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Empleado emp1 = new Empleado();
    
    public Empleado datosEmpleado(){
        System.out.println("Ingrese el nombre del empleado: ");
        emp1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del empleado: ");
        emp1.setEdad(leer.nextDouble());
        System.out.println("Ingrese el salario del empleado: ");
        emp1.setSalario(leer.nextDouble());
        return emp1;
    }
    
    public Empleado calcular_aumento(Empleado emp1){
        if (emp1.getEdad()>=30) {
            System.out.println("Al empleado le corresponde un aumento del %10.");
            System.out.println("Sueldo actual: " + emp1.getSalario());
            System.out.println("Aumento: " + (emp1.getSalario()* 0.10));
            emp1.setSalario(emp1.getSalario() * 1.10);
            System.out.println("Sueldo final: " + emp1.getSalario());
        } else if (emp1.getEdad()<30) {
            System.out.println("Al empleado le corresponde un aumento del %5.");
            System.out.println("Sueldo actual: " + emp1.getSalario());
            System.out.println("Aumento: " + (emp1.getSalario()* 0.05));
            emp1.setSalario(emp1.getSalario() * 1.05);
            System.out.println("Sueldo final: " + emp1.getSalario());
        }
        return emp1;
    }
    
    
}
