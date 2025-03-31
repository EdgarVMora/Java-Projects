# Simulador de Termómetro

Este proyecto implementa un simulador de termómetro que puede manejar temperaturas tanto en Celsius como en Fahrenheit.

## Descripción

El simulador permite realizar diversas operaciones con temperaturas, incluyendo:
- Lectura de temperatura actual
- Conversión entre escalas de temperatura
- Determinación del estado de la temperatura
- Almacenamiento de múltiples temperaturas
- Visualización de temperaturas mínimas y máximas registradas
- Reseteo de memoria

## Clases Utilizadas

### Termometro (Clase Abstracta)
**Atributos principales:**
- `temperatura`: double - Almacena la temperatura actual
- `temperaturas`: List<Double> - Lista para almacenar el historial de temperaturas

**Métodos principales:**
- `convertir()`: Método abstracto para conversión de temperatura
- `determinarTemperatura()`: Método abstracto para determinar el estado
- `guardarEnMemoria()`: Almacena la temperatura actual en el historial
- `minimo()`: Retorna la temperatura mínima registrada
- `maximo()`: Retorna la temperatura máxima registrada
- `resetearMemoria()`: Limpia el historial de temperaturas

### TermometroFahrenheit
Implementación específica para temperaturas en Fahrenheit.

### TermometroCelsius
Implementación específica para temperaturas en Celsius.

## Main Principal

El programa principal (`Main.java`) proporciona una interfaz de usuario por consola que permite:
1. Seleccionar el tipo de termómetro (Fahrenheit o Celsius)
2. Ingresar temperaturas
3. Acceder a un menú con todas las operaciones disponibles
4. Almacenar múltiples temperaturas
5. Visualizar estadísticas
6. Reiniciar el sistema

## Cómo Ejecutar

1. Asegúrate de tener Java instalado en tu sistema
2. Navega hasta el directorio del proyecto
3. Compila los archivos:
```bash
javac projectThermometer/*.java
```
4. Ejecuta el programa:
```bash
java projectThermometer.Main
```

## Requisitos
- Java JDK 8 o superior 