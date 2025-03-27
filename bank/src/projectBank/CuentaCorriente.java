package projectBank;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(int noCuenta, double limiteSobregiro) {
        super(noCuenta);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double suma) {
        if (suma <= 0) {
            System.err.println("No es posible retirar una cantidad negativa.");
        } else if (getBalance() - suma >= -limiteSobregiro) {
            super.retirar(suma);
            if (getBalance() < 0) {
                System.out.println("La cuenta está en sobregiro.");
            }
        } else {
            System.err.println("Retiro no permitido: sobrepasa el limite de sobregiro.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Limite de sobregiro: " + limiteSobregiro;
    }
}
