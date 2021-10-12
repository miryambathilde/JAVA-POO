package poo.conInterfaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los métodos de nuestra clase, pero no se implementan
 *
 * Actúa como un contrato, dice lo que hay que hacer pero no lo ejecuta
 */

public interface EmpleadoCRUD {
    // como no devuelve nada ponemos VOID
    // GUARDAR - CREAR EMPLEADO
    void save(Empleado empleado);

    // DEVUELVE UN ARRAY LIST de tipo EMPLEADO
    // READ - RECUPERAR LOS EMPLEADOS
    List<Empleado> findAll();

    // NO DEVUELVE NADA
    // DELETE - BORRAR EMPLEADO
    void delete(Empleado empleado);

}
