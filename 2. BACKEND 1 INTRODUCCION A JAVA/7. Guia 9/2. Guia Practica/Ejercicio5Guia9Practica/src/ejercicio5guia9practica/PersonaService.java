package ejercicio5guia9practica;

import java.util.Date;
import java.util.Scanner;
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. 
//Retorna true si la persona es menor que la edad consultada o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona perX = new Persona();
    Date fechaActual = new Date();

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre: ");
        perX.setNombre(leer.nextLine());
        System.out.println("Dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Año de nacimiento: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio, mes-1, dia);
        perX.setFechaDeNacimiento(fecha);
        return perX;
    }
    
    public int calcularEdad(Persona perX, Date fechaActual){
        int edad = fechaActual.getYear()-perX.getFechaDeNacimiento().getYear()+1900;
        System.out.println("Usted tiene: " + edad+ " años.");
        return edad;
    }
    
    public boolean menorQue(Persona perX){
        System.out.println("Ingrese una edad para consultar: ");
        int edadAux = leer.nextInt();
        return edadAux <= calcularEdad(perX, fechaActual);      
    }
    
    public void mostrarPersona(Persona perX){
        System.out.println("Fecha de nacimiento: " + perX.getFechaDeNacimiento().getDate() + "/" + (perX.getFechaDeNacimiento().getMonth()+1) + "/" + perX.getFechaDeNacimiento().getYear());
        System.out.println("Nombre: " + perX.getNombre());
    }    
    
//    public void diferencia(LocalDate fecha1,LocalDate fecha2) {
//        Period periodo = fecha1.until(fecha2);
//        int anios = periodo.getYears();
//        int meses = periodo.getMonths();
//        int dias = periodo.getDays();
//        System.out.println(anios + " años " + meses + " meses " + dias + " días");
//    }
}
