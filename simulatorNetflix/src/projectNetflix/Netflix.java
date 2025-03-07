package projectNetflix;
//Clase Netflix que simula el uso de un plan de Netflix
public class Netflix {
    private String usuario;
    private boolean activo;
    private String plan;
    private int duracion;

    //Constructor de la clase Netflix
    public Netflix(String usuario) {
        this.usuario = usuario;
        this.activo = false;
        this.plan = "Sin plan";
        this.duracion = 0;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean isActivo() {
        return activo;  
    }

    public String getPlan() {
        return plan;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Metodo para activar un plan de Netflix
    public void activarPlan(TarjetaRegalo tarjeta, String codigoIngresado) {
        if (tarjeta.getCodigoActivacion().equals(codigoIngresado)) {
            this.plan = tarjeta.getPlan();
            this.duracion = tarjeta.getDuracion();
            this.activo = true;
            System.out.println("Plan activado: " + plan + " por " + duracion + " días.");
        } else {
            System.out.println("Código inválido. No se activó el plan.");
        }
    }

    public void verContenido() {
        if (activo) {
            System.out.println("Viendo películas y series.");
            duracion--;
            if (duracion <= 0) {
                activo = false;
                plan = "Sin plan";
                System.out.println("El plan ha expirado. Activa uno nuevo para continuar.");
            }
        } else {
            System.out.println("No tienes un plan activo. Activa un plan para ver contenido.");
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + "\n" +
               "Estado: " + (activo ? "Activo" : "Inactivo") + "\n" +
               (activo ? ("Plan: " + plan + "\nDuración restante: " + duracion + " días") : "");
    }
}




