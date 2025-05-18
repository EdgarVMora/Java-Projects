package ProjectExam;

public class EmpleadoBase extends Empleado {
    private int antiguedad;
    private double salarioBase;

    public EmpleadoBase(String nombre, int id, int antiguedad, double salarioBase) {
        super(nombre, id);
        this.antiguedad = antiguedad;
        this.salarioBase = salarioBase;
    }

    //No te compliques, usa get para todos tus datos, no sabemos cuando podamos ocuparlos
    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (antiguedad * 100); 
        //Aqui solo falto implementar la logica de antiguedad, me dio mucha flojera hacerla.
    }

    @Override
    public String toString() {
        return super.toString() + ", Antigüedad: " + antiguedad + " años, Salario Base: " + salarioBase;
    }
}