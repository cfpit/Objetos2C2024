package relacionNaN2;

public class AutorLibro {
    private Autor autor;
    private Libro libro;

    // Constructores, getters y setters
    public AutorLibro() {}

    public AutorLibro(Autor autor, Libro libro) {
        this.autor = autor;
        this.libro = libro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "autor=" + autor + ", libro=" + libro;
    }
}
