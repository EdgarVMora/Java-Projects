package projectVeterinary;
 
class Propietario {
    private String nombre;
    private int telefono;
    private String correo;

    public Propietario(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public void setTelefono(int telefono) { 
        this.telefono = telefono; 
    }
    public void setCorreo(String correo) { 
        this.correo = correo; 
    }

    public String toString() {
        return "Propietario: " + nombre + "\nTeléfono: " + telefono + "\nCorreo: " + correo;
    }
}