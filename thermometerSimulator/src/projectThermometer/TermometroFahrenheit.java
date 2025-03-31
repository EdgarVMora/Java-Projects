package projectThermometer;

class TermometroFahrenheit extends Termometro {
    public TermometroFahrenheit(double grados) {
        super(grados);
    }

    @Override
    public String determinarTemperatura() {
        return (grados < 100.4) ? "Temperatura normal: " + grados + " °F" : "Fiebre: " + grados + " °F";
    }

    @Override
    public double convertir() {
        return (grados - 32) * 5 / 9;
    }

    @Override
    public String toString() {
        return super.toString() + " °F";
    }
}
