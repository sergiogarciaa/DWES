package Entidades;

public class Empleado {

    public Empleado(String nombre, String apellido, String DNI, String fechaN, String titulacionAlta, int NseguridadS, String Ncuenta) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        dni = DNI;
        this.fechaN = fechaN;
        this.titulacionAlta = titulacionAlta;
        nseguridadS = NseguridadS;
        ncuenta = Ncuenta;
    }
    public Empleado() {
    }

    private String nombre;
    private String apellido;
    private String dni;
    private String fechaN;
    private String titulacionAlta;
    private int nseguridadS;

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getTitulacionAlta() {
        return titulacionAlta;
    }

    public void setTitulacionAlta(String titulacionAlta) {
        this.titulacionAlta = titulacionAlta;
    }

    public int getNseguridadS() {
        return nseguridadS;
    }

    public void setNseguridadS(int nseguridadS) {
        this.nseguridadS = nseguridadS;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    private String ncuenta;

    // FIN GETTER Y SETTERS -

    //Sobre escritura toString
    @Override
    public String toString() {
        return "Nombre: " + nombre  + " | Apellido: " + apellido + " | DNI: " + dni + " | Fecha Nacimiento: " + fechaN + " | Titulacion más Alta " + titulacionAlta + " | Numero SC " + nseguridadS + " | Numero de cuenta " + ncuenta;
    }
}
