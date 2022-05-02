package proyecto;

import java.util.Arrays;

public class Mesa {
    private String Nombre;
    private Producto[] Producto;

    
    public Mesa(String nombre, proyecto.Producto[] producto) {
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
        return "Mesa [Nombre=" + Nombre + ", Producto=" + Arrays.toString(Producto) + "]";
    }

    
    
}
