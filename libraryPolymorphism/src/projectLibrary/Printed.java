package projectLibrary;

public class Printed extends Item {
    private int paginas;

    public Printed(int id, String titulo, int paginas) {
        super(id, titulo);
        this.paginas = paginas;
    }

    public String toString() {
        return super.toString() + " (" + paginas + " páginas)";
    }
}
