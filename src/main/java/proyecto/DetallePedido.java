package proyecto;

public class DetallePedido {
    private String Especificacion;
    private int Cantidad;
    private Producto Producto;

    
    public DetallePedido(String especificacion, int cantidad, proyecto.Producto producto) {
        Especificacion = especificacion;
        Cantidad = cantidad;
        Producto = producto;
    }


    public String getEspecificacion() {
        return Especificacion;
    }


    public void setEspecificacion(String especificacion) {
        Especificacion = especificacion;
    }


    public int getCantidad() {
        return Cantidad;
    }


    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }


    public Producto getProducto() {
        return Producto;
    }


    public void setProducto(Producto producto) {
        Producto = producto;
    }


    @Override
    public String toString() {
        return "DetallePedido [Cantidad=" + Cantidad + ", Especificacion=" + Especificacion + ", Producto=" + Producto
                + "]";
    }

    

}
