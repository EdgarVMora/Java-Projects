package projectBank;

import java.util.ArrayList;
import java.util.List; // Asegúrate de importar List

public class Banco {
    private ArrayList<CuentaBancaria> cuentas;
    private int noC; // Contador de cuentas. Considera si este es realmente necesario
                     // si usas cuentas.size() para el número actual de cuentas.
                     // Si maxCuentas es un límite estricto, entonces noC < maxCuentas es correcto.
    private final int maxCuentas; // Capacidad máxima de cuentas

    public Banco(int max) {
        // Si 'max' es la capacidad inicial pero quieres que crezca dinámicamente,
        // simplemente new ArrayList<>() es suficiente.
        // Si 'max' es un límite estricto, está bien inicializarlo con 'max',
        // aunque ArrayList crecerá si se supera la capacidad inicial (hasta el límite de memoria).
        // La lógica de noC < maxCuentas en agregarCuenta maneja el límite estricto.
        this.cuentas = new ArrayList<>(max); // Puedes dejarlo así o new ArrayList<>()
        this.noC = 0;
        this.maxCuentas = max;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        if (noC < maxCuentas) {
            // Antes de agregar, sería bueno verificar si ya existe una cuenta con el mismo número
            // para evitar duplicados, si esa es una regla de negocio.
            // Ejemplo:
            // if (buscarCuenta(cuenta.getNoCuenta()) != null) {
            //     System.out.println("Error: Ya existe una cuenta con el número " + cuenta.getNoCuenta());
            //     return; // No la agregas
            // }
            this.cuentas.add(cuenta);
            this.noC++; // Incrementas tu contador
        } else {
            System.out.println("No se pueden agregar más cuentas. Límite alcanzado: " + maxCuentas);
        }
    }

    public CuentaBancaria buscarCuenta(int noCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNoCuenta() == noCuenta) {
                return cuenta;
            }
        }
        return null;
    }

    public int getNumeroCuentas() {
        // Si noC siempre se mantiene sincronizado con el número real de elementos en la lista,
        // está bien. Alternativamente, podrías usar:
        // return this.cuentas.size();
        // Pero dado que gestionas 'noC' manualmente y tienes 'maxCuentas', tu 'noC' es el contador actual.
        return noC;
    }

    /**
     * Devuelve una NUEVA lista conteniendo una copia de todas las cuentas bancarias.
     * Esto es para que clases externas (como BancoIO) puedan leer las cuentas
     * sin poder modificar la lista interna original del Banco directamente.
     * @return Una lista de copia de las cuentas.
     */
    public List<CuentaBancaria> getCopiaDeCuentas() {
        return new ArrayList<>(this.cuentas); // Crea y devuelve una copia superficial de la lista
    }
    
    /**
     * Limpia todas las cuentas del banco.
     * Útil si al cargar desde archivo quieres reemplazar todas las cuentas existentes.
     */
    public void limpiarCuentas() {
        this.cuentas.clear();
        this.noC = 0; // Reiniciar el contador
        System.out.println("Todas las cuentas han sido eliminadas del banco.");
    }


    @Override
    public String toString() {
        // Podrías mejorar este toString para que no imprima directamente la lista
        // si contiene muchos elementos, o para darle un formato más amigable.
        StringBuilder sb = new StringBuilder();
        sb.append("Banco (").append(noC).append("/").append(maxCuentas).append(" cuentas):\n");
        if (noC == 0) {
            sb.append("  No hay cuentas registradas.\n");
        } else {
            // Es más seguro iterar sobre la lista hasta su tamaño real (noC)
            // o usar un for-each loop si noC siempre refleja cuentas.size()
            // Si noC puede ser menor que cuentas.size() (por ejemplo, si se eliminan cuentas
            // sin decrementar noC o reorganizar la lista), entonces iterar hasta noC
            // y acceder con get(i) está bien, asumiendo que las cuentas están al inicio.
            // Sin embargo, si se eliminan elementos del ArrayList y noC no se maneja con cuidado,
            // this.cuentas.get(i) podría fallar o no reflejar la realidad.
            // Usar cuentas.size() es más robusto si noC no se garantiza que sea siempre el tamaño exacto
            // de elementos válidos y contiguos desde el inicio.
            // Dado que 'agregarCuenta' añade al final y 'noC' se incrementa,
            // iterar hasta 'noC' y usar get(i) es correcto mientras las cuentas no se eliminen
            // individualmente de la mitad de la lista.
            // La forma más segura y común con ArrayList es iterar hasta cuentas.size() o usar for-each.
            // Si `noC` es un contador estricto de elementos válidos y `cuentas` puede tener "huecos"
            // o ser más grande, entonces la lógica actual es para acceder solo a los `noC` primeros.
            // Pero `ArrayList.add` siempre añade al final, y `cuentas.clear()` en `limpiarCuentas`
            // reinicia todo. Así que `noC` debería ser igual a `cuentas.size()`.
            // Por lo tanto, iterar hasta `cuentas.size()` o usar un for-each es preferible.

            // Opción 1 (usando noC, asumiendo que siempre es el número de elementos válidos y contiguos):
            // for(int i = 0; i < noC; i++) {
            //    sb.append("  ").append(this.cuentas.get(i).toString()).append("\n");
            // }

            // Opción 2 (más robusta y común para ArrayList):
            for(CuentaBancaria cuenta : this.cuentas) {
                 sb.append("  ").append(cuenta.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
