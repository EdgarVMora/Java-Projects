package projectNetflix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = scanner.nextLine();
        Netflix cuenta = new Netflix(nombre);
        
        TarjetaRegalo tarjeta = new TarjetaRegalo("ABC123", "premium");
        
        int opcion;
        do {
            System.out.println("\n--- Menú Netflix ---");
            System.out.println("1. Mostrar datos de la cuenta");
            System.out.println("2. Activar plan");
            System.out.println("3. Ver películas y series");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.println(cuenta);
                    break;
                case 2:
                    System.out.print("Ingrese el código de activación: ");
                    String codigo = scanner.nextLine();
                    cuenta.activarPlan(tarjeta, codigo);
                    break;
                case 3:
                    cuenta.verContenido();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
