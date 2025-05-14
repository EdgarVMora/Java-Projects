package projectBank;

public class CuentaBancaria {
    private double balance;
    private int noCuenta;

    // Constructor
    public CuentaBancaria(double balanceInicial, int noCuenta) {
        // a. Lanzar excepción si el balance inicial es negativo.
        if (balanceInicial < 0) {
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible crear la cuenta!");
        }

        // b. Lanzar excepción si el número de cuenta no es de 5 dígitos.
        if (String.valueOf(noCuenta).length() != 5) {
            throw new IllegalArgumentException("Número de cuenta inválido. Debe tener 5 dígitos.");
        }

        // c. Inicializar las variables.
        this.balance = balanceInicial;
        this.noCuenta = noCuenta;
    }

    // Método depositar
    public void depositar(double cantidad) {
        // a. Lanzar excepción si la cantidad es negativa.
        if (cantidad < 0) {
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible depositar!");
        }
        this.balance += cantidad;
    }

    // Método retirar
    public void retirar(double cantidad) {
        // a. Lanzar excepción si la cantidad es negativa.
        if (cantidad < 0) {
            throw new IllegalArgumentException("¡Cantidad negativa, no es posible retirar!");
        }

        // b. Lanzar excepción personalizada no comprobada para sobregiro.
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

// Excepción personalizada para fondos insuficientes.
class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
