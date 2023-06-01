package ejercicio4guia10practica;

public class Pelicula {

    private String pelicula;
    private String director;
    private int horas;

    public Pelicula() {
    }

    public Pelicula(String pelicula, String director, int horas) {
        this.pelicula = pelicula;
        this.director = director;
        this.horas = horas;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "pelicula=" + pelicula + ", director=" + director + ", horas=" + horas + '}';
    }
    
    
    

    

}
