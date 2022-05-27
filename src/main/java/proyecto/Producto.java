package proyecto;

public class Producto {
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private boolean Disponibilidad;   

    

    public Producto() {
    }


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
        return "Producto \n{" 
        + "\n\tNombre: " + Nombre 
        + "\n\tDescripcion: " + Descripcion 
        + "\n\tPrecio: " + Precio 
        + "\n\tDisponibilidad: " + Disponibilidad + "\n}";
    }

    public static void ModificarProducto(String Nombre, String Descripcion, double Precio, boolean Disponibilidad) {
        
    }

    public static void EliminarProducto() {
        
    }

    
}
