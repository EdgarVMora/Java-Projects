package projectThermometer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de termómetro:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Celsius");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        Termometro termometro;
        if (opcion == 1) {
            termometro = new TermometroFahrenheit(temperatura);
        } else {
            termometro = new TermometroCelsius(temperatura);
        }
        /*
         * Termometro termometro2 = new TermometroCelsius(temperatura);
        Termometro termometro3 = new TermometroFahrenheit(temperatura);
         */
        

        int menu;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Leer temperatura actual");
            System.out.println("2. Convertir temperatura");
            System.out.println("3. Determinar temperatura");
            System.out.println("4. Almacenar temperatura");
            System.out.println("5. Mostrar temperatura mínima");
            System.out.println("6. Mostrar temperatura máxima");
            System.out.println("7. Resetear memoria");
            System.out.println("8. Salir");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(termometro);
                    break;
                case 2:
                    System.out.println("Temperatura convertida: " + termometro.convertir());
                    break;
                case 3:
                    System.out.println(termometro.determinarTemperatura());
                    break;
                case 4:
                    do {
                        termometro.guardarEnMemoria();
                        System.out.println("Temperatura almacenada.");
                        
                        System.out.println("¿Desea ingresar otra temperatura? (1: Sí / 0: No)");
                        int continuar = scanner.nextInt();
                        
                        if (continuar == 1) {
                            System.out.print("Ingrese la nueva temperatura: ");
                            temperatura = scanner.nextDouble();
                            termometro.setTemperatura(temperatura);
                        } else {
                            break;
                        }
                    } while (true);
                    break;
                case 5:
                    System.out.println("Temperatura mínima registrada: " + termometro.minimo());
                    break;
                case 6:
                    System.out.println("Temperatura máxima registrada: " + termometro.maximo());
                    break;
                case 7:
                    termometro.resetearMemoria();
                    System.out.println("Memoria reseteada.");
                    System.out.println("¿Desea reiniciar el programa? (1: Sí / 0: No)");
                    int reiniciar = scanner.nextInt();
                    
                    if (reiniciar == 1) {
                        System.out.println("\nSeleccione el tipo de termómetro:");
                        System.out.println("1. Fahrenheit");
                        System.out.println("2. Celsius");
                        opcion = scanner.nextInt();

                        System.out.print("Ingrese la temperatura: ");
                        temperatura = scanner.nextDouble();

                        if (opcion == 1) {
                            termometro = new TermometroFahrenheit(temperatura);
                        } else {
                            termometro = new TermometroCelsius(temperatura);
                        }
                    } else {
                        System.out.println("Saliendo...");
                        menu = 8; 
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (menu != 8);
        scanner.close();
    }
}
