package projectVeterinary;
import java.util.Scanner;

class Perro {
    private String nombre;
    private String raza;
    private String color;
    private FechaNacimiento fechaNacimiento;
    private Propietario propietario;

    public Perro(String nombre, String raza, String color, FechaNacimiento fechaNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
        this.propietario = null; 
    }


    public String getNombre() { 
        return nombre; 
    }
    public String getRaza() { 
        return raza; 
    }
    public String getColor() { 
        return color; 
    }
    public FechaNacimiento getFechaNacimiento() { 
        return fechaNacimiento; 
    }
    public Propietario getPropietario() { 
        return propietario; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public void setRaza(String raza) { 
        this.raza = raza; 
    }
    public void setColor(String color) { 
        this.color = color;
    }

   
    public int calcularEdad(int diaActual, int mesActual, int anioActual) {
        return fechaNacimiento.calcularEdad(diaActual, mesActual, anioActual);
    }

    //* 
    public void agregarPropietario(String nombre, int telefono, String correo) {
        this.propietario = new Propietario(nombre, telefono, correo);
    }

   
    public void modificarPropietario() {
        if (propietario == null) {
            System.out.println("No hay propietario registrado.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Modificar Propietario ---");
            System.out.println("1. Cambiar Nombre");
            System.out.println("2. Cambiar Teléfono");
            System.out.println("3. Cambiar Correo");
            System.out.println("4. Regresar");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            

            switch (opcion) {
                case 1:
                    System.out.println("Nuevo nombre: ");
                    propietario.setNombre(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Nuevo teléfono: ");
                    propietario.setTelefono(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Nuevo correo: ");
                    propietario.setCorreo(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    // Método toString
    public String toString() {
        return " Perro: " + nombre + "\nRaza: " + raza + "\nColor: " + color + 
               "\nFecha de Nacimiento: " + fechaNacimiento.toString() + 
               (propietario != null ? "\n" + propietario.toString() : "\nSin propietario registrado.");
    }

}
