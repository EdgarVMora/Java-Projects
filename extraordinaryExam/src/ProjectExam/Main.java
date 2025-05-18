package ProjectExam;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Instanciamos la empresa como nos lo indica su Constructor (Es tu guia para saber el orden y que va entre parentesis)
        Empresa miEmpresa = new Empresa("Mi Gran Empresa");

        //Instanciamos los empleados como nos lo indica su Constructor
        Empleado empleadoBase1 = new EmpleadoBase("Juan Pérez", 101, 5, 30000.0);
        Empleado empleadoBase2 = new EmpleadoBase("María Gómez", 102, 2, 25000.0);
        Empleado empleadoHora1 = new EmpleadoHora("Carlos López", 201, 160.0, 150.0);
        Empleado empleadoHora2 = new EmpleadoHora("Laura Vargas", 202, 180.0, 130.0);
        Empleado empleadoHora3 = new EmpleadoHora("Pedro Díaz", 203, 180, 140);

        //Vamos a corrigir algo que te ensene de no instanciar clases padres:
        /* 
         * Aquí, empleadoBase1 es una instancia de la clase EmpleadoBase, y empleadoHora1 es una instancia de la clase EmpleadoHora. 
         * Ambas clases extienden la clase abstracta Empleado, por lo que son de tipo Empleado (gracias al polimorfismo), pero son instancias de sus 
         * propias clases concretas.
        */

         // Agregar empleados a la empresa
         miEmpresa.agregarEmpleado(empleadoBase1);
         miEmpresa.agregarEmpleado(empleadoBase2);
         miEmpresa.agregarEmpleado(empleadoHora1);
         miEmpresa.agregarEmpleado(empleadoHora2);
         miEmpresa.agregarEmpleado(empleadoHora3);
 
         System.out.println("\n--- Información de la Empresa ---");
         System.out.println(miEmpresa); // Llama al toString() de Empresa, no te compliques KISS.
         //No te recomiendo que vayas sacando cada dato de cada trabajador, sera muy cansado
         //NO USAR empleadoBase1.getNombre().getId() --> NO funciona esa sintaxis
 
         // Mandar a traer información de los empleados y usar métodos de ArrayList
         List<Empleado> listaDeEmpleados = miEmpresa.getEmpleados();
 
         System.out.println("\n--- Accediendo a la lista de empleados ---");
         System.out.println("Número total de empleados: " + listaDeEmpleados.size());


         //Lo que viene a continuacion es extra, es para que conozcas todo lo que pudes hacer con ArrayList
 
         System.out.println("\n--- Información del primer empleado ---");
         if (!listaDeEmpleados.isEmpty()) {
             Empleado primerEmpleado = listaDeEmpleados.get(0);
             System.out.println(primerEmpleado); // Llama al toString() del empleado
             System.out.println("Salario del primer empleado: " + primerEmpleado.calcularSalario() + primerEmpleado.getId());
         }
 
         System.out.println("\n--- Información de todos los empleados (iterando) ---");
         for (int i = 0; i < listaDeEmpleados.size(); i++) {
             Empleado empleado = listaDeEmpleados.get(i);
             System.out.println("Empleado en índice " + i + ": " + empleado.getNombre() + " (Salario: " + empleado.calcularSalario() + ")");
         }
 
         System.out.println("\n--- Agregando un nuevo empleado a la empresa ---");
         Empleado nuevoEmpleadoBase = new EmpleadoBase("Ana Ruiz", 104, 1, 28000.0);
         miEmpresa.agregarEmpleado(nuevoEmpleadoBase);
         System.out.println("\n--- Información de la Empresa Actualizada ---");
         System.out.println(miEmpresa);
 
         // Otros métodos útiles de ArrayList (ejemplos)
         System.out.println("\n--- Otros métodos de ArrayList ---");
         System.out.println("¿Contiene la lista a Juan Pérez? " + listaDeEmpleados.contains(empleadoBase1)); // Compara referencias de objetos
 
         // Para comparar por contenido, necesitarías implementar equals() en la clase Empleado
 
         // Ejemplo de cómo remover un empleado (por índice)
         if (!listaDeEmpleados.isEmpty()) {
             System.out.println("Removiendo al empleado en el índice 0: " + listaDeEmpleados.get(0).getNombre());
             listaDeEmpleados.remove(0);
             System.out.println("Número de empleados después de remover: " + listaDeEmpleados.size());
         }
 
         // Ejemplo de cómo verificar si la lista está vacía
         System.out.println("¿Está la lista de empleados vacía? " + listaDeEmpleados.isEmpty());
 
         // Ejemplo de cómo limpiar la lista (remover todos los empleados)
         // listaDeEmpleados.clear();
         // System.out.println("¿Está la lista de empleados vacía después de limpiar? " + listaDeEmpleados.isEmpty());
     }

}
