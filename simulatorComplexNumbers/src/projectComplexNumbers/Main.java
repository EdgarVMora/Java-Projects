package projectComplexNumbers;

// Clase Complejo
public class NumeroComplejo {
    private double real;
    private double imaginario;

    // Constructor
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    // Sumar complejos
    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    // Restar complejos
    public Complejo restar(Complejo otro) {
        return new Complejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    // Multiplicar complejos
    public Complejo multiplicar(Complejo otro) {
        double nuevoReal = this.real * otro.real - this.imaginario * otro.imaginario;
        double nuevoImaginario = this.real * otro.imaginario + this.imaginario * otro.real;
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // Conjugado del número complejo
    public Complejo conjugado() {
        return new Complejo(this.real, -this.imaginario);
    }

    // Módulo del número complejo
    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    // Ángulo del número complejo
    public double angulo() {
        return Math.atan2(imaginario, real);
    }

    // Método toString para mostrar el número complejo
    @Override
    public String toString() {
        return real + " + " + imaginario + "i";
    }
}

// Clase Main con menú interactivo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números complejos
        System.out.print("Ingrese la parte real del primer número complejo: ");
        double real1 = scanner.nextDouble();
        System.out.print("Ingrese la parte imaginaria del primer número complejo: ");
        double imag1 = scanner.nextDouble();
        Complejo c1 = new Complejo(real1, imag1);

        System.out.print("Ingrese la parte real del segundo número complejo: ");
        double real2 = scanner.nextDouble();
        System.out.print("Ingrese la parte imaginaria del segundo número complejo: ");
        double imag2 = scanner.nextDouble();
        Complejo c2 = new Complejo(real2, imag2);

        int opcion;
        do {
            System.out.println("\n--- Menú Números Complejos ---");
            System.out.println("1. Sumar complejos");
            System.out.println("2. Restar complejos");
            System.out.println("3. Multiplicar complejos");
            System.out.println("4. Conjugado del primer número");
            System.out.println("5. Conjugado del segundo número");
            System.out.println("6. Módulo del primer número");
            System.out.println("7. Módulo del segundo número");
            System.out.println("8. Ángulo del primer número");
            System.out.println("9. Ángulo del segundo número");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + c1.sumar(c2));
                    break;
                case 2:
                    System.out.println("Resta: " + c1.restar(c2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + c1.multiplicar(c2));
                    break;
                case 4:
                    System.out.println("Conjugado del primer número: " + c1.conjugado());
                    break;
                case 5:
                    System.out.println("Conjugado del segundo número: " + c2.conjugado());
                    break;
                case 6:
                    System.out.println("Módulo del primer número: " + c1.modulo());
                    break;
                case 7:
                    System.out.println("Módulo del segundo número: " + c2.modulo());
                    break;
                case 8:
                    System.out.println("Ángulo del primer número: " + c1.angulo());
                    break;
                case 9:
                    System.out.println("Ángulo del segundo número: " + c2.angulo());
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 10);

        scanner.close();
    }
}

