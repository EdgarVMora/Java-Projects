package projectRhombus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto (máximo 10 caracteres):");
        String cadena = scanner.nextLine();

        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

        int longitud = cadena.length();

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud - i - 1; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(cadena.charAt(j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(cadena.charAt(j) + " ");
            }

            System.out.println();
        }

        for (int i = longitud - 2; i >= 0; i--) {
            for (int j = 0; j < longitud - i - 1; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(cadena.charAt(j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(cadena.charAt(j) + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
