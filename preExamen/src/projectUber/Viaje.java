package src.projectUber;

public class Viaje {
    private double distancia;
    private double tarifa;
    private Fecha fecha;

    public Viaje(double distancia, double tarifa, Fecha fecha) {
        this.distancia = distancia;
        this.tarifa = tarifa;
        this.fecha = fecha;
    }

    public double calcularCosto() {
        return distancia * tarifa;
    }

    public double getDistancia() {
        return distancia;
    }
    
    public double getTarifa() {
        return tarifa;
    }
    
    public Fecha getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Distancia: " + distancia + " km, Tarifa: $" + tarifa + "/km, Fecha: " + fecha + ", Costo: $" + calcularCosto();
    }
}