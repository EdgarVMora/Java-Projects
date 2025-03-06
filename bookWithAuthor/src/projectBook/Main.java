package projectBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Libro> biblioteca = new ArrayList<>();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Nuevo libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Editorial: ");
                    String editorial = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();
                    scanner.nextLine(); 

                    Libro libro = new Libro(titulo, editorial, paginas);
                    biblioteca.add(libro);

                    while (true) {
                        System.out.println("\n1. Agregar autor");
                        System.out.println("2. Mostrar autor");
                        System.out.println("3. Regresar al menú anterior");
                        System.out.print("Seleccione una opción: ");
                        int subOpcion = scanner.nextInt();
                        scanner.nextLine(); 

                        if (subOpcion == 1) {
                            System.out.print("Nombre del autor: ");
                            String nombreAutor = scanner.nextLine();
                            System.out.print("Nacionalidad del autor: ");
                            String nacionalidad = scanner.nextLine();
                            System.out.print("Fecha de nacimiento (día mes año): ");
                            int dia = scanner.nextInt();
                            int mes = scanner.nextInt();
                            int anyo = scanner.nextInt();
                            scanner.nextLine(); 

                            Autor autor = new Autor(nombreAutor, nacionalidad, new Fecha(dia, mes, anyo));
                            libro.asignarAutor(autor);
                        } else if (subOpcion == 2) {
                            for (Autor autor : libro.getAutores()) {
                                System.out.println(autor);
                            }
                        } else {
                            break;
                        }
                    }
                    break;

                case 2:
                    for (Libro l : biblioteca) {
                        System.out.println(l);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}