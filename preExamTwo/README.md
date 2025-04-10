# 🌱 Simulación de Plantas Lanzadoras

## 📋 Descripción
Este proyecto es una simulación orientada a objetos que implementa un sistema de plantas con habilidades especiales para lanzar proyectiles. El proyecto demuestra conceptos fundamentales de programación orientada a objetos como:
- Clases abstractas
- Herencia
- Polimorfismo
- Encapsulamiento
- Arreglos de objetos

Incluye un menú interactivo que permite al usuario controlar el comportamiento de las plantas en tiempo real.

## 🏗️ Estructura del Proyecto

### Clase Abstracta: `Planta`
- **Propiedades**:
  - Variable privada `proyectiles`
  - Métodos getter y setter
  - Método abstracto `lanzarProyectil()`
  - Implementación base de `toString()`

- **Razón de ser abstracta**:
  - Evita la instanciación de plantas genéricas
  - Obliga a las clases hijas a implementar su propio comportamiento de lanzamiento

### Clase: `PlantaGuisantes`
- **Características**:
  - Hereda de `Planta`
  - Inicializa con 15 proyectiles
  - Implementa `lanzarProyectil()`
  - Método especial `disparoRafaga()` (lanza 5 proyectiles simultáneamente)
  - Implementación personalizada de `toString()`

### Clase: `PlantaMaices`
- **Características**:
  - Hereda de `Planta`
  - Inicializa con 10 proyectiles y 100g de mantequilla
  - Consume 20g de mantequilla por super ataque
  - Implementa `lanzarProyectil()`
  - Método especial `superMaiz()`
  - Implementación personalizada de `toString()`

## 🎯 Objetivos de Aprendizaje
Este proyecto está diseñado para reforzar los siguientes conceptos:
- Diferenciación entre clases padre e hijas
- Aplicación de polimorfismo mediante métodos sobrescritos
- Utilización de encapsulamiento a través de métodos getter y setter
- Implementación de estructuras dinámicas (arreglos de objetos)
- Diseño de interfaces interactivas

## 🚀 Compilación y Ejecución

### Requisitos
- Java Development Kit (JDK) instalado
- Archivos del proyecto en el mismo directorio:
  - `Planta.java`
  - `PlantaGuisantes.java`
  - `PlantaMaices.java`
  - `Main.java`

### Pasos para ejecutar
1. Abre una terminal en el directorio del proyecto
2. Compila los archivos Java:
   ```bash
   javac *.java
   ```
3. Ejecuta el programa:
   ```bash
   java Main
   ```