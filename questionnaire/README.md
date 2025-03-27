# Ejercicios de Herencia y Polimorfismo en Java

## Ejercicio 1: Relación entre Clases
### Código
```java
ClassA x = new ClassB();
```

### Respuesta
La compilación exitosa de este código nos indica que existe una relación de herencia entre las clases. Específicamente, ClassB es una subclase de ClassA, lo que permite realizar un upcasting de manera implícita. Esta es una característica fundamental del polimorfismo en Java.

## Ejercicio 2: Corrección de Casting
### Código con error
```java
ClassA x = new ClassB();
ClassB y = x;  // Error de compilación
```

### Código corregido
```java
ClassA x = new ClassB();
ClassB y = (ClassB) x;  // Downcasting explícito
```

### Respuesta
Para solucionar este error de compilación, necesitamos realizar un downcasting explícito. Esto es necesario porque aunque sabemos que 'x' contiene una referencia a un objeto ClassB, el compilador solo ve el tipo declarado ClassA.

## Ejercicio 3: Análisis de Polimorfismo
### Código
```java
Foo f = new Bar();
f.method();
```

### Respuesta
En este caso, cuando ejecutemos el código, veremos impreso "Bar" en la consola. Esto demuestra el funcionamiento del polimorfismo en tiempo de ejecución: aunque la variable está declarada como tipo Foo, el método que se ejecuta es el de la clase Bar, ya que esta sobrescribe (override) el método original.

## Ejercicio 4: Sobrecarga vs Sobrescritura
### Código
```java
Foo f = new Goo();
f.method();
```

### Respuesta
Al ejecutar este código, observaremos que se imprime "Bar" y no "Goo". Esto ocurre porque el método method(String message) en Goo representa una sobrecarga (overload) del método original, no una sobrescritura (override). Por lo tanto, se ejecuta la implementación heredada de Bar.

## Ejercicio 5: Análisis de Métodos Disponibles
### Respuesta
Un objeto de la clase Goo tiene acceso a los siguientes métodos:
- method() heredado de la jerarquía Foo/Bar
- method(String message) definido en la propia clase Goo

## Ejercicio 6: Clasificación de Métodos
### Respuesta
En la clase Goo encontramos dos tipos de implementaciones:
- **Sobrecarga (Overloading)**: method(String message)
- **Sobrescritura (Overriding)**: method() heredado de Foo y Bar