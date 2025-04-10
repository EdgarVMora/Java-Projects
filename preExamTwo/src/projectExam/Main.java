package projectExam;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main y maneja la interacción con el usuario.
 * Implementa un menú interactivo para controlar las plantas del juego.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array que almacena las plantas del juego
        Planta[] plantas = new Planta[6];

        // Creación de 3 plantas de guisantes
        for (int i = 0; i < 3; i++) {
            plantas[i] = new PlantaGuisantes();
        }
        // Creación de 3 plantas de maíz
        for (int i = 3; i < 6; i++) {
            plantas[i] = new PlantaMaices();
        }

        int opcion;

        // Bucle principal del menú
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Disparar proyectil");
            System.out.println("2. Recorrer plantas y activar súper poder");
            System.out.println("3. Ver proyectiles restantes");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Opción para disparar un proyectil con una planta específica
                    System.out.println("\nElige la planta que va a disparar (0 a 5):");
                    for (int i = 0; i < plantas.length; i++) {
                        System.out.println(i + ": " + plantas[i].toString());
                    }
                    System.out.print("Tu elección: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < plantas.length) {
                        plantas[indice].lanzarProyectil();
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 2:
                    // Opción para activar el poder especial de todas las plantas
                    System.out.println("\nActivando súper poder en todas las plantas:");
                    for (int i = 0; i < plantas.length; i++) {
                        System.out.print("Planta " + i + ": ");
                        if (plantas[i] instanceof PlantaGuisantes) {
                            ((PlantaGuisantes) plantas[i]).disparoRafaga();
                        } else if (plantas[i] instanceof PlantaMaices) {
                            ((PlantaMaices) plantas[i]).superMaiz();
                        }
                    }
                    break;

                case 3:
                    // Opción para mostrar el estado de todas las plantas
                    int totalProyectiles = 0;
                    System.out.println("\n--- Estado de las plantas ---");
                    for (int i = 0; i < plantas.length; i++) {
                        System.out.println("Planta " + i + ": " + plantas[i].toString());
                        totalProyectiles += plantas[i].getProyectiles();
                    }
                    System.out.println("Proyectiles totales restantes: " + totalProyectiles);
                    break;

                case 4:
                    // Opción para salir del programa
                    System.out.println("Saliendo del programa. 🌱");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
