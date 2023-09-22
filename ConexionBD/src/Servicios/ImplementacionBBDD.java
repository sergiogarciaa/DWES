package Servicios;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ImplementacionBBDD implements InterfazBBDD{

    @Override
    public Connection llamadaBBDD() {
        Properties datosBBDD = new Properties();
        Connection conex = null;
        // Carga el controlador JDBC de PostgreSQL

        try {
            Class.forName("org.postgresql.Driver");

            datosBBDD.load(new FileInputStream("C:\\Users\\Puesto14\\Desktop\\DWES\\ConexionBD\\src\\Servicios\\datos.properties"));
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            conex = DriverManager.getConnection(datosBBDD.getProperty("BBDD"), datosBBDD.getProperty("User"), datosBBDD.getProperty("Pass"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conex;
    }
}
