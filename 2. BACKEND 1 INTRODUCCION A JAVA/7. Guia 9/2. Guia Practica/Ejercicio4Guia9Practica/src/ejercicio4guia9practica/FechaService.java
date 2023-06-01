package ejercicio4guia9practica;

import java.util.Date;
import java.util.Scanner;

//Vamos a usar la clase Date que ya existe en Java. 
//Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
//Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor 
//vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle
public class FechaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        int dia, mes, anio;
        System.out.println("Ingrese su dia de nacimiento: ");
        dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.println(fecha);
        return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    
     public int diferencia(Date fecha, Date fechaActual){
        int edad = fechaActual.getYear()-fecha.getYear();
        System.out.println("Usted tiene: " + edad+ " años.");
        return edad;
    }

}
