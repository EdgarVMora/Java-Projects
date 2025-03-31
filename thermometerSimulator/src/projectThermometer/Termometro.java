package projectThermometer;

import java.util.ArrayList;
import java.util.List;

public abstract class Termometro implements Temperatura, Estadistica {
    protected double grados;
    protected static final int TAMANIO_MEMORIA = 5;
    protected double[] memoria = new double[TAMANIO_MEMORIA];
    protected int n = 0;
    protected List<Double> temperaturas;

    
    public Termometro(double grados) {
        this.grados = grados;
        this.temperaturas = new ArrayList<>();
        guardarEnMemoria();
    }

   
    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
        guardarEnMemoria();
    }

    public void setTemperatura(double temperatura) {
        this.grados = temperatura;
    }

    public abstract double convertir();

    
    public void guardarEnMemoria() {
        temperaturas.add(grados);
        if (n < TAMANIO_MEMORIA) {
            memoria[n] = grados;
        } else {
            System.arraycopy(memoria, 1, memoria, 0, TAMANIO_MEMORIA - 1);
            memoria[TAMANIO_MEMORIA - 1] = grados;
        }
        n = Math.min(n + 1, TAMANIO_MEMORIA);
    }

   
    public void resetearMemoria() {
        temperaturas.clear();
        for (int i = 0; i < TAMANIO_MEMORIA; i++) {
            memoria[i] = 0;
        }
        n = 0;
    }

    
    public String imprimirMemoria() {
        StringBuilder sb = new StringBuilder("Memoria de temperaturas: ");
        for (int i = 0; i < n; i++) {
            sb.append(memoria[i]).append(" ");
        }
        return sb.toString().trim();
    }

    
    public double minimo() {
        if (temperaturas.isEmpty()) {
            return Double.NaN;
        }
        return temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .getAsDouble();
    }

    public double maximo() {
        if (temperaturas.isEmpty()) {
            return Double.NaN;
        }
        return temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .getAsDouble();
    }

    
    @Override
    public String toString() {
        return "Temperatura actual: " + grados;
    }

    public abstract String determinarTemperatura();
}
