package asdasdasd;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Perro> perros = new ArrayList();
    Persona p = new Persona();
    Perro pe = new Perro();
    String resp, resp1, resp2;

    public void crearPersona() {
        System.out.println("===========LISTA DE PERSONAS=========");
        do {
            Persona p = new Persona();
            System.out.println("ingrese nombre");
            p.setNombre(sc.next());
            System.out.println("ingrese apellido");
            p.setApellido(sc.next());
            System.out.println("ingrese edad");
            p.setEdad(sc.nextInt());
            System.out.println("ingrese dni");
            p.setDni(sc.nextInt());

            personas.add(p);
            System.out.println("desea ingresar otra persona? s/n");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("s"));
    }

    public void crearPerros() {
        System.out.println("======LISTA PARA PERROS=========");
        do {
            Perro pe = new Perro();
            System.out.println("ingrese nombre ");
            pe.setNombre(sc.next());
            System.out.println("ingrese raza");
            pe.setRaza(sc.next());
            System.out.println("ingrese tamaño");
            pe.setTamanio(sc.next());
            System.out.println("ingrese edad");
            pe.setEdad(sc.nextInt());

            perros.add(pe);
            System.out.println("desea ingresar otro perro? s/n");
            resp1 = sc.next();
        } while (resp1.equalsIgnoreCase("s"));
    }

    public void eleccion() {

        System.out.println("====ADOPCION========");

        do {

            System.out.println("ingrese su nombre");
            String nombre = sc.next();
            int cont1 = 0;
            for (Persona aux : personas) {
                if (aux.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("usted esta en la lista de personas para adoptar");
                    System.out.println("la lista de  perros en adopcion es la siquiente ");
                    System.out.println(perros.toString());
                    System.out.println("ingrese el nombre del perro que desea adoptar");
                    String nn = sc.next();
                    System.out.println("revisaremos la lista para ver si esta disponinle");
                    int cont = 0;
                    for (Perro aux1 : perros) {

                        if (aux1.getNombre().equalsIgnoreCase(nn)) {
                            perros.remove(cont);
                            System.out.println("el perro seleccionado es posible");
                            aux.setPerro(aux1);
                            break;
                        } else if (cont == perros.size() && !aux1.getNombre().equalsIgnoreCase(nn)) {

                            System.out.println("el perro elegido ya esta adoptado");
                        }
                        cont++;
                    }

                } else if (cont1 == personas.size() && !aux.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("no se encuentra su nombre en la lista");
                }
                cont1++;
            }
            System.out.println("hay otra persona para la eleccion del perro a adoptar? s/n");
            resp2 = sc.next();
        } while (resp2.equalsIgnoreCase("s"));
        System.out.println("la lista de las personas y los perros que se adoptaron hoy son las siguientes: ");
        System.out.println(personas.toString());

    }

}
