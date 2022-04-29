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

    public String getNombre(){
        return Nombre;
    }    
    public void setNombre(String nombre){
        Nombre = nombre;
    }


    public String getDescripcion(){
        return Descripcion;
    }
    public void setSDescripcion(String descripcion){
        Descripcion = descripcion;
    } 
    
    
    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double precio){
        Precio = precio;
    }

    
}
