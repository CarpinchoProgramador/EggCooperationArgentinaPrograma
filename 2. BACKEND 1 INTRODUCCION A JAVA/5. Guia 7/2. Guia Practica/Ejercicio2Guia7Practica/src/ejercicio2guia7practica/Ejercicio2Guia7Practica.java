package ejercicio2guia7practica;

public class Ejercicio2Guia7Practica {

    public static void main(String[] args) {
        Circunferencia circuloDos = new Circunferencia();
        Servicio sc = new Servicio();
        
        circuloDos = sc.crearCircunferencia();
        sc.area(circuloDos);
        sc.perimetro(circuloDos);
     }
}
