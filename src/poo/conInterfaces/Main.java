package poo.conInterfaces;

import poo.sinInterfaces.Empleado;

public class Main {

    // declaramos un objeto de tipo EmpleadoCRUD
    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        // aqui accedemos a los metodos de la interface EmpleadoCRUD
        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
