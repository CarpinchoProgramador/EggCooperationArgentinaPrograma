package ejercicio1guia10practica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
public class Ejercicio1Guia10Practica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        List<String> perro = new ArrayList<>();
        
        int decision;
        do {
            System.out.println("Ingrese una raza de perro: ");
            perro.add(leer.next());
            System.out.println("Desea añadir otra raza mas?");
            System.out.println("1. Si");
            System.out.println("2. No");
            decision = leer.nextInt();
        } while (decision == 1);

        for (int i = 0; i < perro.size(); i++) {
            System.out.println("Perro " + i + ": " + perro.get(i));
        }

        System.out.println(perro.toString());

//        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//        la lista ordenada.
        System.out.println("Ingrese un perro para eliminar de la lista: ");
        String raza = leer.next();

        Iterator<String> it = perro.iterator();
        int cont = 0;
        
        while (it.hasNext()) {
            String razaLista = it.next();
            if (razaLista.equals(raza)) {
                it.remove();
                cont++;
            } else if (!it.hasNext() && !razaLista.equals(raza) && cont == 0) {
                System.out.println("No se encontro el perro");
            }
        }
        
        it = perro.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        for (int i = 0; i < perro.size(); i++) {
//            System.out.println("Perro " + i + ": " + perro.get(i));
//        }
    }

}
