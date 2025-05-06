package projectBank;

public class CuentaBancaria {
    private double balance;
    private int noCuenta;
  
    // Constructor
    public CuentaBancaria(double balanceInicial, int noCuenta) {
    // a. Lanzar excepción si el balance inicial es negativo[cite: 4, 5].
    if (balanceInicial < 0) {
    throw new IllegalArgumentException("¡Cantidad negativa, no es posible crear la cuenta!");
    }
  
    // b. Lanzar excepción si el número de cuenta no es de 5 dígitos[cite: 6].
    if (String.valueOf(noCuenta).length() != 5) {
    throw new IllegalArgumentException("Número de cuenta inválido. Debe tener 5 dígitos.");
    }
  
    // c. Inicializar las variables[cite: 7].
    this.balance = balanceInicial;
    this.noCuenta = noCuenta;
    }
  
    // Método depositar [cite: 8]
    public void depositar(double cantidad) {
    // a. Lanzar excepción si la cantidad es negativa[cite: 8, 9, 10, 11, 12].
    if (cantidad < 0) {
    throw new IllegalArgumentException("¡Cantidad negativa, no es posible depositar!");
    }
    this.balance += cantidad;
    }
  
    // Método retirar [cite: 12]
    public void retirar(double cantidad) {
    // a. Lanzar excepción si la cantidad es negativa[cite: 13, 14, 15].
    if (cantidad < 0) {
    throw new IllegalArgumentException("¡Cantidad negativa, no es posible retirar!");
    }
  
    // b. Lanzar excepción personalizada no comprobada para sobregiro[cite: 15, 16].
    if (cantidad > this.balance) {
    throw new InsufficientFundsException("¡No hay fondos suficientes!");
    }
    this.balance -= cantidad;
    }
  
    // Getters
    public double getBalance() {
    return balance;
    }
  
    public int getNoCuenta() {
    return noCuenta;
    }
  
    @Override
    public String toString() {
    return "CuentaBancaria{" +
    "balance=" + balance +
    ", noCuenta=" + noCuenta +
    '}';
    }
   }
  
   // Excepción personalizada para fondos insuficientes[cite: 15, 16].
   class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
    super(message);
    }
   }
