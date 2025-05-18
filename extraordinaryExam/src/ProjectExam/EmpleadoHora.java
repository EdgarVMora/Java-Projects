package ProjectExam;

public class EmpleadoHora extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoHora(String nombre, int id, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    //No te compliques, usa get para todos tus datos, no sabemos cuando podamos ocuparlos
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas Trabajadas: " + horasTrabajadas + ", Tarifa por Hora: " + tarifaPorHora;
    }
}
