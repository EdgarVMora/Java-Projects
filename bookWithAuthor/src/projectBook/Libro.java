package projectBook;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String editorial;
    private int noPaginas;
    private List<Autor> autores;

    public Libro(String titulo, String editorial, int noPaginas) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.noPaginas = noPaginas;
        this.autores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void asignarAutor(Autor autor) {
        if (!autores.contains(autor)) { 
            autores.add(autor);
            autor.asignarLibro(this); 
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Libro: ").append(titulo).append("\n");
        info.append("Editorial: ").append(editorial).append("\n");
        info.append("Páginas: ").append(noPaginas).append("\n");
        info.append("Autores:\n");
        for (Autor autor : autores) {
            info.append("- ").append(autor.getNombre()).append("\n");
        }
        return info.toString();
    }
}