package projectExam;

/**
 * Clase que representa una planta de guisantes en el juego.
 * Hereda de la clase abstracta Planta y tiene la capacidad de lanzar guisantes
 * individuales o realizar un ataque especial en ráfaga.
 */
public class PlantaGuisantes extends Planta {

    /**
     * Constructor de la clase PlantaGuisantes
     * Inicializa la planta con 15 proyectiles (guisantes)
     */
    public PlantaGuisantes() {
        super(15);
    }

    /**
     * Implementación del método abstracto lanzarProyectil
     * Lanza un guisante si hay proyectiles disponibles
     */
    @Override
    public void lanzarProyectil() {
        if (getProyectiles() > 0) {
            setProyectiles(getProyectiles() - 1);
            System.out.println("PlantaGuisantes lanza 1 guisante. Quedan: " + getProyectiles());
        } else {
            System.out.println("Sin proyectiles.");
        }
    }

    /**
     * Método especial que permite lanzar 5 guisantes simultáneamente
     * Requiere al menos 5 proyectiles para ejecutarse
     */
    public void disparoRafaga() {
        if (getProyectiles() >= 5) {
            setProyectiles(getProyectiles() - 5);
            System.out.println("Disparo en ráfaga: ¡5 guisantes lanzados! Quedan: " + getProyectiles());
        } else {
            System.out.println("No hay suficientes proyectiles para ráfaga.");
        }
    }

    /**
     * Representación en String del estado de la planta
     * @return String con información sobre los guisantes restantes
     */
    @Override
    public String toString() {
        return "PlantaGuisantes con " + getProyectiles() + " guisantes restantes.";
    }
}
