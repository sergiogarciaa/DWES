package Servicios;

import Entidades.Empleado;

import java.util.List;

public interface InterfazEmpleado {
    List<Empleado> empleados(List<Empleado>listaEmpleados);
    List<Empleado> modificarEmpleados(List<Empleado>listaEmpleados);
}
