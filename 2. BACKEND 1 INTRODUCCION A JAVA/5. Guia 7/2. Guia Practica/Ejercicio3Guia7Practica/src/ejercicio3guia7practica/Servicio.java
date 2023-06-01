package ejercicio3guia7practica;

import java.util.Scanner;

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa 
al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    Operacion ob1 = new Operacion();
    
    double division, suma, resta, multiplicar;

    public Operacion crearOperacion() {
        System.out.println("Ingrese dos numeros enteros");
        ob1.setNumero1(leer.nextInt());
        ob1.setNumero2(leer.nextInt());
        return ob1;
    }

    public double suma(Operacion ob1) {
        suma = ob1.getNumero1() + ob1.getNumero2();
        System.out.println("La suma de los numeros es: " + suma);
        return suma;
    }

    public double resta(Operacion ob1) {
        resta = ob1.getNumero1() - ob1.getNumero2();
        System.out.println("La resta de los numeros es: " + resta);
        return resta;
    }

    public double multiplicacion(Operacion ob1) {
        if (ob1.getNumero2() == 0 || ob1.getNumero1() == 0) {
            multiplicar = 0;
            System.out.println("No se puede realizar la operacion por cero");
        } else {
            multiplicar = ob1.getNumero1() * ob1.getNumero2();
            System.out.println("La multiplicacion de los numeros es: " + multiplicar);
        }
        return multiplicar;
    }

    public double division(Operacion ob1) {
        if (ob1.getNumero2() == 0 || ob1.getNumero1() == 0) {
            division = 0;
            System.out.println("No se puede dividir por cero");
        } else {
            division = ob1.getNumero1() / ob1.getNumero2();
            System.out.println("La division de los numeros es: " + division);
        }
        return division;
    }
}
