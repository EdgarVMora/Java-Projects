package projectClinic;

class Paciente {
    private int id;
    private String nombre;
    private Medicion[] mediciones;
    private int contador;
    
    public Paciente(int id, String nombre, int maxMediciones) {
        this.id = id;
        this.nombre = nombre;
        this.mediciones = new Medicion[maxMediciones];
        this.contador = 0;
    }
    
    public void registrarMedicion(Medicion medicion) {
        if (contador < mediciones.length) {
            mediciones[contador++] = medicion;
        } else {
            System.out.println("No se pueden agregar más mediciones.");
        }
    }
    
    public void mostrarIMCporFecha(Fecha fecha) {
        for (Medicion m : mediciones) {
            if (m != null && m.getFecha().toString().equals(fecha.toString())) {
                System.out.println("IMC en " + fecha + ": " + m.calcularIMC() + " (" + m.clasificacionIMC() + ")");
                return;
            }
        }
        System.out.println("No se encontró una medición para la fecha indicada.");
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente ID: ").append(id).append(", Nombre: ").append(nombre).append("\nMediciones:\n");
        for (Medicion m : mediciones) {
            if (m != null) sb.append(m).append("\n");
        }
        return sb.toString();
    }
}