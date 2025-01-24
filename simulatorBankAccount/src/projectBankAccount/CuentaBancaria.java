package projectBankAccount;

public class CuentaBancaria {
    private int numeroCuenta; 
    private String titular;   
    private double saldo;     

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = 0;
        this.titular = "Sin titular";
        this.saldo = 0.0;
    }

    // Constructor con parámetros
    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Métodos getters (accedentes)
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos setters (mutadores)
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos definidos por el usuario

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede retirar esa cantidad. Verifique el saldo.");
        }
    }

    // Método para mostrar los datos de la cuenta
    public String toString() {
        return "Número de cuenta: " + numeroCuenta + "\n" +
               "Titular: " + titular + "\n" +
               "Saldo: " + saldo;
    }

}
