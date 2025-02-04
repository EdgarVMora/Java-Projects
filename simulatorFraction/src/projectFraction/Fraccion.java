package projectFraction;
public class Fraccion {
    private int numerador;
    private int denominador;

    
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
        simplificar();
    }


    private void simplificar() {
        int gcd = calcularMCD(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int calcularMCD(int a, int b) {
        if (b == 0) return a;
        return calcularMCD(b, a % b);
    }


    public Fraccion sumar(Fraccion otra) {
        int num = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int den = this.denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    public Fraccion restar(Fraccion otra) {
        int num = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int den = this.denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(this.numerador * otra.numerador, this.denominador * otra.denominador);
    }

    public Fraccion dividir(Fraccion otra) {
        return new Fraccion(this.numerador * otra.denominador, this.denominador * otra.numerador);
    }


    public String toString() {
        return numerador + "/" + denominador;
    }
}