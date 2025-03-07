package projectClinic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Paciente paciente = new Paciente(1, "Edgar Mora", 5);
        
        Medicion m1 = new Medicion(70, 1.75, new Fecha(1, 3, 2025));
        Medicion m2 = new Medicion(75, 1.75, new Fecha(1, 6, 2025));
        
        paciente.registrarMedicion(m1);
        paciente.registrarMedicion(m2);
        
        System.out.println(paciente);
        
        System.out.println("Ingrese una fecha (dia mes año) para consultar el IMC:");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        
        paciente.mostrarIMCporFecha(new Fecha(dia, mes, anio));
        
        scanner.close();
    }
}
