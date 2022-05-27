package proyecto;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
    private String Nombre;
    private Producto[] Producto;
    private ArrayList<Producto> productos;
    
    public Carta(String nombre, proyecto.Producto[] producto) {
        Nombre = nombre;
        Producto = producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Producto[] getProducto() {
        return Producto;
    }

    public void setProducto(Producto[] producto) {
        Producto = producto;
    }

    @Override
    public String toString() {
        return "Carta [Nombre=" + Nombre + ", Producto=" + Arrays.toString(Producto) + "]";
    }

    public void ModificarNombre(String Nombre) {
        
    }

    public void EliminarCarta() {
        
    }
    
    
}
