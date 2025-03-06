package projectBook;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Fecha fechaNacimiento;
    private List<Libro> libros;

    public Autor(String nombre, String nacionalidad, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = new ArrayList<>();
    }

    public void asignarLibro(Libro libro) {
        if (!libros.contains(libro)) { 
            libros.add(libro);
            libro.asignarAutor(this); 
        }
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Autor: ").append(nombre).append("\n");
        info.append("Nacionalidad: ").append(nacionalidad).append("\n");
        info.append("Fecha de nacimiento: ").append(fechaNacimiento).append("\n");
        info.append("Libros:\n");
        for (Libro libro : libros) {
            info.append("- ").append(libro.getTitulo()).append("\n");
        }
        return info.toString();
    }
}