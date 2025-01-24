# Proyecto 1: Simulador de Televisión
Este proyecto simula el comportamiento de una televisión. Incluye características como encender/apagar, cambiar de canal, ajustar el volumen y silenciar.

## Funcionalidad del `Main.java`

El archivo `Main.java` contiene el punto de entrada del programa y proporciona una interfaz de usuario simple basada en texto para interactuar con la clase `Television`. A continuación, se describe su funcionalidad principal.

### Descripción General

El programa solicita al usuario que ingrese la marca y el tamaño en pulgadas de la televisión. Luego, crea una instancia de la clase `Television` con estos valores. A continuación, presenta un menú con varias opciones para controlar la televisión.

### Menú de Opciones

El menú permite al usuario realizar las siguientes acciones:

1. **Encender/Apagar**: Cambia el estado de la televisión entre encendida y apagada.
2. **Avanzar canal**: Avanza al siguiente canal (1-5).
3. **Retroceder canal**: Retrocede al canal anterior (1-5).
4. **Establecer canal**: Permite al usuario ingresar un canal específico (1-5).
5. **Subir volumen**: Incrementa el volumen de la televisión.
6. **Bajar volumen**: Decrementa el volumen de la televisión.
7. **Silenciar/Desactivar silencio**: Cambia el estado de silencio de la televisión.
8. **Salir**: Termina el programa.

## Clase `Television`

La clase `Television` simula el comportamiento básico de una televisión. A continuación, se describen sus atributos y métodos principales.

### Atributos

- `marca`: Marca de la televisión.
- `pulgadas`: Tamaño de la pantalla en pulgadas.
- `encendida`: Estado de la televisión (encendida o apagada).
- `canalActual`: Canal actual en la televisión.
- `volumen`: Nivel de volumen actual.
- `silenciada`: Estado de silencio (silenciada o no).

### Constructor

El constructor inicializa una nueva instancia de la clase `Television` con los valores proporcionados para la marca y el tamaño en pulgadas. Por defecto, la televisión está apagada, en el canal 1, con un volumen de 5 y no está silenciada.

```java
public Television(String marca, int pulgadas) {
    this.marca = marca;
    this.pulgadas = pulgadas;
    this.encendida = false;  // Por defecto, apagada
    this.canalActual = 1;    // Canal inicial
    this.volumen = 5;        // Volumen inicial
    this.silenciada = false; // Por defecto, no silenciada
}
```
### Métodos
- `encenderApagar()`
- `avanzarCanal()`
- `retrocederCanal()`
- `establecerCanal(int canal)`
- `subirVolumen()`
- `bajarVolumen()`
- `silenciar()`


## Estructura de Archivos
- `Main.java`: Punto de entrada del programa.
- `Television.java`: Clase que define el comportamiento de la televisión.

## Cómo Ejecutar
1. Compila los archivos:
   ```bash
   javac Main.java Television.java
   ```

