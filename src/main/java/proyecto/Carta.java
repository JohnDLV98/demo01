package proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carta {
    private String Nombre;    
    private ArrayList<Producto> ProductoCarta;  
    

   

    public Carta(String nombre, List<Producto> ProductoCarta) {
        Nombre = nombre;
        this.ProductoCarta = (ArrayList<Producto>) ProductoCarta;
    }

    public Carta(){

    }


    
    

    public String getNombre() {
        return Nombre;
    }



    public void setNombre(String nombre) {
        Nombre = nombre;
    }



    public ArrayList<Producto> getProducto() {
        return ProductoCarta;
    }



    public void setProducto(ArrayList<Producto> producto) {
        this.ProductoCarta = producto;
    }


    

    @Override
    public String toString() {
        return "Carta \n{" 
        + "\n\tNombre: " + Nombre 
        + "\n\tProductos: " + ProductoCarta + "\n}";
    }

    public void ModificarNombre(String Nombre) {
        
    }

    public void EliminarCarta() {
        
    }


    
    
    
}
