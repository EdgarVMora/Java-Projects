package projectThermometer;

class TermometroCelsius extends Termometro {
    public TermometroCelsius(double grados) {
        super(grados);
    }

    @Override
    public String determinarTemperatura() {
        return (grados < 38) ? "Temperatura normal: " + grados + " °C" : "Fiebre: " + grados + " °C";
    }

    @Override
    public double convertir() {
        return (grados * 9 / 5) + 32;
    }

    @Override
    public String toString() {
        return super.toString() + " °C";
    }
}
