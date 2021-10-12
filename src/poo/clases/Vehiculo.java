package poo.clases;

// HERENCIA: CLASE PADRE
// la clase siempre empieza por mayúscula
public class Vehiculo {

    // 1. ATRIBUTOS
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // 2. CONSTRUCTORES - Método especial para construir el objeto a partir de la clase que es como una plantilla
    // SIEMPRE TIENEN QUE SER PÚBLICOS y siempre lleva el nombre de la clase
    // CONSTRUCTOR VACÍO
    public Vehiculo(){}


    // SOBRECARGA DE CONSTRUCTOR - Constructor con parámetros
    // ESTE SERIA PARA TENER LA INFO COMPLETA DEL VEHICULO


    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    // SOBRECARGA DE CONSTRUCTOR - CON MENOS PARÁMETROS
    // ESTE SERÍA LOS DATOS MINIMOS PARA PODER REGISTRAR EL VEHICULO
    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    // 3. MÉTODOS (COMPORTAMIENTO)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    // getter y setter

    // toString
}
