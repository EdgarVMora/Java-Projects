package projectTriangle;

class Recta {
    private Punto puntoUno;
    private Punto puntoDos;

    public Recta(Punto puntoUno, Punto puntoDos) {
        this.puntoUno = puntoUno;
        this.puntoDos = puntoDos;
    }

    public Punto getPuntoUno() { 
        return puntoUno; 
    }
    public Punto getPuntoDos() { 
        return puntoDos; 
    }

    public void setPuntoUno(Punto punto) { 
        this.puntoUno = punto; 
    }
    public void setPuntoDos(Punto punto) { 
        this.puntoDos = punto; 
    }

    public double calcularLongitud() {
        return puntoUno.calcularDistancia(puntoDos);
    }

    public String toString() {
        return "Punto 1: " + puntoUno + ", Punto 2: " + puntoDos + ", Longitud: " + calcularLongitud();
    }
}
