package relacionNaN2;

public class Autor {
    //atributos
    private int id;
    private String nombre;

    // Constructores, getters y setters
    public Autor() {}

    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre;
    }
}
