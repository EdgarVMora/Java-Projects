package projectClinic;

class Medicion {
    private double peso;
    private double altura;
    private Fecha fecha;
    
    public Medicion(double peso, double altura, Fecha fecha) {
        this.peso = peso;
        this.altura = altura;
        this.fecha = fecha;
    }
    
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    public String clasificacionIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Bajo peso";
        else if (imc >= 18.5 && imc < 24.9) return "Peso normal";
        else if (imc >= 25 && imc < 29.9) return "Sobrepeso";
        else if (imc >= 30 && imc < 39.9) return "Obesidad";
        else if (imc >= 40) return "Obesidad Morbida";
        else return "No hay clasificacion de IMC para los valores dados";
    }
    
    public Fecha getFecha() {
        return fecha;
    }
    
    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Peso: " + peso + " kg, Altura: " + altura + " m, IMC: " + calcularIMC() + " (" + clasificacionIMC() + ")";
    }
}
