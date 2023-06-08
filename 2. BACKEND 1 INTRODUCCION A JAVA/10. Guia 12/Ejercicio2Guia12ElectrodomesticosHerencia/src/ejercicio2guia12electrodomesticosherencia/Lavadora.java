package ejercicio2guia12electrodomesticosherencia;

class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, Double precio, String tipoElectrodomestico, String color, String consumoEnergetico, double peso) {
        super(precio, tipoElectrodomestico, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        setTipoElectrodomestico("Lavadora");
        crearElectrodomestico();
        System.out.print("Ingrese cuanta carga admite la lavadora: ");
        setCarga(leer.nextDouble());
        System.out.println("Ingrese el peso de la lavadora: ");
        setPeso(leer.nextDouble());
        precioFinal();
    }

    @Override
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
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", carga=" + carga + '}';
    }

}
