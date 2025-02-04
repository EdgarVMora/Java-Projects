package projectFraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese el numerador de la primera fracción: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la primera fracción: ");
        int den1 = scanner.nextInt();
        Fraccion f1 = new Fraccion(num1, den1);
        

        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int den2 = scanner.nextInt();
        Fraccion f2 = new Fraccion(num2, den2);
        

        System.out.println("\nResultados:");
        System.out.println("Suma: " + f1.sumar(f2));
        System.out.println("Resta: " + f1.restar(f2));
        System.out.println("Multiplicación: " + f1.multiplicar(f2));
        System.out.println("División: " + f1.dividir(f2));
        
        scanner.close();
    }
}