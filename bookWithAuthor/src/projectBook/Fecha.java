package projectBook;

public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }
}