package projectParallelepiped;

class Paralelepipedo {
    private Vector v1;
    private Vector v2;
    private Vector v3;

    public Paralelepipedo(Vector v1, Vector v2, Vector v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public void mostrarInformacion() {
        System.out.println(this);
    }

    public double calcularVolumen() {
        Vector v2v3 = v2.productoCruz(v3);
        return Math.abs(v1.productoPunto(v2v3));
    }

    public void setV1(Vector v1) { 
        this.v1 = v1; 
    }
    public void setV2(Vector v2) { 
        this.v2 = v2; 
    }
    public void setV3(Vector v3) { 
        this.v3 = v3; 
    }

    public String toString() {
        return "Paralelepipedo:\n" +
               "🔹 V1: " + v1 + "\n" +
               "🔹 V2: " + v2 + "\n" +
               "🔹 V3: " + v3;
    }
}
