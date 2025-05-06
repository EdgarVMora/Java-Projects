package projectBank;

import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> cuentas;
    private int noC; // Contador de cuentas
    private final int maxCuentas; // Capacidad máxima de cuentas

    public Banco(int max) {
        this.cuentas = new ArrayList<>(max);
        this.noC = 0;
        this.maxCuentas = max;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        if (noC < maxCuentas) {
            this.cuentas.add(cuenta);
            this.noC++;
        } else {
            System.out.println("No se pueden agregar más cuentas. Límite alcanzado.");
        }
    }

    public CuentaBancaria buscarCuenta(int noCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNoCuenta() == noCuenta) {
                return cuenta;
            }
        }
        return null;
    }

    public int getNumeroCuentas() {
        return noC;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "cuentas=" + cuentas +
                ", numeroCuentas=" + noC +
                ", maxCuentas=" + maxCuentas +
                '}';
    }
}