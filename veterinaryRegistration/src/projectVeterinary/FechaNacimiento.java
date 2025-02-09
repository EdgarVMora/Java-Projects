package projectVeterinary;

class FechaNacimiento {
    private int dia;
    private int mes;
    private int anio;

    public FechaNacimiento(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() { 
        return dia; 
    }
    public int getMes() { 
        return mes; 
    }
    public int getAnio() { 
        return anio; 
    }

    public int calcularEdad(int diaActual, int mesActual, int anioActual) {
        int edad = anioActual - this.anio;
        
        
        if (mesActual < this.mes || (mesActual == this.mes && diaActual < this.dia)) {
            edad--; 
        }

        return edad;
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
