package ejercicio2guia12electrodomesticosherencia;

class Televisor extends Electrodomestico {

    private double resolucionPulgadas;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucionPulgadas, boolean TDT, Double precio, String tipoElectrodomestico, String color, String consumoEnergetico, double peso) {
        super(precio, tipoElectrodomestico, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.TDT = TDT;
    }

    public double getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(double resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        setTipoElectrodomestico("Televisor");
        crearElectrodomestico();
        System.out.print("Ingrese la cantidad de pulgadas del televisor --> ");
        setResolucionPulgadas(leer.nextDouble());
        System.out.println("Tiene sintonizador TDT? 1. Si | 2. no");
        int aux = leer.nextInt();
        if (aux == 1) {
            setTDT(true);
        } else {
            setTDT(false);
        }
        System.out.println("Ingrese el peso del televisor: ");
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

        if (getResolucionPulgadas() > 40) {
            setPrecio(getPrecio() * 1.30);
        }
        if (isTDT()) {
            setPrecio(precio + 500);
        }

    }

}
