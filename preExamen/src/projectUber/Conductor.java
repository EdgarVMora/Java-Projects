package src.projectUber;

import java.util.Scanner;

public class Conductor {
    private int id;
    private String nombre;
    private Viaje[] viajes;

    public Conductor(int id, String nombre, int numViajes) {
        this.id = id;
        this.nombre = nombre;
        this.viajes = new Viaje[numViajes];
    }

    public void registrarViajes(Scanner scanner) {
        for (int i = 0; i < viajes.length; i++) {
            System.out.println("\nRegistro del viaje " + (i + 1) + ":");
            System.out.print("Ingrese la distancia en km: ");
            double distancia = scanner.nextDouble();
            System.out.print("Ingrese la tarifa por km: ");
            double tarifa = scanner.nextDouble();
            System.out.print("Ingrese la fecha del viaje (dd mm aaaa): ");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int anio = scanner.nextInt();

            Fecha fecha = new Fecha(dia, mes, anio);
            viajes[i] = new Viaje(distancia, tarifa, fecha);
        }
    }

    public double calcularGananciaTotal() {
        double total = 0;
        for (Viaje viaje : viajes) {
            if (viaje != null) {
                total += viaje.calcularCosto();
            }
        }
        return total;
    }

    public double calcularGananciaPorFecha(Fecha fecha) {
        double total = 0;
        for (Viaje viaje : viajes) {
            if (viaje != null && viaje.getFecha().esIgual(fecha)) {
                total += viaje.calcularCosto();
            }
        }
        return total;
    }
    public String toString() {
        String info = "Conductor: " + nombre + " (ID: " + id + ")\n";
        info += "Viajes:\n";
        
        for (Viaje viaje : viajes) {
            if (viaje != null) {
                info += "- " + viaje.toString() + "\n";
            }
        }
    
        info += "Ganancia total: $" + calcularGananciaTotal();
        return info;
    }
}
