package ProjectExam;

public abstract class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    //No te compliques, usa get para todos tus datos, no sabemos cuando podamos ocuparlos
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Métodos abstractos que las subclases deberán implementar (ej: calcularSalario)
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id;
    }
}
