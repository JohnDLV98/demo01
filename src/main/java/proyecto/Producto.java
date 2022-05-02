package proyecto;

public class Producto {
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private boolean Disponibilidad;   


    public Producto(String nombre, String descripcion, double precio, boolean disponibilidad) {
        Nombre = nombre;
        Descripcion = descripcion;
        Precio = precio;
        Disponibilidad = disponibilidad;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getDescripcion() {
        return Descripcion;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public double getPrecio() {
        return Precio;
    }


    public void setPrecio(double precio) {
        Precio = precio;
    }


    public boolean getDisponibilidad() {
        return Disponibilidad;
    }


    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }


    @Override
    public String toString() {
        return "Producto [Descripcion=" + Descripcion + ", Disponibilidad=" + Disponibilidad + ", Nombre=" + Nombre
                + ", Precio=" + Precio + "]";
    }

    

    
}
