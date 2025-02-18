package src.projectUber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del conductor: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese el nombre del conductor: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de viajes a registrar: ");
        int numViajes = scanner.nextInt();

        Conductor conductor = new Conductor(id, nombre, numViajes);

        conductor.registrarViajes(scanner);

        System.out.println("\n" + conductor);

        System.out.print("\nIngrese una fecha para calcular ganancias (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        Fecha fechaConsulta = new Fecha(dia, mes, anio);

        System.out.println("Ganancias en " + fechaConsulta + ": $" + conductor.calcularGananciaPorFecha(fechaConsulta));

        scanner.close();
    }
}