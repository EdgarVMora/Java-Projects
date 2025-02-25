package projectReplacement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese la cadena original:");
        String cadena = scanner.nextLine();


        System.out.println("Ingrese la subcadena que desea reemplazar:");
        String viejaSubcadena = scanner.nextLine();

        System.out.println("Ingrese la nueva subcadena:");
        String nuevaSubcadena = scanner.nextLine();

        String cadenaResultado = cadena.replace(viejaSubcadena, nuevaSubcadena);

        System.out.println("Cadena resultado:");
        System.out.println(cadenaResultado);

        scanner.close();
}
}
