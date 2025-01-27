package projectCoffeeMaker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(); 
        int opcion;

        do {
            System.out.println("\n--- Menú Cafetera ---");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Agregar café");
            System.out.println("4. Vaciar cafetera");
            System.out.println("5. Mostrar estado de la cafetera");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Ingrese la capacidad de la taza (en ml): ");
                    int capacidadTaza = scanner.nextInt();
                    cafetera.servirTaza(capacidadTaza);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de café a agregar (en ml): ");
                    int cantidadAgregar = scanner.nextInt();
                    cafetera.agregarCafe(cantidadAgregar);
                    break;
                case 4:
                    cafetera.vaciarCafetera();
                    break;
                case 5:
                    System.out.println(cafetera);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
