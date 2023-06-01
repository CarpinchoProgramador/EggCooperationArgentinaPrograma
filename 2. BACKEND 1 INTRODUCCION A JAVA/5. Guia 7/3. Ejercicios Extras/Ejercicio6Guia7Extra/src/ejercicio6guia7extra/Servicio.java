package ejercicio6guia7extra;

public class Servicio {

    Rectangulo ob1 = new Rectangulo();

    public Rectangulo lados() {
        ob1.setLado1(4);
        ob1.setLado2(6);
        return ob1;
    }
    public int calcular_area(Rectangulo ob1){
        int Area = ob1.getLado1() * ob1.getLado2();
        System.out.println("El area del rectangulo es: " + Area);
        return Area;
    }

}
