package projectExam;

/**
 * Clase que representa una planta de maíz en el juego.
 * Hereda de la clase abstracta Planta y tiene la capacidad de lanzar maíces
 * y realizar un ataque especial con mantequilla.
 */
public class PlantaMaices extends Planta {
    // Cantidad de mantequilla disponible para ataques especiales
    private int mantequilla;

    /**
     * Constructor de la clase PlantaMaices
     * Inicializa la planta con 10 proyectiles y 100g de mantequilla
     */
    public PlantaMaices() {
        super(10);
        this.mantequilla = 100;
    }

    /**
     * Implementación del método abstracto lanzarProyectil
     * Lanza un maíz si hay proyectiles disponibles
     */
    @Override
    public void lanzarProyectil() {
        if (getProyectiles() > 0) {
            setProyectiles(getProyectiles() - 1);
            System.out.println("PlantaMaices lanza 1 maíz. Quedan: " + getProyectiles());
        } else {
            System.out.println("Sin maíces.");
        }
    }

    /**
     * Método especial que permite lanzar un super maíz
     * Requiere tanto proyectiles como mantequilla
     */
    public void superMaiz() {
        if (getProyectiles() > 0 && mantequilla >= 20) {
            setProyectiles(getProyectiles() - 1);
            mantequilla -= 20;
            System.out.println("Super maíz lanzado. Maíces: " + getProyectiles() + ", Mantequilla: " + mantequilla + "g");
        } else {
            System.out.println("No hay suficientes recursos para lanzar super maíz.");
        }
    }

    /**
     * Obtiene la cantidad de mantequilla disponible
     * @return Cantidad de mantequilla en gramos
     */
    public int getMantequilla() {
        return mantequilla;
    }

    /**
     * Representación en String del estado de la planta
     * @return String con información sobre maíces y mantequilla restantes
     */
    @Override
    public String toString() {
        return "PlantaMaices con " + getProyectiles() + " maíces restantes y " + mantequilla + "g de mantequilla.";
    }
}
