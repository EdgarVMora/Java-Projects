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
        System.out.print("Ingrese el número de cuenta: ");
        int noCuenta = scanner.nextInt();
        
        if (buscarCuenta(noCuenta) != null) {
            System.out.println("Error: Ya existe una cuenta con ese número.");
            return;
        }
        
        System.out.print("Ingrese el monto del depósito inicial (mínimo 100): ");
        double depositoInicial = scanner.nextDouble();
        
        if (depositoInicial < 100) {
            System.out.println("Error: El depósito inicial debe ser al menos 100.");
            return;
        }
        
        System.out.println("\nTipo de cuenta:");
        System.out.println("1. Cuenta de Ahorro");
        System.out.println("2. Cuenta Corriente");
        System.out.print("Seleccione el tipo de cuenta (1-2): ");
        int tipo = scanner.nextInt();
        
        Cuenta nuevaCuenta;
        
        switch (tipo) {
            case 1:
                System.out.print("Ingrese la tasa de interés (%): ");
                double interes = scanner.nextDouble();
                nuevaCuenta = new CuentaAhorro(noCuenta, interes);
                break;
            case 2:
                System.out.print("Ingrese el límite de sobregiro: ");
                double limiteSobregiro = scanner.nextDouble();
                nuevaCuenta = new CuentaCorriente(noCuenta, limiteSobregiro);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        
        nuevaCuenta.depositar(depositoInicial);
        cuentas.add(nuevaCuenta);
        
        System.out.println("\nCuenta creada exitosamente");
        System.out.println("Número de cuenta: " + noCuenta);
        System.out.println("Saldo inicial: $" + depositoInicial);
    }

    private static void eliminarCuenta() {
        System.out.print("Ingrese el numero de cuenta a eliminar: ");
        int noCuenta = scanner.nextInt();
        
        Cuenta cuentaAEliminar = buscarCuenta(noCuenta);
        
        if (cuentaAEliminar != null) {
            cuentas.remove(cuentaAEliminar);
            System.out.println("Cuenta eliminada exitosamente.");
        } else {
            System.out.println("No se encontró una cuenta con ese número.");
        }
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
