package interfaces;

public class Test {
    public static void main(String[] args) {
        Administrativo a = new Administrativo(200, 5000);
        Gerente g = new Gerente(2000000,5);
        
        a.calcularSueldo();
        System.out.println("---------------------");
        g.calcularSueldo();
        
        
    }
}
