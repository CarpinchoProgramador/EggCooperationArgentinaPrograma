package ejercicio2guia12electrodomesticosherencia;

import java.util.Scanner;

class Electrodomestico {

    protected Double precio;
    protected String tipoElectrodomestico;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String tipoElectrodomestico, String color, String consumoEnergetico, double peso) {
        this.precio = precio;
        this.tipoElectrodomestico = tipoElectrodomestico;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getTipoElectrodomestico() {
        return tipoElectrodomestico;
    }

    public void setTipoElectrodomestico(String tipoElectrodomestico) {
        this.tipoElectrodomestico = tipoElectrodomestico;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(String letra) {
        switch (letra.toUpperCase()) {
            case "A":
                setConsumoEnergetico("A");
                break;
            case "B":
                setConsumoEnergetico("B");
                break;
            case "C":
                setConsumoEnergetico("C");
                break;
            case "D":
                setConsumoEnergetico("D");
                break;
            case "E":
                setConsumoEnergetico("E");
                break;
            case "F":
                setConsumoEnergetico("F");
                break;
            default:
                setConsumoEnergetico("F");

        }
    }

    public void comprobarColor(String color) {
        switch (color.toUpperCase()) {
            case "BLANCO":
                setColor("BLANCO");
                break;
            case "NEGRO":
                setColor("NEGRO");
                break;
            case "ROJO":
                setColor("ROJO");
                break;
            case "AZUL":
                setColor("AZUL");
                break;
            case "GRIS":
                setColor("GRIS");
                break;
            default:
                setColor("Blanco");
        }
    }

    public void crearElectrodomestico() {
        System.out.print("Ingrese el color de su " + tipoElectrodomestico + " : ");
        String colorElectrodomestico = leer.next();
        System.out.print("Ingrese el consumo energetico de su " + tipoElectrodomestico + " : ");
        String consumoElectrodomestico = leer.next();
        comprobarConsumoEnergetico(consumoElectrodomestico);
        comprobarColor(colorElectrodomestico);
        setPrecio(1000.0);
    }

    public void precioFinal() {
        switch (getConsumoEnergetico().toUpperCase()) {
            case "A":
                setPrecio(getPrecio() + 1000.0);
                break;
            case "B":
                setPrecio(getPrecio() + 800.0);
                break;
            case "C":
                setPrecio(getPrecio() + 600.0);
                break;
            case "D":
                setPrecio(getPrecio() + 500.0);
                break;
            case "E":
                setPrecio(getPrecio() + 300.0);
                break;
            case "F":
                setPrecio(getPrecio() + 100.0);
                break;
            default:

        }

        if (peso >= 1 && peso <= 19) {
            setPrecio(getPrecio() + 100);
        } else if (peso >= 20 && peso <= 49) {
            setPrecio(getPrecio() + 500);
        } else if (peso >= 50 && peso <= 79) {
            setPrecio(getPrecio() + 800);
        } else if (peso >= 80) {
            setPrecio(getPrecio() + 1000);
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", leer=" + leer + '}';
    }

}
