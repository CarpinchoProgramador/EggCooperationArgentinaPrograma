package piedrapapeltijera;

public class Jugador {
    
    private String id;
    private int puntos;
    private int decisionJuego;

    public Jugador() {
    }

    public Jugador(String id, int puntos, int decisionJuego) {
        this.id = id;
        this.puntos = puntos;
        this.decisionJuego = decisionJuego;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getDecisionJuego() {
        return decisionJuego;
    }

    public void setDecisionJuego(int decisionJuego) {
        this.decisionJuego = decisionJuego;
    }      

}
