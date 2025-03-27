package projectBank;

public class CuentaAhorro extends Cuenta {
    private double interes; 
    private int retirosEsteMes;
    private static final int RETIROS_MAXIMOS = 3;  // Límite de retiros mensuales

    public CuentaAhorro(int noCuenta, double interes) {
        super(noCuenta);
        this.interes = interes;
    }

    public void agregarIntereses() {
        double incremento = getBalance() * (interes / 100);
        depositar(incremento);
    }

    @Override
    public void retirar(double suma) {
        if (suma <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
            return;
        }

        double saldoMinimo = 100;
        if (getBalance() - suma < saldoMinimo) {
            System.out.println("Error: No se puede retirar. Debe mantener un saldo mínimo de " + saldoMinimo);
            return;
        }

        if (suma > getBalance()) {
            System.out.println("Error: Fondos insuficientes. Saldo actual: " + getBalance());
            return;
        }

        setBalance(getBalance() - suma);
        retirosEsteMes++;
        System.out.println("Retiro exitoso. Nuevo saldo: " + getBalance());
        System.out.println("Retiros restantes este mes: " + (RETIROS_MAXIMOS - retirosEsteMes));

        if (retirosEsteMes >= RETIROS_MAXIMOS) {
            System.out.println("Error: Ha excedido el límite de " + RETIROS_MAXIMOS + " retiros mensuales.");
            return;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Interes: " + interes + "%";
    }
}
