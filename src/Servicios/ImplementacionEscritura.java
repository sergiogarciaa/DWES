package Servicios;

import Entidades.Empleado;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ImplementacionEscritura implements InterfazEscritura{

    public void Escritura(List<Empleado> listaEmpleado) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        boolean uno = false;

        // Un usuario solamente o todos
        Empleado empleadoEncontrado = null;

        System.out.println("Bienvenido a modificación");
        System.out.println("Si solo desea imprimir un empleado entre con su Numero de Empleado, si desea todos pulse Intro");
        int respuesta = sc.nextInt();
        for (Empleado empleado1 : listaEmpleado) {
            if (empleado1.getNseguridadS() == respuesta) {
                empleadoEncontrado = empleado1;
                uno = true;
                break;
            }
        }

        // Solo un usuario
        if(uno) {
            try {
                fichero = new FileWriter("C:\\Users\\Puesto14\\Desktop\\fichero.txt");
                pw = new PrintWriter(fichero);
                pw.println(empleadoEncontrado.getNombre() + empleadoEncontrado.getApellido() + empleadoEncontrado.getDni() + empleadoEncontrado.getFechaN() + empleadoEncontrado.getTitulacionAlta());
            } catch (IOException ioe) {
                System.out.print("[ERROR] - FICHERO NO ENCONTRADO: " + fichero + "\n" + ioe);
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (IOException ioe2) {
                    System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
                }
            }
        }
        // Todos los usuarios
        else {
            try {
                fichero = new FileWriter("C:\\Users\\Puesto14\\Desktop\\fichero.txt");
                pw = new PrintWriter(fichero);
                for (Empleado em : listaEmpleado) {
                    pw.println(em.getNombre() + em.getApellido() + em.getDni() + em.getFechaN() + em.getTitulacionAlta());
                }
            } catch (IOException ioe) {
                System.out.print("[ERROR] - FICHERO NO ENCONTRADO: " + fichero + "\n" + ioe);
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (IOException ioe2) {
                    System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
                }
            }
        }
    }
}
