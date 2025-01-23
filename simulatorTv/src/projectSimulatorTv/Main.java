package projectSimulatorTv;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca de la televisión:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el tamaño en pulgadas:");
        int pulgadas = scanner.nextInt();

        // Crear objeto Televisión
        Television tv = new Television(marca, pulgadas);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Encender/Apagar");
            System.out.println("2. Avanzar canal");
            System.out.println("3. Retroceder canal");
            System.out.println("4. Establecer canal");
            System.out.println("5. Subir volumen");
            System.out.println("6. Bajar volumen");
            System.out.println("7. Silenciar/Desactivar silencio");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tv.encenderApagar();
                    break;
                case 2:
                    tv.avanzarCanal();
                    break;
                case 3:
                    tv.retrocederCanal();
                    break;
                case 4:
                    System.out.print("Ingrese el canal (1-5): ");
                    int canal = scanner.nextInt();
                    tv.establecerCanal(canal);
                    break;
                case 5:
                    tv.subirVolumen();
                    break;
                case 6:
                    tv.bajarVolumen();
                    break;
                case 7:
                    tv.silenciar();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
}
}