package projectExam;

/**
 * Clase abstracta que representa una planta genérica en el juego.
 * Esta clase sirve como base para diferentes tipos de plantas.
 */
public abstract class Planta {
    // Número de proyectiles que tiene la planta
    private int proyectiles;

    /**
     * Constructor de la clase Planta
     * @param proyectiles Número inicial de proyectiles que tendrá la planta
     */
    public Planta(int proyectiles) {
        this.proyectiles = proyectiles;
    }

    /**
     * Obtiene el número de proyectiles actuales
     * @return Número de proyectiles restantes
     */
    public int getProyectiles() {
        return proyectiles;
    }

    /**
     * Establece el número de proyectiles
     * @param proyectiles Nuevo número de proyectiles
     */
    public void setProyectiles(int proyectiles) {
        this.proyectiles = proyectiles;
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas
     * Define cómo la planta lanza sus proyectiles
     */
    public abstract void lanzarProyectil();

    /**
     * Representación en String del estado de la planta
     * @return String con información sobre los proyectiles restantes
     */
    @Override
    public String toString() {
        return "Planta con " + proyectiles + " proyectiles.";
    }
}
