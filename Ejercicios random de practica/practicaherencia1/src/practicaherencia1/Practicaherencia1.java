package practicaherencia1;

import java.util.Scanner;

public class Practicaherencia1 {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Empleado Laureano = new Empleado();
    
    Laureano.setApellido(leer.nextLine());
    Laureano.setNombre(leer.nextLine());
    System.out.println("El nombre del empleado es: "+Laureano.getApellido() + " " + Laureano.getNombre());
    
    Laureano.setDni(leer.nextLong());


    }

}
