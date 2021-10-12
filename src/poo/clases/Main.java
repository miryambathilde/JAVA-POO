package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    // STATIC: significa que este metodo pertenece a esta clase y nos permite ejecutar sin necesidad de crear un objeto
    // en este caso de la clase MAIN
    public static void main(String[] args) {
        // 1. CLASES Y OBJETOS:

        // CREACIÓN DE OBJETOS A PARTIR DE UNA CLASE
        // Clase identificador = new Clase(); - esto llamará al constructor
        
        // CREACIÓN OBJETO CON CONSTRUCTOR VACÍO
        Vehiculo toyotaPrius = new Vehiculo();

        // CREACIÓN DE OBJETO CON EL CONSTRUCTOR CON PARÁMETROS - lo normal es que sea con todos los atributos
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
        // PODEMOS ACCEDER A LOS ATRIBUTOS DEL OBJETO DE ESTA MANERA:
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed); // 0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed); // 50

        // 2. HERENCIA
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("Fin del programa");

        // 3. POLIMORFISMO - podemos tener multiples formas
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. CLASES ABSTRACTAS: no se pueden instanciar, sólo se instancian las clases hijas
    }
}
