package projectParallelepiped;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);


        Vector v1 = new Vector(1, 0, 0);
        Vector v2 = new Vector(0, 1, 0);
        Vector v3 = new Vector(0, 0, 1);


        Paralelepipedo paralelepipedo = new Paralelepipedo(v1, v2, v3);

        int opcion;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Mostrar informacion del paralelepipedo");
            System.out.println("2. Calcular volumen");
            System.out.println("3. Modificar los vectores del paralelepipedo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    paralelepipedo.mostrarInformacion();
                    break;
                case 2:
                    System.out.println("Volumen del paralelepipedo: " + paralelepipedo.calcularVolumen());
                    break;
                case 3:
                    modificarVectores(paralelepipedo, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }


    public static void modificarVectores(Paralelepipedo paralelepipedo, Scanner scanner) {
        int subOpcion;
        do {
            System.out.println("\n--- Submenú de Modificación de Vectores ---");
            System.out.println("1. Modificar primer vector");
            System.out.println("2. Modificar segundo vector");
            System.out.println("3. Modificar tercer vector");
            System.out.println("4. Regresar");
            System.out.print("Seleccione una opción: ");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    paralelepipedo.setV1(leerVector(scanner, "primer"));
                    break;
                case 2:
                    paralelepipedo.setV2(leerVector(scanner, "segundo"));
                    break;
                case 3:
                    paralelepipedo.setV3(leerVector(scanner, "tercer"));
                    break;
                case 4:
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (subOpcion != 4);
    }


    public static Vector leerVector(Scanner scanner, String nombre) {
        System.out.println("\nIngrese las coordenadas del " + nombre + " vector:");
        System.out.print("X: ");
        double x = scanner.nextDouble();
        System.out.print("Y: ");
        double y = scanner.nextDouble();
        System.out.print("Z: ");
        double z = scanner.nextDouble();
        return new Vector(x, y, z);
    } 
}
