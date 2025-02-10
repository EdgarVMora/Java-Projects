package projectTriangle;
import java.util.Scanner;

class Triangulo {
    private Recta rectaUno;
    private Recta rectaDos;
    private Recta rectaTres;

    public Triangulo(Recta rectaUno, Recta rectaDos, Recta rectaTres) {
        this.rectaUno = rectaUno;
        this.rectaDos = rectaDos;
        this.rectaTres = rectaTres;
    }

    public double calcularPerimetro() {
        return rectaUno.calcularLongitud() + rectaDos.calcularLongitud() + rectaTres.calcularLongitud();
    }

    public double calcularArea() {
        double base = rectaUno.calcularLongitud();
        double altura = calcularAltura();
        return (base * altura) / 2;
    }

    private double calcularAltura() {
        Punto A = rectaUno.getPuntoUno();
        Punto B = rectaUno.getPuntoDos();
        Punto C = rectaDos.getPuntoDos(); 

        return Math.abs((A.getX() * (B.getY() - C.getY()) + B.getX() * (C.getY() - A.getY()) + C.getX() * (A.getY() - B.getY())) / rectaUno.calcularLongitud());
    }

    public void modificarPunto() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Modificar Puntos del Triángulo ---");
            System.out.println("1. Cambiar Primer Punto");
            System.out.println("2. Cambiar Segundo Punto");
            System.out.println("3. Cambiar Tercer Punto");
            System.out.println("4. Regresar");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Nuevo valor de X: ");
                double x = scanner.nextDouble();
                System.out.println("Nuevo valor de Y: ");
                double y = scanner.nextDouble();
                Punto nuevoPunto = new Punto(x, y);

                switch (opcion) {
                    case 1: 
                    rectaUno.setPuntoUno(nuevoPunto); 
                    break;
                    case 2: 
                    rectaUno.setPuntoDos(nuevoPunto); 
                    break;
                    case 3: 
                    rectaDos.setPuntoDos(nuevoPunto); 
                    break;
                }
                System.out.println("Punto modificado correctamente.");
            }
        } while (opcion != 4);
    }

    public String toString() {
        return "Triángulo:\n" +
               "Lado 1: " + rectaUno.getPuntoUno() + " ➝ " + rectaUno.getPuntoDos() + " | Longitud: " + rectaUno.calcularLongitud() + "\n" +
               "Lado 2: " + rectaDos.getPuntoUno() + " ➝ " + rectaDos.getPuntoDos() + " | Longitud: " + rectaDos.calcularLongitud() + "\n" +
               "Lado 3: " + rectaTres.getPuntoUno() + " ➝ " + rectaTres.getPuntoDos() + " | Longitud: " + rectaTres.calcularLongitud();
    }
}
