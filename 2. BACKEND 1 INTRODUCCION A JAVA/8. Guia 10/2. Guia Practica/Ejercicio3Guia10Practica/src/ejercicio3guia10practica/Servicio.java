package ejercicio3guia10practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//      En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//      toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//      pregunta al usuario si quiere crear otro Alumno o no.
//      Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//      Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//      final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//      del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//      promedio final, devuelto por el método y mostrado en el main.
public class Servicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    List<Alumno> alumnos = new ArrayList();

    public void crearAlumno() {
        int decision = 1;
        
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();

            List<Integer> notas = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota " + (i + 1) + " del alumno: [Valores entre (0 / 10)]");
                int nota = leer.nextInt();
                if (nota > 10 || nota < 0) {
                    System.out.println("Nota invalida");
                    if (i >= 0) {
                        i--;
                    }
                } else {
                    notas.add(nota);
                }
            }

            Alumno x = new Alumno(nombre, (ArrayList<Integer>) notas);

            alumnos.add(x);

            do {
                System.out.println("Desea agregar otro alumno?");
                System.out.println("1. Si");
                System.out.println("2. No");

                decision = leer.nextInt();

                if (decision != 1 && decision != 2) {
                    System.out.println("Valor invalido. Intente nuevamente.");
                }
            } while (decision != 1 && decision != 2);

        } while (decision == 1);

    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = leer.next();

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                int sum = 0;
                for (Integer nota : notas) {
                    sum += nota;
                }
                double promedio = sum / notas.size();
                System.out.println("El promedio final de " + alumno.getNombre() + " es de: ( " + promedio + " )");
                return;

            }

        }
        System.out.println("no se encontro el alumno...");

    }

    public void mostrarAlumno(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre()+ ": " + alumno.getNotas());
        }
    }
    
    
    public void ejecutar() {
        crearAlumno();
        mostrarAlumno();
        notaFinal();
    }

}
