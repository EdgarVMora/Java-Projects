package projectBank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static int obtenerOpcionUsuario() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    int opcion;

    while (true) {
      try {
        System.out.println("--- Menú ---");
        System.out.println("1. Crear Cuenta");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Salir");
        System.out.print("Ingrese la opción: ");
        opcion = scanner.nextInt();
        return opcion;
      } catch (InputMismatchException e) { // [cite: 17]
        System.out.println("Error: Ingrese un número entero válido.");
        scanner.next(); // Limpiar el buffer del scanner
      }
    }
  }

  public static double obtenerCantidad() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("Ingrese la cantidad: ");
        return scanner.nextDouble();
      } catch (InputMismatchException e) { // [cite: 19, 20]
        System.out.println("Error: Ingrese un número válido.");
        scanner.next(); // Limpiar el buffer
      }
    }
  }

  public static int obtenerNoCuenta() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("Ingrese el número de cuenta: ");
        return scanner.nextInt(); // [cite: 21, 22]

      } catch (InputMismatchException e) {
        System.out.println("Error: Ingrese un número de cuenta válido.");
        scanner.next(); // Limpiar el buffer
      }
    }
  }

  public static void main(String[] args) {
    Banco banco = new Banco(10); // Banco con capacidad para 10 cuentas
    Scanner scanner = new Scanner(System.in);
    int opcion;
    CuentaBancaria cuenta = null; // Inicializar fuera del bloque try

    do {
      opcion = obtenerOpcionUsuario();

      switch (opcion) {
        case 1: // Crear cuenta [cite: 23, 24]
          try {
            double balanceInicial = obtenerCantidad();
            int noCuenta = obtenerNoCuenta();
            cuenta = new CuentaBancaria(balanceInicial, noCuenta);
            banco.agregarCuenta(cuenta);
            System.out.println("Cuenta creada exitosamente.");
          } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
          }
          break;

        case 2: // Depositar [cite: 25, 26, 27]
          try {
            if (banco.getNumeroCuentas() == 0) {
              System.out.println("ERROR: No existe la cuenta.");
              break;
            }
            int noCuentaDeposito = obtenerNoCuenta();
            cuenta = banco.buscarCuenta(noCuentaDeposito);
            if (cuenta == null) {
              System.out.println("ERROR: No existe la cuenta.");
              break;
            }
            double cantidadDeposito = obtenerCantidad();
            cuenta.depositar(cantidadDeposito);
            System.out.println("Depósito realizado exitosamente.");
          } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
          }
          break;

        case 3: // Retirar [cite: 27, 28, 29]
          try {
            if (banco.getNumeroCuentas() == 0) {
              System.out.println("ERROR: No existe la cuenta.");
              break;
            }
            int noCuentaRetiro = obtenerNoCuenta();
            cuenta = banco.buscarCuenta(noCuentaRetiro);
            if (cuenta == null) {
              System.out.println("ERROR: No existe la cuenta.");
              break;
            }
            double cantidadRetiro = obtenerCantidad();
            cuenta.retirar(cantidadRetiro);
            System.out.println("Retiro realizado exitosamente.");
          } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
          } catch (InsufficientFundsException e) {
            System.out.println("ERROR: " + e.getMessage());
          }
          break;

        case 4:
          System.out.println("Saliendo del programa.");
          break;
        default:
          System.out.println("Opción no válida.");
      }
    } while (opcion != 4);
  }
}