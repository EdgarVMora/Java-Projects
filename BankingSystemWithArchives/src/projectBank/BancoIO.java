package projectBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List; // Necesario para getCopiaDeCuentas() de Banco
import java.util.Scanner;

public class BancoIO {

    /**
     * Lee los datos de una única cuenta bancaria desde un Scanner.
     * Asume que el formato en el archivo es: numeroCuenta (int) seguido de saldo (double) en la misma línea,
     * separados por un espacio.
     *
     * @param sc El Scanner desde el cual leer los datos de la cuenta.
     * @return Un objeto CuentaBancaria si la lectura es exitosa y los datos son válidos,
     * null en caso contrario o si hay un error de formato.
     */
    public static CuentaBancaria leerCuenta(Scanner sc) {
        if (sc.hasNextInt()) {
            int noCuenta = sc.nextInt();
            if (sc.hasNextDouble()) {
                double balance = sc.nextDouble();
                // Consumir el resto de la línea (el salto de línea) después de leer el double
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
                try {
                    return new CuentaBancaria(balance, noCuenta);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error al crear cuenta desde archivo (datos inválidos para N° " + noCuenta + "): " + e.getMessage());
                    return null; // Datos no válidos según el constructor de CuentaBancaria
                }
            } else {
                // Se encontró un int (posible número de cuenta) pero no un double después.
                System.err.println("Error de formato en archivo: Se esperaba un saldo (double) después del número de cuenta.");
                if (sc.hasNextLine()) sc.nextLine(); // Consumir la línea incorrecta para intentar continuar
                return null;
            }
        }
        // No se encontró un int al inicio de la línea (o lo que se esperaba como número de cuenta).
        // Esto puede suceder si hay líneas en blanco o con formato incorrecto.
        // Si la línea no está vacía, la consumimos.
        if (sc.hasNextLine()) {
             String lineaProblematic = sc.nextLine();
             if (!lineaProblematic.trim().isEmpty()) {
                 System.err.println("Error de formato en archivo: Línea ignorada -> " + lineaProblematic);
             }
        }
        return null;
    }

    /**
     * Lee todas las cuentas bancarias desde un archivo y las agrega al objeto Banco proporcionado.
     *
     * @param nombreArchivo El nombre del archivo del cual leer las cuentas.
     * @param banco El objeto Banco al cual se agregarán las cuentas leídas.
     */
    public static void leerArchivo(String nombreArchivo, Banco banco) {
        File archivo = new File(nombreArchivo);

        // Opcional: Si quieres reemplazar las cuentas existentes en el banco
        // cada vez que lees del archivo, descomenta la siguiente línea.
        // banco.limpiarCuentas();

        try (Scanner sc = new Scanner(archivo)) { // try-with-resources cierra el Scanner automáticamente
            System.out.println("Intentando cargar cuentas desde: " + nombreArchivo);
            while (sc.hasNextLine()) { // Mejor verificar si hay próxima línea antes de intentar leer
                CuentaBancaria cuenta = leerCuenta(sc);
                if (cuenta != null) {
                    // Antes de agregar, podrías verificar si ya existe para evitar duplicados
                    // si esa es una regla de negocio al cargar desde archivo.
                    // if (banco.buscarCuenta(cuenta.getNoCuenta()) == null) {
                    //    banco.agregarCuenta(cuenta);
                    // } else {
                    //    System.out.println("Cuenta " + cuenta.getNoCuenta() + " ya existe en el banco. No se agregó desde el archivo.");
                    // }
                    banco.agregarCuenta(cuenta);
                }
                // Si leerCuenta devuelve null, ya se habrá impreso un error, continuamos con la siguiente línea/cuenta.
            }
            System.out.println("Carga de cuentas finalizada. Total de cuentas en el banco: " + banco.getNumeroCuentas());
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado al leer: " + nombreArchivo + ". Se iniciará sin cuentas precargadas o se creará uno nuevo al guardar.");
            // En una GUI, podrías mostrar una alerta aquí si es la primera carga y el archivo es esperado.
            // Si es normal que el archivo no exista la primera vez, este mensaje en consola es suficiente.
        } catch (Exception e) { // Captura otras posibles excepciones durante la lectura del archivo
            System.err.println("Error general al leer el archivo " + nombreArchivo + ": " + e.getMessage());
            e.printStackTrace(); // Útil para depuración
        }
    }

    /**
     * Escribe todas las cuentas bancarias del objeto Banco en un archivo.
     * Cada cuenta se escribe en una nueva línea con el formato: numeroCuenta saldo
     *
     * @param nombreArchivo El nombre del archivo donde se guardarán las cuentas.
     * @param banco El objeto Banco que contiene las cuentas a guardar.
     */
    public static void escribirArchivo(String nombreArchivo, Banco banco) {
        // Usamos try-with-resources para asegurar que PrintWriter se cierre automáticamente.
        try (PrintWriter out = new PrintWriter(nombreArchivo)) {
            List<CuentaBancaria> cuentas = banco.getCopiaDeCuentas(); // Obtener una copia para iterar
            for (CuentaBancaria cuenta : cuentas) {
                // Escribir número de cuenta y saldo, separados por un espacio, en una nueva línea.
                out.println(cuenta.getNoCuenta() + " " + cuenta.getBalance());
            }
            System.out.println("Cuentas guardadas exitosamente en " + nombreArchivo);
        } catch (FileNotFoundException e) {
            // Esta excepción puede ocurrir si el archivo no puede ser creado (ej. por permisos)
            System.err.println("Error: No se pudo escribir en el archivo " + nombreArchivo + ". Verifique la ruta y los permisos.");
            // En una GUI, aquí definitivamente mostrarías una alerta al usuario.
            // showAlert("Error de Archivo", "No se pudo guardar en: " + nombreArchivo + "\n" + e.getMessage());
        } catch (Exception e) { // Captura otras posibles excepciones durante la escritura
            System.err.println("Error general al escribir en el archivo " + nombreArchivo + ": " + e.getMessage());
            e.printStackTrace(); // Útil para depuración
        }
    }
}
