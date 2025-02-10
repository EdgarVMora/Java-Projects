package projectTriangle;

class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { 
        return x; 
    }
    public double getY() { 
        return y; 
    }
    public void setX(double x) { 
        this.x = x; 
    }
    public void setY(double y) { 
        this.y = y; 
    }

    public double calcularDistancia(Punto otroPunto) {
        double dx = otroPunto.getX() - this.x;
        double dy = otroPunto.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
