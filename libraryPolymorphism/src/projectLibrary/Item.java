package projectLibrary;

public class Item {
    private int id;
    private String titulo;

    public Item(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String toString() {
        return id + " " + titulo;
    } 
}
