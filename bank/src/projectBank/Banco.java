package projectBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenu del Banco");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Mostrar cuentas");
            System.out.println("6. Actualizar");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: crearCuenta(); break;
                case 2: eliminarCuenta(); break;
                case 3: depositar(); break;
                case 4: retirar(); break;
                case 5: mostrarCuentas(); break;
                case 6: actualizar(); break;
                case 7: System.out.println("Se cerro la cuenta"); break;
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
    }

    private static void crearCuenta() {
        System.out.println("Seleccione el tipo de cuenta:");
        System.out.println("a. Cuenta Ahorros");
        System.out.println("b. Cuenta Corriente");
        char tipo = scanner.next().charAt(0);

        System.out.print("Ingrese el numero de cuenta: ");
        int noCuenta = scanner.nextInt();

        switch (tipo) {
            case 'a':
                System.out.print("Ingrese el porcentaje de interes: ");
                double interes = scanner.nextDouble();
                cuentas.add(new CuentaAhorro(noCuenta, interes));
                System.out.println("Cuenta de Ahorro creada exitosamente.");
                break;
            case 'b':
                System.out.print("Ingrese el limite de sobregiro: ");
                double sobregiro = scanner.nextDouble();
                cuentas.add(new CuentaCorriente(noCuenta, sobregiro));
                System.out.println("Cuenta Corriente creada exitosamente.");
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }

    private static void eliminarCuenta() {
        System.out.print("Ingrese el numero de cuenta a eliminar: ");
        int noCuenta = scanner.nextInt();
        cuentas.removeIf(c -> c.getNoCuenta() == noCuenta);
        System.out.println("Cuenta eliminada (si existía).");
    }

    private static void depositar() {
        System.out.print("Ingrese el numero de cuenta: ");
        int noCuenta = scanner.nextInt();
        Cuenta cuenta = buscarCuenta(noCuenta);
        if (cuenta != null) {
            System.out.print("Ingrese la cantidad a depositar: ");
            double cantidad = scanner.nextDouble();
            cuenta.depositar(cantidad);
            System.out.println("Deposito realizado.");
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private static void retirar() {
        System.out.print("Ingrese el numero de cuenta: ");
        int noCuenta = scanner.nextInt();
        Cuenta cuenta = buscarCuenta(noCuenta);
        if (cuenta != null) {
            System.out.print("Ingrese la cantidad a retirar: ");
            double cantidad = scanner.nextDouble();
            cuenta.retirar(cantidad);
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private static void mostrarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
        } else {
            System.out.println("Cuentas registradas:");
            for (Cuenta cuenta : cuentas) {
                System.out.println(cuenta);
            }
        }
    }

    private static void actualizar() {
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorro) {
                ((CuentaAhorro) cuenta).agregarIntereses();
                System.out.println("Intereses aplicados a la Cuenta de Ahorro No. " + cuenta.getNoCuenta());
            } else if (cuenta instanceof CuentaCorriente) {
                if (cuenta.getBalance() < 0) {
                    System.out.println("Cuenta Corriente No. " + cuenta.getNoCuenta() + " está en sobregiro.");
                }
            }
        }
        System.out.println("Cuentas actualizadas correctamente.");
    }

    private static Cuenta buscarCuenta(int noCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNoCuenta() == noCuenta) {
                return cuenta;
            }
        }
        return null;
    }
}
