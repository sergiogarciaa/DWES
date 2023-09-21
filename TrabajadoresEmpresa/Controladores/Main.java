package Controladores;

import Entidades.Empleado;
import Servicios.ImplementacionEmpleado;
import Servicios.ImplementacionMenu;
import Servicios.InterfazEmpleado;
import Servicios.InterfazMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializacion
        List<Empleado> listaEmpleados = new ArrayList<>();

        InterfazEmpleado empleados = new ImplementacionEmpleado();
        InterfazMenu menu = new ImplementacionMenu();

        // Imprimir el menú por consola
        // Scanner con la opción del usuario
        Scanner entradaOpcion = new Scanner(System.in);
        Boolean cerrarMenu = false;
        int opcion;
        while (!cerrarMenu) {
            //Mostramos el menú
            menu.mostrarMenu();
            System.out.println("Introduza la opción deseada: ");
            opcion = entradaOpcion.nextInt();
            System.out.println("[INFO] - Has seleccionado la opcion " + opcion);

            switch (opcion) {
                case 0:
                    cerrarMenu = true;
                    // Salir
                    break;
                case 1:
                    empleados.empleados(listaEmpleados);
                    break;
                case 2:
                    empleados.modificarEmpleados(listaEmpleados);
                    break;
                case 3:
                    break;
                default:

            }
        }
    }
}
