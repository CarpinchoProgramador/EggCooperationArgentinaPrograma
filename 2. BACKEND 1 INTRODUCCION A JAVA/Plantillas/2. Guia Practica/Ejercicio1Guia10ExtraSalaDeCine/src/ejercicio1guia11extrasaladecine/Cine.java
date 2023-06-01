package ejercicio1guia11extrasaladecine;

public class Cine {
    
    private Pelicula pelicula;
    private Espectador[][] salaEspectadores;
    private boolean[][] auxAsientoOcupado;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Espectador[][] salaEspectadores, boolean[][] auxAsientoOcupado) {
        this.pelicula = pelicula;
        this.salaEspectadores = salaEspectadores;
        this.auxAsientoOcupado = auxAsientoOcupado;
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

    public boolean[][] getAuxAsientoOcupado() {
        return auxAsientoOcupado;
    }

    public void setAuxAsientoOcupado(boolean[][] auxAsientoOcupado) {
        this.auxAsientoOcupado = auxAsientoOcupado;
    }

    
}
