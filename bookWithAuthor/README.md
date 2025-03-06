# Sistema de Gestión de Libros y Autores

Este proyecto implementa un sistema de gestión de biblioteca que permite administrar libros y sus autores, estableciendo relaciones bidireccionales entre ellos.

## Estructura del Proyecto

El proyecto está organizado en el paquete `projectBook` y contiene las siguientes clases:

### 1. Clase Libro
**Atributos:**
- titulo (String)
- editorial (String)
- noPaginas (int)
- autores (List<Autor>)

**Métodos:**
- Constructor
- asignarAutor()
- getTitulo()
- getAutores()
- toString()

### 2. Clase Autor
**Atributos:**
- nombre (String)
- nacionalidad (String)
- fechaNacimiento (Fecha)
- libros (List<Libro>)

**Métodos:**
- Constructor
- asignarLibro()
- getNombre()
- toString()

### 3. Clase Fecha
**Atributos:**
- dia (int)
- mes (int)
- anyo (int)

**Métodos:**
- Constructor
- toString()

### 4. Clase Main
Contiene el programa principal con un menú interactivo que permite:
- Agregar nuevos libros
- Agregar autores a los libros
- Mostrar libros y sus autores
- Mostrar información detallada de autores

## Compilación y Ejecución

### Requisitos
- Java JDK 8 o superior
- Terminal o línea de comandos

### Pasos para compilar

1. Navega hasta el directorio raíz del proyecto:
```bash
cd ruta/hacia/bookWithAuthor
```

2. Crea el directorio bin si no existe:
```bash
mkdir bin
```

3. Compila el proyecto:
```bash
javac -d bin src/projectBook/*.java
```

### Ejecutar el programa
```bash
java -cp bin projectBook.Main
```

## Uso del Programa

1. Al iniciar el programa, se mostrará un menú con las siguientes opciones:
   - 1: Nuevo libro
   - 2: Mostrar libros
   - 3: Salir

2. Al agregar un nuevo libro (opción 1):
   - Ingresar título
   - Ingresar editorial
   - Ingresar número de páginas
   - Submenú para gestionar autores:
     - Agregar autor
     - Mostrar autores
     - Regresar al menú principal

3. La opción 2 muestra todos los libros registrados con sus respectivos autores.

## Características

- Relación bidireccional entre libros y autores
- Prevención de duplicados en las relaciones
- Gestión de múltiples autores por libro
- Gestión de múltiples libros por autor
- Interfaz de usuario por consola
