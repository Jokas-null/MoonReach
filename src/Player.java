public class Player extends MoonReach{
    String name;
    String[][]moveGrid;
    private String direction;
    private int fila;
    private int columna;

    public Player(String x) {
        this.name = x;
    }
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public void setDirections(String x){
        this.direction = x;
    }

    public String getDirections(){
        return this.direction;
    }
}