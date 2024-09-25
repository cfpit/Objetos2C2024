package relacionNaN2;

public class Libro {
    private int id;
    private String titulo;

    // Constructores, getters y setters
    public Libro() {}

    public Libro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

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

    //metodos
    @Override
    public String toString() {
        return "id=" + id + ", titulo=" + titulo;
    }
}
