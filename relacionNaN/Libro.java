package relacionNaN;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private int id;
    private String titulo;
    private List<Autor> autores;

    public Libro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.autores = new ArrayList<>();
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void agregarAutor(Autor autor) {
        if (!autores.contains(autor)) {
            autores.add(autor);
            autor.agregarLibro(this);
        }
    }

    public void removerAutor(Autor autor) {
        autores.remove(autor);
        autor.getLibros().remove(this);
    }

//    @Override
//    public String toString() {
//        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autores=" + autores + '}';
//    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Libro{id=").append(id)
                .append(", titulo='").append(titulo).append('\'')
                .append(", autores=");

        if (autores.isEmpty()) {
            stringBuilder.append("[]");
        } else {
            stringBuilder.append("[");
            for (int i = 0; i < autores.size(); i++) {
                stringBuilder.append(autores.get(i).getNombre());
                if (i < autores.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]");
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
