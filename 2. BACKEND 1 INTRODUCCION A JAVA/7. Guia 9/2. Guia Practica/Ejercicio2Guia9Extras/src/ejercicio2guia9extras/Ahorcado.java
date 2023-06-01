package ejercicio2guia9extras;



//Juego Ahorcado: Crear una clase Ahorcado (como el juego), 
//la cual deberá contener como atributos, un vector con la palabra a buscar, 
//la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
public class Ahorcado {

    private int letrasEncontradas;
    private int intentosMax;
    private String letraUser;
    private String[] palabra;
    private String[] guionPalabra;

    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int intentosMax, String letraUser, String[] palabra) {
        this.letrasEncontradas = letrasEncontradas;
        this.intentosMax = intentosMax;
        this.letraUser = letraUser;
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public String getLetraUser() {
        return letraUser;
    }

    public void setLetraUser(String letraUser) {
        this.letraUser = letraUser;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "letrasEncontradas=" + letrasEncontradas + ", intentosMax=" + intentosMax + ", letraUser=" + letraUser + ", palabra=" + palabra + '}';
    }
   
    
    
}
