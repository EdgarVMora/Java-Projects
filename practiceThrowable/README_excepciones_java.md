
# Manejo de Excepciones en Java

Este proyecto tiene como objetivo enseñar y demostrar el uso correcto del manejo de excepciones en Java. Se incluye la teoría, ejemplos cotidianos, y ejercicios prácticos para reforzar el aprendizaje.

---

## 📚 ¿Qué son las excepciones?

Una **excepción** en Java es un evento que interrumpe el flujo normal del programa. Pueden surgir por errores del sistema, de lógica o por condiciones inesperadas durante la ejecución.

---

## 🧱 Jerarquía de Excepciones

```
Throwable
├── Error (no se manejan)
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── VirtualMachineError
└── Exception (sí se manejan)
    ├── Checked Exceptions (obligatorias de manejar)
    │   ├── IOException
    │   └── FileNotFoundException
    └── Unchecked Exceptions (opcionales de manejar)
        ├── ArithmeticException
        ├── NullPointerException
        └── ArrayIndexOutOfBoundsException
```

---

## 🔑 Palabras clave importantes

- `try`: Código que puede lanzar una excepción.
- `catch`: Código que maneja una excepción.
- `throw`: Lanza una excepción manualmente.
- `throws`: Declara que un método puede lanzar una excepción.
- `finally`: Bloque que siempre se ejecuta (ocurra o no una excepción).

---

## ✅ Ejemplos prácticos

### 1. Leer archivo con `java.io`

```java
import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        try {
            FileReader lector = new FileReader("notas.txt");
            BufferedReader buffer = new BufferedReader(lector);

            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println("Línea: " + linea);
            }

            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
```

---

## 🧠 Ejercicios sugeridos

1. **Cajero automático:** Lanza una excepción si el saldo es insuficiente.
2. **Conversor de edad:** Convierte un `String` a `int`, captura `NumberFormatException`.
3. **Validador de contraseña:** Si tiene menos de 8 caracteres, lanza una excepción personalizada.

---

## 💡 Recomendaciones

- Usa excepciones para mantener el control y estabilidad del programa.
- No atrapes errores del sistema (`Error`), enfócate en manejar `Exception`.
- Siempre cierra recursos (`finally` o `try-with-resources`).

---

## 📁 Recursos utilizados

- [`java.io`](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html): Lectura y escritura de archivos.
- Documentación oficial de Java: https://docs.oracle.com/javase/8/docs/api/

---

> Proyecto educativo creado para reforzar el conocimiento de excepciones en Java con enfoque práctico y profesional.
