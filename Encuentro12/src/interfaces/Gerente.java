package interfaces;

public class Gerente implements Empleado{
    //atributos
    private int sueldo;
    private int antiguedad;
    
    //constructores
    public Gerente() {}

    public Gerente(int sueldo, int antiguedad) {
        this.setSueldo(sueldo);
        this.setAntiguedad(antiguedad);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    //metodos
    //implemento el metodo de la interface

    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo Gerente = " + (sueldo+ sueldo*antiguedad*0.1));
    }
    
    @Override
    public String toString() {
        return "Gerente{" + "sueldo=" + sueldo + ", antiguedad=" + antiguedad + '}';
    }
}









