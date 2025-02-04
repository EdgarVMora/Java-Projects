# Proyecto: Operaciones con Fracciones

Este programa permite realizar operaciones básicas con fracciones, como suma, resta, multiplicación y división. Además, las fracciones se simplifican automáticamente.

## Clases Principales
### **1. Fracción**
Representa una fracción con numerador y denominador y permite realizar operaciones matemáticas con otras fracciones.

#### **Constructores**
```java
public Fraccion(int numerador, int denominador)
```
- Recibe el numerador y el denominador.
- Valida que el denominador no sea `0`.
- Simplifica automáticamente la fracción al crearse.

### **2. Métodos Principales (Resumen)**
- **sumar(Fraccion otra)**: Retorna una nueva fracción resultado de la suma.
- **restar(Fraccion otra)**: Retorna una nueva fracción resultado de la resta.
- **multiplicar(Fraccion otra)**: Retorna una nueva fracción producto de la multiplicación.
- **dividir(Fraccion otra)**: Retorna una nueva fracción resultado de la división.
- **toString()**: Devuelve la fracción en formato `a/b`.
- **simplificar()**: Reduce la fracción a su mínima expresión automáticamente.

## Cómo Ejecutar el Programa

### **Compilación**
Asegúrate de que los archivos `Fraccion.java` y `Main.java` están en el mismo directorio.
```bash
javac Fraccion.java Main.java
```

### **Ejecución**
Ejecuta el programa desde la terminal con:
```bash
java Main
```

El programa solicitará los valores de dos fracciones y mostrará los resultados de las operaciones básicas.

---
Este programa es una introducción al manejo de fracciones en Java y permite reforzar el uso de **clases, objetos y métodos matemáticos**.

