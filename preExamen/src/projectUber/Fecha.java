package src.projectUber;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAnio() {
        return anio;
    }

    public boolean esIgual(Fecha otraFecha) {
        return this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anio == otraFecha.anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}