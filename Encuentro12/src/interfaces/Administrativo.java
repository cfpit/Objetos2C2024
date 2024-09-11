package interfaces;

public class Administrativo implements Empleado{
    //atributos
    private int horas;
    private int valor;
    
    //constructores
    public Administrativo() {}

    public Administrativo(int horas, int valor) {
        this.setHoras(horas);
        this.setValor(valor);
    }
    
    //getters y setters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //metodos
    //implemento el metodo de la interface
    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo Administrativo = " + horas *  valor);
    }
    
    
    
    @Override
    public String toString() {
        return "Administrativo{" + "horas=" + horas + ", valor=" + valor + '}';
    }
}
