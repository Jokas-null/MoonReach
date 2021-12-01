public class Player extends MoonReach{
    public String name;
    public int fila;
    public int columna;
    
    public Player(int fila, int columna, String name){
        this.name = name;
        this.fila = fila;
        this.columna = columna;
    }
}