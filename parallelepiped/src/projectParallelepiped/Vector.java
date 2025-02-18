package projectParallelepiped;

class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { 
        return x; 
    }
    public double getY() { 
        return y; 
    }
    public double getZ() { 
        return z; 
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector unitario() {
        double mag = magnitud();
        return new Vector(x / mag, y / mag, z / mag);
    }

    public Vector multiplicarPorEscalar(double escalar) {
        return new Vector(x * escalar, y * escalar, z * escalar);
    }

    public Vector sumar(Vector otro) {
        return new Vector(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }

    public double productoPunto(Vector otro) {
        return this.x * otro.x + this.y * otro.y + this.z * otro.z;
    }

    public Vector productoCruz(Vector otro) {
        double i = this.y * otro.z - this.z * otro.y;
        double j = this.z * otro.x - this.x * otro.z;
        double k = this.x * otro.y - this.y * otro.x;
        return new Vector(i, j, k);
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}