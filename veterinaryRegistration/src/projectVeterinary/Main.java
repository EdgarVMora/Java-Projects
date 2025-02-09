package projectVeterinary;
import java.util.Scanner;

public class Main {
    //nemotecnia con las letras p, s, v, m, s, a
    //poblado sigue velozmente mientras se abrazan

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //Composicion
        Perro perro = new Perro("Rocky", "Labrador", "Dorado", new FechaNacimiento(10, 5, 2018));


        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Mostrar información del perro");
            System.out.println("2. Calcular edad del perro");
            System.out.println("3. Agregar propietario");
            System.out.println("4. Modificar propietario");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            

            switch (opcion) {
                case 1:
                    System.out.println(perro);
                    break;
                case 2:
                System.out.print("Ingresa el día actual: ");
                int diaActual = scanner.nextInt();
                System.out.print("Ingresa el mes actual: ");
                int mesActual = scanner.nextInt();
                System.out.print("Ingresa el año actual: ");
                int anioActual = scanner.nextInt();
                
                System.out.println("El perro tiene " + perro.calcularEdad(diaActual, mesActual, anioActual) + " años.");
                break;
                case 3:
                    System.out.print("Nombre del propietario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();
                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();
                    perro.agregarPropietario(nombre, telefono, correo);
                    System.out.println("Propietario agregado correctamente.");
                    break;
                case 4:
                    perro.modificarPropietario();
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
