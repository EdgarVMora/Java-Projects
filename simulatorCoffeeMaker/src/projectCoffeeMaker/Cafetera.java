package projectCoffeeMaker;

public class Cafetera {
   
    private int capacidadMaxima; 
    private int cantidadActual; 


    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }


    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }


    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }


    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
    }


    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera se ha llenado completamente.");
    }


    public void servirTaza(int capacidadTaza) {
        if (capacidadTaza <= cantidadActual) {
            cantidadActual -= capacidadTaza;
            System.out.println("Se ha servido una taza de " + capacidadTaza + " ml.");
        } else {
            System.out.println("No hay suficiente café para llenar la taza. Se han servido " + cantidadActual + " ml.");
            cantidadActual = 0;
        }
    }


    public void agregarCafe(int cantidad) {
        if (cantidad > 0) {
            int nuevaCantidad = cantidadActual + cantidad;
            if (nuevaCantidad > capacidadMaxima) {
                cantidadActual = capacidadMaxima;
                System.out.println("La cafetera se ha llenado y el excedente se ha descartado.");
            } else {
                cantidadActual = nuevaCantidad;
                System.out.println("Se han agregado " + cantidad + " ml de café.");
            }
        } else {
            System.out.println("La cantidad a agregar debe ser positiva.");
        }
    }


    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera se ha vaciado.");
    }


    @Override
    public String toString() {
        return "Capacidad máxima: " + capacidadMaxima + " ml\n" +
               "Cantidad actual: " + cantidadActual + " ml";
    }
}
