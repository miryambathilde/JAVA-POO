package poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

/*      USANDO V1
        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();

        Empleado juanito = new Empleado("Juanito", 26, 18000, true);
        Empleado jimena = new Empleado("Jimena", 28, 42000, true);
        Empleado alex = new Empleado("Alex", 30, 36000, true);

        // nos muestra el objeto completo gracias al metodo tostring() de la clase
        System.out.println(juanito); // Empleado{nombre='Juanito', edad=26, salario=18000.0, alta=true}
        System.out.println(jimena); // Empleado{nombre='Jimena', edad=28, salario=42000.0, alta=true}
        System.out.println(alex); // Empleado{nombre='Alex', edad=30, salario=36000.0, alta=true}

        // GUARDAR - CREAR EMPLEADOS
        empleadoCRUDV1.save(juanito);
        empleadoCRUDV1.save(jimena);
        empleadoCRUDV1.save(alex);

        // CONSULTAR EMPLEADOS
        List<Empleado> empleados = empleadoCRUDV1.findAll();
        // [Empleado{nombre='Juanito', edad=26, salario=18000.0, alta=true}, Empleado{nombre='Jimena', edad=28, salario=42000.0, alta=true}, Empleado{nombre='Alex', edad=30, salario=36000.0, alta=true}] //
        System.out.println(empleados);*/

        // USANDO V2
        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();

        Empleado juanito = new Empleado("Juanito", 26, 18000, true);
        Empleado jimena = new Empleado("Jimena", 28, 42000, true);
        Empleado alex = new Empleado("Alex", 30, 36000, true);

        // nos muestra el objeto completo gracias al metodo tostring() de la clase
        System.out.println(juanito); // Empleado{nombre='Juanito', edad=26, salario=18000.0, alta=true}
        System.out.println(jimena); // Empleado{nombre='Jimena', edad=28, salario=42000.0, alta=true}
        System.out.println(alex); // Empleado{nombre='Alex', edad=30, salario=36000.0, alta=true}


        // CONSULTAR EMPLEADOS
        List<Empleado> empleados = empleadoCRUDV2.recuperarEmpleados();
        // [Empleado{nombre='Juanito', edad=26, salario=18000.0, alta=true}, Empleado{nombre='Jimena', edad=28, salario=42000.0, alta=true}, Empleado{nombre='Alex', edad=30, salario=36000.0, alta=true}] //
        System.out.println(empleados);

    }
}
