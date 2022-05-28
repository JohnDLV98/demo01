package proyecto;

public class Persona {
    protected String Nombre;
    protected String Apellido;
    protected int Identificacion;
    protected int Telefono;
    
    public Persona(String nombre, String apellido, int identificacion, int telefono) {
        Nombre = nombre;
        Apellido = apellido;
        Identificacion = identificacion;
        Telefono = telefono;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [Apellido=" + Apellido + ", Identificacion=" + Identificacion + ", Nombre=" + Nombre
                + ", Telefono=" + Telefono + "]";
    }

    
}
