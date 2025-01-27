# Proyecto: Simulación de una Cafetera

Este proyecto simula el funcionamiento básico de una cafetera, permitiendo realizar operaciones como llenar la cafetera, servir café, agregar café y vaciarla. El programa está diseñado para practicar conceptos fundamentales de programación orientada a objetos en Java.

## Clase Principal: `Cafetera`
La clase `Cafetera` modela los elementos esenciales de una cafetera, como su capacidad máxima y la cantidad actual de café.

### Constructores Usados
1. **Constructor predeterminado**:
   - Inicializa la capacidad máxima en `1000 ml` y la cantidad actual en `0 ml`, simulando una cafetera vacía.
   - Este constructor es útil para empezar con valores predefinidos.

2. **Constructor con capacidad máxima**:
   - Permite especificar la capacidad máxima de la cafetera y la inicializa llena.
   - Es ideal para personalizar la cafetera según el tamaño deseado.

3. **Constructor con capacidad máxima y cantidad actual**:
   - Permite definir tanto la capacidad máxima como la cantidad actual.
   - Garantiza que la cantidad actual nunca supere la capacidad máxima, promoviendo el uso seguro de la clase.

### Métodos Implementados
- **Getters y Setters**: Para acceder y modificar la capacidad máxima y la cantidad actual.
- **llenarCafetera**: Llena la cafetera al máximo de su capacidad.
- **servirTaza**: Sirve una taza con la cantidad indicada o lo que quede disponible.
- **agregarCafe**: Añade café a la cafetera, respetando su capacidad máxima.
- **vaciarCafetera**: Vacía por completo la cafetera.
- **toString**: Muestra el estado actual de la cafetera.

## Programa Principal: `Main`
El programa principal permite interactuar con la cafetera a través de un menú. Este menú incluye opciones para realizar las operaciones descritas anteriormente y fomenta la práctica de estructuras de control (`switch`) y manejo de entradas de usuario.

## Cómo Ejecutar el Programa

### Compilación
1. Asegúrate de que los archivos `Cafetera.java` y `Main.java` están en el mismo directorio.
2. Compila ambos archivos con el siguiente comando desde la terminal:
   ```bash
   javac -d bin src/simulatorTv/*.java
   ```

### Ejecución
1. Una vez compilados, ejecuta el programa principal con el siguiente comando:
   ```bash
    java -cp bin simulatorTv.Main 
   ```
2. Sigue las instrucciones en el menú interactivo para operar la cafetera.

## Elementos Nuevos para Aprender
- **Constructores Sobrecargados**: Se utilizan múltiples constructores para manejar diferentes escenarios de inicialización, mostrando cómo se pueden aplicar buenas prácticas de diseño en clases.
- **Menú Interactivo**: Implementado con la estructura `do-while` y `switch`, permite al usuario realizar operaciones de manera dinámica.
- **Control de Límites**: Métodos como `servirTaza` y `agregarCafe` aseguran que los valores no excedan los límites establecidos, fomentando un enfoque robusto en la programación.

---

Este proyecto es una excelente introducción a la programación orientada a objetos y el manejo de interacciones dinámicas en consola con Java. ¡Disfruta aprendiendo y mejorando este código! 😊

