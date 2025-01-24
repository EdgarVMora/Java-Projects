# Proyecto: Simulación de Cuenta Bancaria

Este proyecto simula el comportamiento de una cuenta bancaria básica. Incluye la creación de una clase que representa una cuenta bancaria y un programa principal que permite interactuar con ella.

## Clase Principal: `CuentaBancaria`
La clase `CuentaBancaria` modela los elementos fundamentales de una cuenta bancaria, como su número de cuenta, titular y saldo.

```java
public class CuentaBancaria {
    private int numeroCuenta; // Número de cuenta
    private String titular;   // Nombre del titular
    private double saldo;     // Saldo de la cuenta

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = 0;
        this.titular = "Sin titular";
        this.saldo = 0.0;
    }
```

### Métodos Implementados
- **Getters**: Para obtener información sobre el número de cuenta, el titular y el saldo.
- **Setters**: Para modificar el nombre del titular.
- **Depósito y Retiro**: Métodos que permiten depositar y retirar dinero de la cuenta respetando las restricciones del saldo.
- **toString**: Método para mostrar todos los datos de la cuenta bancaria.

## Programa Principal: `Main`
El programa principal instancia un objeto de la clase `CuentaBancaria` e invoca los métodos implementados para probar su funcionalidad.

## Cómo Ejecutar el Programa

### Compilación
1. Asegúrate de que los archivos `CuentaBancaria.java` y `Main.java` están en el mismo directorio.
2. Compila ambos archivos con el siguiente comando desde la terminal:
   ```bash
   javac CuentaBancaria.java Main.java
   ```

### Ejecución
1. Una vez compilados, ejecuta el programa principal con el siguiente comando:
   ```bash
   java Main
   ```
2. El programa mostrará en la salida los resultados de las operaciones realizadas sobre la cuenta bancaria.

---

Este proyecto es una introducción a los conceptos básicos de la programación orientada a objetos en Java, utilizando clases, objetos, métodos y atributos de manera estructurada.

