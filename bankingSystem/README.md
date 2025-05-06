# Sistema Bancario en Java

## Descripción
Este proyecto implementa un sistema bancario simple en Java que demuestra el manejo de excepciones utilizando `try-catch`, `throw`, `throws` y la cláusula `finally`. El sistema está diseñado para mostrar las mejores prácticas en el manejo de errores y validaciones en aplicaciones bancarias.

## Estructura del Proyecto
El sistema bancario está compuesto por las siguientes clases principales:

### Clases Principales
- **`CuentaBancaria`**: 
  - Gestiona el saldo y número de cuenta de un cliente
  - Implementa operaciones de depósito y retiro
  - Incluye validaciones y manejo de excepciones para operaciones inválidas

- **`Banco`**: 
  - Administra una colección de cuentas bancarias
  - Proporciona funcionalidades para agregar y buscar cuentas
  - Mantiene un registro del número total de cuentas

- **`Main`**: 
  - Implementa la interfaz de usuario
  - Maneja la interacción con el usuario a través de la consola
  - Gestiona todas las excepciones que pueden ocurrir durante las operaciones

## Manejo de Excepciones
El sistema implementa un robusto manejo de excepciones para garantizar la integridad de las operaciones:

### Tipos de Excepciones
1. **`IllegalArgumentException`**
   - Validación de balance inicial negativo
   - Verificación de formato de número de cuenta (5 dígitos)
   - Control de cantidades negativas en depósitos y retiros

2. **`InsufficientFundsException`**
   - Excepción personalizada para manejar intentos de sobregiro
   - Implementada como excepción no comprobada (unchecked)

3. **`InputMismatchException`**
   - Manejo de entradas inválidas del usuario
   - Validación de tipos de datos en la consola

## Requisitos
- Java Development Kit (JDK) 8 o superior
- Sistema operativo compatible con Java

## Compilación y Ejecución

### Compilación
Para compilar el proyecto, ejecute el siguiente comando desde la raíz del proyecto:

```bash
javac -d bin src/projectBank/*.java
```

### Ejecución
Para ejecutar el programa, use el siguiente comando:

```bash
java -cp bin projectBank.Main
```

## Uso del Programa
El sistema presenta un menú interactivo con las siguientes opciones:

```
--- Menú ---
1. Crear Cuenta
2. Depositar
3. Retirar
4. Salir
```

### Notas Importantes
- Los números de cuenta deben ser de 5 dígitos
- No se permiten saldos negativos
- El banco tiene una capacidad máxima de cuentas configurable
- Todas las entradas numéricas son validadas

## Características Técnicas
- Implementación de excepciones personalizadas
- Validación robusta de entradas
- Manejo de colecciones con ArrayList
- Interfaz de usuario basada en consola
- Estructura de proyecto organizada