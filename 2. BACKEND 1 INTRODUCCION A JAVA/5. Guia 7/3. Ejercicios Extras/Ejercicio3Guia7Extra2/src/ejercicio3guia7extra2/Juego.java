package ejercicio3guia7extra2;

public class Juego {

    private int numero, intentos, victoria;

    public Juego() {
    }

    public Juego(int numero, int intentos, int victoria) {
        this.numero = numero;
        this.intentos = intentos;
        this.victoria = victoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getVictoria() {
        return victoria;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }

}
