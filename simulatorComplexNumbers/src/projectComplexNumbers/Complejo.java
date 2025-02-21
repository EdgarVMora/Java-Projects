package projectComplexNumbers;

// Clase Complejo
public class Complejo {
    private double real;
    private double imaginario;

    // Constructor
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    // Sumar complejos
    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    // Restar complejos
    public Complejo restar(Complejo otro) {
        return new Complejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    // Multiplicar complejos
    public Complejo multiplicar(Complejo otro) {
        double nuevoReal = this.real * otro.real - this.imaginario * otro.imaginario;
        double nuevoImaginario = this.real * otro.imaginario + this.imaginario * otro.real;
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // Conjugado del número complejo
    public Complejo conjugado() {
        return new Complejo(this.real, -this.imaginario);
    }

    // Módulo del número complejo
    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    // Ángulo del número complejo
    public double angulo() {
        return Math.atan2(imaginario, real);
    }

    // Método toString para mostrar el número complejo
    @Override
    public String toString() {
        return real + " + " + imaginario + "i";
    }
}
