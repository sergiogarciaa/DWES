package Controladores;

import Servicios.ImplementacionBBDD;
import Servicios.ImplementacionMenu;
import Servicios.InterfazBBDD;
import Servicios.InterfazMenu;

import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfazMenu menu = new ImplementacionMenu();
        InterfazBBDD BBDD = new ImplementacionBBDD();

        Scanner entradaOpcion = new Scanner(System.in);
        Boolean cerrarMenu = false;
        int opcion;

        //  Menu


        while (!cerrarMenu) {
            //Mostramos el menú
            menu.mostrarMenu();
            System.out.println("Introduza la opción deseada: ");
            opcion = entradaOpcion.nextInt();
            System.out.println("[INFO] - Has seleccionado la opcion " + opcion);

            switch (opcion) {
                case 0:
                    cerrarMenu = true;
                    break;
                case 1:
                    BBDD.llamadaBBDD();
                    break;
            }
        }
    }
}
