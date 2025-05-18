package ProjectExam;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>(); // Inicializa una lista vacía
    }

    //No te compliques, usa get para todos tus datos, no sabemos cuando podamos ocuparlos
    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
        System.out.println("Empleado " + empleado.getNombre() + " agregado a " + nombre);
    }

    //Esto es opcional, esta facil entenderlo ya que sabes como se usa un StringBuilder y un ForEach
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Empresa: " + nombre + "\nEmpleados:\n");
        for (Empleado empleado : empleados) {
        //Es pura logica, yo se que lo entiendes
            sb.append("- ").append(empleado).append("\n");
        }
        return sb.toString();
    }
}