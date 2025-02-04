# Proyecto: Simulación de Cuenta Netflix con Tarjeta de Regalo

Este programa simula la activación y uso de una cuenta de Netflix mediante una tarjeta de regalo. Se implementa un sistema de planes con diferentes duraciones y costos, y un menú interactivo para gestionar la cuenta.

## Clases Principales
### **1. TarjetaRegalo**
Representa una tarjeta de regalo con un código de activación y un plan asociado.

#### **Constructores**
```java
public TarjetaRegalo(String codigoActivacion, String plan)
```
- Recibe un código de activación y el tipo de plan asociado.
- Determina automáticamente la duración del plan según el tipo seleccionado.

### **2. CuentaNetflix**
Representa una cuenta de usuario con la posibilidad de activar planes y ver contenido.

#### **Constructores**
```java
public CuentaNetflix(String usuario)
```
- Recibe el nombre del usuario y lo inicializa con el servicio inactivo y sin plan.

## Métodos Principales (Resumen)
- **activarPlan(TarjetaRegalo, String código)**: Activa un plan si el código de la tarjeta es válido.
- **verContenido()**: Permite ver contenido si el servicio está activo, reduciendo la duración del plan.
- **toString()**: Devuelve una cadena con el estado de la cuenta (usuario, plan, duración restante).

## Cómo Ejecutar el Programa

### **Compilación**
Asegúrate de que los archivos `TarjetaRegalo.java`, `CuentaNetflix.java` y `Main.java` están en el mismo directorio.
```bash
javac TarjetaRegalo.java CuentaNetflix.java Main.java
```

### **Ejecución**
Ejecuta el programa desde la terminal con:
```bash
java Main
```

El programa mostrará un menú interactivo para gestionar la cuenta.

---
Este programa es una introducción al uso de **dependencias** en Java y permite comprender la relación entre clases en un sistema simple.

