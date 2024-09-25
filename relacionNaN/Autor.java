package relacionNaN;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private int id;
    private String nombre;
    private List<Libro> libros;

    public Autor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Getters y setters
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

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            libro.agregarAutor(this);
        }
    }

    public void removerLibro(Libro libro) {
        libros.remove(libro);
//        libro.getAutores().remove(this);
        libro.removerAutor(this);
    }

    /*
        El error "java.lang.StackOverflowError" indica que se ha producido una 
        recursión infinita en la llamada al método toString() dentro de la clase 
        Autor. Esto ocurre porque estamos intentando imprimir la lista de libros 
        en el método toString(), pero cada libro contiene una lista de autores que, 
        a su vez, intenta imprimir la lista de libros, creando un ciclo infinito.

        Para solucionar este problema, modificamos el método toString() de la 
        clase Autor para evitar la recursión infinita. En lugar de imprimir 
        directamente la lista de libros, imprimimos solo los nombres de los libros.
    
        Esta versión del método toString() verifica si la lista de libros está 
        vacía. Si está vacía, se imprime "[]". De lo contrario, itera sobre la 
        lista de libros y agrega los nombres de los libros separados por comas.
    
     */
//    @Override
//    public String toString() {
//        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", libros=" + libros + '}';
//    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Autor{id=").append(id)
                .append(", nombre='").append(nombre).append('\'')
                .append(", libros=");

        if (libros.isEmpty()) {
            stringBuilder.append("[]");
        } else {
            stringBuilder.append("[");
            for (int i = 0; i < libros.size(); i++) {
                stringBuilder.append(libros.get(i).getTitulo());
                if (i < libros.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]");
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }
    
    /*
        La diferencia principal entre String y StringBuilder en Java es que String 
        es una clase inmutable, mientras que StringBuilder es una clase mutable 
        diseñada específicamente para la manipulación eficiente de cadenas de 
        caracteres.

        Cuando se trabaja con la clase String, cada vez que se realiza una operación 
        que modifica la cadena, en realidad se crea una nueva instancia de String 
        en memoria. Esto se debe a que los objetos String son inmutables, lo que 
        significa que no se pueden cambiar después de su creación. Por ejemplo, 
        al concatenar dos cadenas usando el operador +, se crea un nuevo objeto 
        String que contiene la concatenación de las dos cadenas originales. Esto 
        puede ser ineficiente en términos de uso de memoria y rendimiento si se 
        realizan muchas modificaciones en una cadena.

        Por otro lado, la clase StringBuilder se utiliza para construir cadenas 
        de caracteres de manera eficiente. Al contrario que los objetos String, 
        los objetos StringBuilder son mutables, lo que significa que se pueden 
        modificar sin necesidad de crear una nueva instancia en cada modificación. 
        StringBuilder proporciona métodos como append(), insert(), delete(), 
        replace(), entre otros, que permiten modificar la cadena subyacente sin 
        tener que crear nuevos objetos en cada operación. Esto puede ser muy útil 
        cuando se necesita realizar múltiples operaciones de modificación en una 
        cadena.
    */

}
