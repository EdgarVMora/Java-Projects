package projectNetflix;
public class TarjetaRegalo {
    private String codigoActivacion;
    private String plan;
    private int duracion;


    public TarjetaRegalo(String codigoActivacion, String plan) {
        this.codigoActivacion = codigoActivacion;
        this.plan = plan;
        this.duracion = obtenerDuracion(plan);
    }


    private int obtenerDuracion(String plan) {
        return switch (plan.toLowerCase()) {
            case "estandar con anuncios" -> 30;
            case "estandar" -> 65;
            case "premium" -> 100;
            default -> 0;
        };
    }

    public String getCodigoActivacion() {
        return codigoActivacion;
    }

    public String getPlan() {
        return plan;
    }

    public int getDuracion() {
        return duracion;
    }
}
    

