package Servicios;

import Entidades.Empleado;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ImplementacionEmpleado implements InterfazEmpleado {
    public List<Empleado> empleados(List<Empleado> listaEmpleados) {
        // Asignacion aleatoria de NºSeguridadSocial
        int nEmpleado[] = {198525, 212314, 314246, 465869, 515125, 625733, 731254, 853536, 967564, 101111, 116478, 127588, 139994, 144242, 151114, 167575, 171115, 185366, 195223, 204678};
        int nSeguridadSocial = (int) (Math.random() * nEmpleado.length);

        // Implementacion Entidad y Variables
        Empleado empleado = new Empleado();
        Scanner sc = new Scanner(System.in);

        // Registro
        System.out.println("Bienvenido, introduzca su nombre");
        empleado.setNombre(sc.next());
        System.out.println("Introduzca su apellido");
        empleado.setApellido(sc.next());
        System.out.println("Introduzca su DNI");
        empleado.setDni(sc.next());
        System.out.println("Introduzca su fecha de nacimiento");
        empleado.setFechaN(sc.next());
        System.out.println("Introduzca su titulacion más alta");
        empleado.setTitulacionAlta(sc.next());
        //Configurar nEmpleado aleatorio
        empleado.setNseguridadS(nSeguridadSocial);
        // ---
        System.out.println("Introduzca su numero de cuenta");
        empleado.setNcuenta(sc.next());

        listaEmpleados.add(empleado);
        System.out.println(empleado.toString());
        return listaEmpleados;
    }


    public List<Empleado> modificarEmpleados(List<Empleado> listaEmpleados) {
        Scanner sc = new Scanner(System.in);
        boolean log = false;
        int inicio;
        // Se define un nuevo empleado pero con todos los campos vacíos, este pasará a tomar todos los valores del que queremos editar

        Empleado empleadoEncontrado = null;


        System.out.println("Bienvenido a modificación");
        System.out.println("Entre con su numero de empleado");
        inicio = sc.nextInt();
        for (Empleado empleado1 : listaEmpleados) {
            if (empleado1.getNseguridadS() == inicio) {
                empleadoEncontrado = empleado1;
                log = true;
                break;
            }
        }
        if (log) {
            boolean seguir = true;

            do {
                System.out.println("Qué desea cambiar?");
                System.out.println("1. Nombre");
                System.out.println("2. Apellido");
                System.out.println("3. DNI");
                System.out.println("4. Fecha Nacimiento");
                System.out.println("5. Titulacion Alta");
                System.out.println("6. Numero de cuenta");
                System.out.println("7. Salir");

                int opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Nuevo nombre");
                            empleadoEncontrado.setNombre(sc.next());
                            break;
                        case 2:
                            System.out.println("Nuevo apellido");
                            empleadoEncontrado.setApellido(sc.next());
                            break;
                        case 3:
                            System.out.println("Nuevo DNI");
                            empleadoEncontrado.setDni(sc.next());
                            break;
                        case 4:
                            System.out.println("Nueva fecha nacimiento");
                            empleadoEncontrado.setFechaN(sc.next());
                            break;
                        case 5:
                            System.out.println("Nueva titulacion más alta");
                            empleadoEncontrado.setTitulacionAlta(sc.next());
                            break;
                        case 6:
                            System.out.println("Nuevo numero de cuenta");
                            empleadoEncontrado.setNcuenta(sc.next());
                            break;
                        case 7 :
                            seguir = false;
                            break;
                        default:
                            System.err.println("Opcion no válida");
                            break;
                }
            }while (seguir);

            System.out.println(empleadoEncontrado.toString());
            listaEmpleados.add(empleadoEncontrado);
        } else {
            System.err.println("Número incorrecto, saliendo.");
        }

        return listaEmpleados;
    }
}
