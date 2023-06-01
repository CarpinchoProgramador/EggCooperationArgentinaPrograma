package ejerciciointegradorjavabackend;

import java.util.Arrays;

public class Estudiante {

    private int[] nota = new int[8];
    private String[] nombre = new String[8];

    public Estudiante() {
    }

    public Estudiante(int[] nota, String[] nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nota=" + Arrays.toString(nota) + ", nombre=" + Arrays.toString(nombre) + '}';
    }

    public void rellenarNota() {
        for (int i = 0; i < this.nombre.length; i++) {
            this.nota[i] = (int) Math.floor(Math.random() * 10 + 1);
        }
    }

    public void rellenarNombre() {
        this.nombre[0] = "Enrique";
        this.nombre[1] = "Felipe";
        this.nombre[2] = "Ricardo";
        this.nombre[3] = "Eduardo";
        this.nombre[4] = "Camila";
        this.nombre[5] = "Guadalupe";
        this.nombre[6] = "La Triple T";
        this.nombre[7] = "Emilia";
    }

    public void rellenarAlumnos() {
        rellenarNota();
        rellenarNombre();
    }

    public int calcularPromedio() {
        int promedio = 0;
        for (int i = 0; i < nota.length; i++) {
            promedio = nota[i] + promedio;
        }
        promedio = promedio / 8;
        return promedio;
    }

    public void mayorPromedio() {
        System.out.println("Los Alumnos que recibieron una nota mayor al promedio (" + calcularPromedio() + ") son: ");
        for (int i = 0; i < nombre.length; i++) {
            if (calcularPromedio() < nota[i]) {
                System.out.println(nombre[i] + " : " + nota[i]);
            }
        }
    }

    public void mostrarNota() {
        System.out.println("CALIFICACIONES");
        System.out.println("---------------");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i] + " : " + nota[i]);
        }
    }

    public void programaRun() {
        rellenarNota();
        System.out.println("--------------------------");
        rellenarNombre();
        System.out.println("--------------------------");
        mostrarNota();
        System.out.println("--------------------------");
        mayorPromedio();
    }

}
