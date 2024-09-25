package relacionNaN2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor(1, "Jorge Borges");
        Autor autor2 = new Autor(2, "Eduardo Sacheri");

        // Crear libros
        Libro libro1 = new Libro(1, "El Aleph");
        Libro libro2 = new Libro(2, "La vida que pensamos");

        // Crear relaciones
        AutorLibro relacion1 = new AutorLibro(autor1, libro1);
        AutorLibro relacion2 = new AutorLibro(autor2, libro2);

        // Agregar relaciones a una lista o cualquier otra estructura de datos
        List<AutorLibro> relaciones = new ArrayList<>();
        relaciones.add(relacion1);
        relaciones.add(relacion2);
        
        
        for (AutorLibro unaRelacion : relaciones) {
            System.out.println("Autor: " + unaRelacion.getAutor());
            System.out.println("Libro: " + unaRelacion.getLibro());
            System.out.println("--------------------------------");
        }
    
    }
}
