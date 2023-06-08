package ejercicio1guia11extrasaladecine;

public class Cine {
    
    private Pelicula pelicula;
    private Espectador[][] salaEspectadores;
    private Boolean[][] auxAsientoOcupado;
    private double precioEntrada;
        
    public Cine() {       
    }

    public Cine(Pelicula pelicula, Espectador[][] salaEspectadores, Boolean[][] auxAsientoOcupado, double precioEntrada) {
        this.pelicula = pelicula;
        this.salaEspectadores = salaEspectadores;
        this.auxAsientoOcupado = auxAsientoOcupado;
        this.precioEntrada = precioEntrada;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[][] getSalaEspectadores() {
        return salaEspectadores;
    }

    public void setSalaEspectadores(Espectador[][] salaEspectadores) {
        this.salaEspectadores = salaEspectadores;
    }

    public Boolean[][] getAuxAsientoOcupado() {
        return auxAsientoOcupado;
    }

    public void setAuxAsientoOcupado(Boolean[][] auxAsientoOcupado) {
        this.auxAsientoOcupado = auxAsientoOcupado;
    }

    
}
