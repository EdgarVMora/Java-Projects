# 🏥 Veterinary System - Gestión de Perros y Propietarios

Este proyecto es un **sistema de gestión para perros y sus propietarios** utilizando **Programación Orientada a Objetos (POO) en Java**. Se implementan **relaciones entre clases** mediante **agregación y composición**, facilitando la interacción con la información a través de un menú dinámico en la consola.

---

## 📌 Clases y Atributos

### **1️⃣ Clase `Perro`**
Representa a un perro con sus características principales.

```java
private String nombre;
private String raza;
private String color;
private FechaNacimiento fechaNacimiento; // Composición
private Propietario propietario; // Agregación
```
### **1️⃣ Clase `Propietario`**
```java
private String nombre;
private String telefono;
private String correo;
```
### **1️⃣ Clase `FechaNacimiento`**
```java
private int dia;
private int mes;
private int anio;
```
Métodos Implementados

🔹 Perro
	•	calcularEdad(int diaActual, int mesActual, int anioActual): Calcula la edad del perro mediante operaciones matemáticas.
	•	agregarPropietario(String nombre, String telefono, String correo): Asigna un propietario al perro.
	•	modificarPropietario(): Permite modificar el nombre, teléfono o correo del propietario mediante un submenú.
	•	toString(): Muestra la información del perro y su propietario de manera ordenada.

🔹 Propietario
	•	setNombre(String nombre): Modifica el nombre del propietario.
	•	setTelefono(String telefono): Modifica el teléfono del propietario.
	•	setCorreo(String correo): Modifica el correo del propietario.

🔹 FechaNacimiento
	•	calcularEdad(int diaActual, int mesActual, int anioActual): Calcula la edad del perro comparando su fecha de nacimiento con la fecha actual.

## Menu del programa
1. Mostrar información del perro 🐶
2. Calcular edad del perro 📆
3. Agregar propietario 👤
4. Modificar propietario ✏️
5. Salir 🚪

## Submenu
1. Cambiar Nombre
2. Cambiar Teléfono
3. Cambiar Correo
4. Regresar

---

## Tema Abordado: Agregación y Composición en POO

En este ejercicio aplicamos los principios de la Programación Orientada a Objetos con dos tipos de relaciones entre clases:
1. Composición 🏗️ (Perro → FechaNacimiento)
	•	FechaNacimiento forma parte de Perro y no puede existir sin él.
	•	Si eliminamos un Perro, su FechaNacimiento también desaparece.
2.	Agregación 🔗 (Perro → Propietario)
	•	Propietario es un objeto independiente que puede existir sin el Perro.
	•	Un Perro puede agregar o modificar su Propietario sin problemas.

Este diseño permite flexibilidad y reutilización del código, simulando un escenario real de gestión veterinaria.

## Compilación y Ejecución
Compilar el programa
```java
javac -d bin src/projectVeterinary/*.java
```
Ejecutar el programa
```java
java -cp bin projectVeterinary.Main
```

