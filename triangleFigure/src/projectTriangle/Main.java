package projectTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangulo triangulo = new Triangulo(
            new Recta(new Punto(1, 1), new Punto(4, 1)), 
            new Recta(new Punto(4, 1), new Punto(2, 4)), 
            new Recta(new Punto(2, 4), new Punto(1, 1)) 
        );

        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Mostrar información del triángulo");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Calcular área");
            System.out.println("4. Modificar puntos del triángulo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(triangulo);
                    break;
                case 2:
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    break;
                case 4:
                    triangulo.modificarPunto();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
    
}
