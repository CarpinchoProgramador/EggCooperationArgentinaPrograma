package ejercicioextra1mentrores10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
//La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y 
//mostrar los contactos ordenados alfabéticamente por nombre.
//En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono). 
//Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre, 
//mostrar todos los contactos o 
//mostrar los contactos ordenados alfabéticamente.
public class AgendaService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    HashMap<String, Integer> agenda = new HashMap<>();

    public void menu() {

        int var = 0;
        do {
            System.out.println("-----Seleccione una opcion-----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar contacto");
            System.out.println("4. Mostrar contacto alfabeticamente");
            System.out.println("5. Salir del programa.");
            var = leer.nextInt();

            switch (var) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    mostrarContacto();
                    break;
                case 4:
                    mostrarAlfabeticamente();
                    break;
                default:
                    System.out.println("Gracias por usar el programa!");
            }

        } while (var != 5);

    }

    public void agregarContacto() {
        System.out.println("Ingrese el nombre del contacto que quiera agregar: ");
        String nombre = leer.next();
        System.out.println("Ingrese el numero de contacto de la persona que quiere agregar: ");
        Integer num = leer.nextInt();
        agenda.put(nombre, num);
    }

    public void buscarContacto() {
        System.out.println("Ingrese el nombre del contacto que quiere buscar: ");
        String nombre = leer.next();
        for (Map.Entry<String, Integer> ag : agenda.entrySet()) {
            if (ag.getKey().equalsIgnoreCase(nombre)) {
                System.out.println(nombre);
                System.out.println("Numero de telefono: " + ag.getValue());
                return;
            }
        }
        System.out.println(nombre + " no se encuentra en la lista de contactos");
    }

    public void mostrarContacto() {
        for (Map.Entry<String, Integer> ag : agenda.entrySet()) {
            System.out.println("Nombre: " + ag.getKey() + " Numero: " + ag.getValue());
        }
    }

    public void mostrarAlfabeticamente() {
        TreeMap<String, Integer> aux = new TreeMap<>();
        aux.putAll(agenda);
        for (Map.Entry<String, Integer> ag : aux.entrySet()) {
            System.out.println("Nombre: " + ag.getKey() + " Numero: " + ag.getValue());
        }

    }

}
