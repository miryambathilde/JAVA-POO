package poo.sinInterfaces;

public class Empleado {
    // 1. ATRIBUTOS
    String nombre;
    int edad;
    double salario;
    boolean alta;

    // 2. CONSTRUCTORES
    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    // 3. MÉTODOS - TO STRING()

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
