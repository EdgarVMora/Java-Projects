# 📐 Triángulo con Agregación en Java

Este proyecto implementa un sistema para representar un **triángulo** en un plano cartesiano, utilizando **Programación Orientada a Objetos (POO)** en **Java**. Se aplican los conceptos de **agregación** para organizar las relaciones entre los elementos básicos del triángulo:

- **Clase `Punto`**: Representa un punto en el plano.  
- **Clase `Recta`**: Representa un lado del triángulo, definido por dos puntos.  
- **Clase `Triangulo`**: Representa el triángulo, formado por tres rectas.  

## 📌 Clases y Atributos

### **1 Clase `Punto`**
Representa un punto con coordenadas `(x, y)`.
```java
private double x;
private double y;
```
### **2 Clase `Recta`**
Representa un lado del triangulo entre dos puntos.
```java
private Punto puntoUno;
private Punto puntoDos;
```

### **3 Clase `Trinagulo`**
Esta compuesto por tres rectas que forma un triangulo en un plano cartesiano.
```java
private Recta rectaUno;
private Recta rectaDos;
private Recta rectaTres;
```

📌 Métodos Implementados

🔹 Punto
- calcularDistancia(Punto otroPunto): Calcula la distancia entre dos puntos.

🔹 Recta
- calcularLongitud(): Retorna la longitud de la recta, calculando la distancia entre sus puntos.

🔹 Triangulo
- calcularPerimetro(): Suma las longitudes de los tres lados del triángulo.
- calcularArea(): Usa la fórmula (base × altura) / 2 sin librerías externas.
- modificarPunto(): Permite modificar los puntos del triángulo mediante un submenú.

📌 Menú del Programa

🔹 Opciones disponibles en la consola:

1. Mostrar información del triángulo 📐
2. Calcular perímetro 📏
3. Calcular área 🏗️
4. Modificar puntos del triángulo ✏️
5. Salir 🚪

🔹  Submenu

1. Cambiar Primer Punto
2. Cambiar Segundo Punto
3. Cambiar Tercer Punto
4. Regresar

📌 Lógica del Código

Este ejercicio usa agregación, ya que las clases Punto, Recta y Triangulo están relacionadas de forma jerárquica:
1. Punto → Es la base de los cálculos y se usa en la clase Recta.
2. Recta → Representa los lados del triángulo y se compone de Punto.
3. Triangulo → Contiene tres rectas, definiendo así la estructura completa.

Compilacion 
```java
javac -d bin src/projectTriangle/*.java
```

Ejecucion
```java
java -cp bin projectTriangle.Main
```
