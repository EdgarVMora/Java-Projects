package projectBankAccount;

public class Main {
    public static void main(String[] args) {
        // Instancia de un objeto de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(123456, "Edgar Mora", 5000.0);

        // Mensajes
        System.out.println("Datos iniciales de la cuenta:");
        System.out.println(cuenta1.toString());

        // Invocación de métodos getters
        System.out.println("\nNúmero de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        // Invocación de métodos setters
        cuenta1.setTitular("Edgar Mora");
        System.out.println("\nTitular actualizado: " + cuenta1.getTitular());

        // Métodos para depositar y retirar dinero
        System.out.println("\nLa cantidad a depositar es de $1000.0");
        cuenta1.depositar(1000.0); 
        System.out.println("\nLa cantidad a retirar es de $2000.0");
        cuenta1.retirar(2000.0);   
        System.out.println("\nLa cantidad a retirar es de $10000.0");
        cuenta1.retirar(10000.0);  

        // Mostrar datos finales de la cuenta
        System.out.println("\nDatos finales de la cuenta:");
        System.out.println(cuenta1.toString());
    }
}
