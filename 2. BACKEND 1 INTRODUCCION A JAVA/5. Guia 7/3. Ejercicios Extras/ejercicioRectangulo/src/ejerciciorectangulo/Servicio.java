package ejerciciorectangulo;

//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y 
//un método "calcular_area" que calcule y devuelva el área del rectángulo. 
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y 
//imprime el área del rectángulo.

public class Servicio {
    Rectangulo rec1 = new Rectangulo();
    
    public Rectangulo calcular_area(Rectangulo rec1){
        double area = rec1.getLado1()*rec1.getLado2();
        System.out.println("El area del rectangulo es: " + area);
        return rec1;
    }
}
