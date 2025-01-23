package projectSimulatorTv;

public class Television {
    private String marca;
    private int pulgadas;
    private boolean encendida;
    private int canalActual;
    private int volumen;
    private boolean silenciada;

    // Constructor
    public Television(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.encendida = false;  // Por defecto, apagada
        this.canalActual = 1;   // Canal inicial
        this.volumen = 5;       // Volumen inicial
        this.silenciada = false;
    }

    // Método para encender y apagar
    public void encenderApagar() {
        encendida = !encendida;
        System.out.println(encendida ? "La televisión está encendida." : "La televisión está apagada.");
    }

    // Métodos para cambiar el canal
    public void avanzarCanal() {
        if (encendida) {
            canalActual = (canalActual % 5) + 1;
            System.out.println("Canal actual: " + canalActual);
        } else {
            System.out.println("La televisión está apagada.");
        }
    }

    public void retrocederCanal() {
        if (encendida) {
            canalActual = (canalActual == 1) ? 5 : canalActual - 1;
            System.out.println("Canal actual: " + canalActual);
        } else {
            System.out.println("La televisión está apagada.");
        }
    }

    public void establecerCanal(int canal) {
        if (encendida) {
            if (canal >= 1 && canal <= 5) {
                canalActual = canal;
                System.out.println("Canal cambiado a: " + canalActual);
            } else {
                System.out.println("Canal inválido. Los canales disponibles son del 1 al 5.");
            }
        } else {
            System.out.println("La televisión está apagada.");
        }
    }

    // Métodos para controlar el volumen
    public void subirVolumen() {
        if (encendida && !silenciada) {
            if (volumen < 10) {
                volumen++;
                System.out.println("Volumen: " + volumen);
            } else {
                System.out.println("El volumen está al máximo.");
            }
        } else if (!encendida) {
            System.out.println("La televisión está apagada.");
        } else {
            System.out.println("La televisión está en silencio.");
        }
    }

    public void bajarVolumen() {
        if (encendida && !silenciada) {
            if (volumen > 0) {
                volumen--;
                System.out.println("Volumen: " + volumen);
            } else {
                System.out.println("El volumen está en el mínimo.");
            }
        } else if (!encendida) {
            System.out.println("La televisión está apagada.");
        } else {
            System.out.println("La televisión está en silencio.");
        }
    }

    public void silenciar() {
        if (encendida) {
            silenciada = !silenciada;
            System.out.println(silenciada ? "La televisión está en silencio." : "El silencio ha sido desactivado.");
        } else {
            System.out.println("La televisión está apagada.");
        }
    }
}