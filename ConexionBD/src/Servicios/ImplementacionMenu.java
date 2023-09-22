package Servicios;

public class ImplementacionMenu implements InterfazMenu{
    @Override
    public void mostrarMenu() {
        System.out.println("0. Salir");
        System.out.println("1. Registro Empleado");
    }
}
