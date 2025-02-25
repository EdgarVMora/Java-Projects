package projectReverse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();

        String[] palabras = cadena.split(" ");

        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            StringBuilder palabraInvertida = new StringBuilder(palabra);
            resultado.append(palabraInvertida.reverse().toString()).append(" ");
        }

        System.out.println("Cadena con palabras invertidas:");
        System.out.println(resultado.toString().trim());

        scanner.close();
    }
}
