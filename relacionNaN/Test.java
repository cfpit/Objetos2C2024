package relacionNaN;

public class Test {
    public static void main(String[] args) {
        Autor autor1 = new Autor(1, "Jorge Borges");
        Autor autor2 = new Autor(2, "Eduardo Sacheri");

        Libro libro1 = new Libro(1, "El Aleph");
        Libro libro2 = new Libro(2, "La vida que pensamos");

        autor1.agregarLibro(libro1);
        autor2.agregarLibro(libro2);

        System.out.println("Libros del Autor 1:");
        for (Libro libro : autor1.getLibros()) {
            System.out.println(libro);
        }
        
        System.out.println("---------------------------");

        System.out.println("Libros del Autor 2:");
        for (Libro libro : autor2.getLibros()) {
            System.out.println(libro);
        }
        
        System.out.println("---------------------------");
        
        System.out.println("Autores del Libro 1:");
        for (Autor autor : libro1.getAutores()) {
            System.out.println(autor);
        }
        
        System.out.println("---------------------------");
        
        System.out.println("Autores del Libro 2:");
        for (Autor autor : libro2.getAutores()) {
            System.out.println(autor);
        }
    }
}
