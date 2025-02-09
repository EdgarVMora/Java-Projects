package projectDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        
        Fecha fecha = new Fecha(dia, mes, anio);
        
        int opcion;
        do {
            System.out.println("\n--- Menu Fecha ---");
            System.out.println("1. Mostrar fecha corta");
            System.out.println("2. Mostrar fecha larga");
            System.out.println("3. Ver si el año es bisiesto");
            System.out.println("4. Avanzar un dia");
            System.out.println("5. Retroceder un dia");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Fecha corta: " + fecha.corta());
                    break;
                case 2:
                    System.out.println("Fecha larga: " + fecha.toString());
                    break;
                case 3:
                    System.out.println("El año " + fecha.getAnio() + (fecha.bisiesto() ? " es bisiesto." : " no es bisiesto."));
                    break;
                case 4:
                    fecha.siguiente();
                    System.out.println("Nuevo dia: " + fecha.corta());
                    break;
                case 5:
                    fecha.anterior();
                    System.out.println("Dia anterior: " + fecha.corta());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
