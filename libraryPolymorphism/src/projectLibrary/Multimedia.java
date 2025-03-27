package projectLibrary;

public class Multimedia extends Item {
    private int duracion; 

    public Multimedia(int id, String titulo, int duracion) {
        super(id, titulo);
        this.duracion = duracion;
    }

    public String toString() {
        return super.toString() + " (" + duracion + " segundos)";
    }
}
