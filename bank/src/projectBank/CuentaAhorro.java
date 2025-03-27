package projectBank;

public class CuentaAhorro extends Cuenta {
    private double interes; 

    public CuentaAhorro(int noCuenta, double interes) {
        super(noCuenta);
        this.interes = interes;
    }

    public void agregarIntereses() {
        double incremento = getBalance() * (interes / 100);
        depositar(incremento);
    }

    @Override
    public String toString() {
        return super.toString() + " - Interes: " + interes + "%";
    }
}
