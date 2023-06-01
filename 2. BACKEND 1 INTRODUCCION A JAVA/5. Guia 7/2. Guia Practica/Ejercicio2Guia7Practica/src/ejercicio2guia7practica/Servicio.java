package ejercicio2guia7practica;

import java.util.Scanner;


/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:

Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
public class Servicio {

    Scanner leer = new Scanner(System.in);

    Circunferencia circuloUno = new Circunferencia();

    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio para su circunferencia: ");
        circuloUno.setRadio(leer.nextDouble());
        return circuloUno;
    }
    
    public double area(Circunferencia circuloUno){
        double Area = (3.14*circuloUno.getRadio())*(3.14*circuloUno.getRadio());
        System.out.println("El area de la circunferencia es: " + Area);
        return Area;
    }
    
    public double perimetro(Circunferencia circuloUno) {
        double perimetro = 2 * 3.14 * circuloUno.getRadio();
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
        return perimetro;
    }
}
