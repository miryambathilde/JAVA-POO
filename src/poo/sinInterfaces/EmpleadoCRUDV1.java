package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Read/Retrieve
 * Update
 * Delete
 */

public class EmpleadoCRUDV1 {

    // ESTRUCTURA DE DATOS CON UN ARRAY LIST
    // ARRAY DINÁMICO
    private List<Empleado> empleados = new ArrayList<>();

    // OPERACIONES CRUD

    // CREATE un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    // READ - RECUPERAR EMPLEADOS
    public List<Empleado>findAll(){
        return empleados;
    }

}
