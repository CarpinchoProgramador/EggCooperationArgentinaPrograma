package ejercicio2guia9practica;

public class Servicio {
    parDeNumeros x = new parDeNumeros();
    
    public void mostrarValores(){
        System.out.println("Numero A: " + x.getNum1());
        System.out.println("Numero B: " + x.getNum2());
    }
    
    public String devolverMayor(parDeNumeros x){
        return "El mayor de los numeros es: " + Double.max(x.getNum1(), x.getNum2());
    }
    
    public int calcularPotencia(parDeNumeros x){
        int num1 = (int) Math.floor(x.getNum1());
        int num2 = (int) Math.floor(x.getNum2());
        int y = (int) Math.pow(num1, num2);
        
        if (num1 > num2) {
            y = (int) Math.pow(num1, num2);
            System.out.println("La potencia de " + num1 + " elevado a la " + num2 +" es de: " +  y);
        } else if (num1 < num2){
            y = (int) Math.pow(num2, num1);
            System.out.println("La potencia de " + num2 + " elevado a la " + num1 +" es de: " +  y);
        } else {
            System.out.println("La potencia de " + num2 + " elevado a la " + num1 +" es de: " +  y);
        }
        return y;
    }
    
    public int calculaRaiz(parDeNumeros x){
        int raizMenor = (int)Math.sqrt((int)Math.abs(Math.min(x.getNum1(), x.getNum2())));
        System.out.println("La raiz cuadrada de " + Math.min(x.getNum1(), x.getNum2()) + " es: " + raizMenor);
        return raizMenor;
    }
    
}
