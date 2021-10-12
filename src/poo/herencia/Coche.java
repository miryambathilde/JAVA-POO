package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

// HERENCIA CLASE DERIVADA O CLASE HIJA O SUBCLASE
public class Coche extends Vehiculo {

    int numPuertas;

    public Coche(){}

    public Coche(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, int numPuertas) {
        // ATRIBUTOS QUE EXTIENDE DE LA CLASE SUPERIOR - VEHICULO
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.numPuertas = numPuertas;
    }
}
