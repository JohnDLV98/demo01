package proyecto;

import java.util.Calendar;

public class Factura {
    private Calendar Fecha;
    private String ModoPago;
    private int idFactura;
    private Pedido Pedido;
    private Persona Cliente;
    private Persona AdminAprobacion;


    public Factura(Calendar fecha, String modoPago, int idFactura, proyecto.Pedido pedido, Persona cliente,
            Persona adminAprobacion) {
        Fecha = fecha;
        ModoPago = modoPago;
        this.idFactura = idFactura;
        Pedido = pedido;
        Cliente = cliente;
        AdminAprobacion = adminAprobacion;
    }


    public Calendar getFecha() {
        return Fecha;
    }


    public void setFecha(Calendar fecha) {
        Fecha = fecha;
    }


    public String getModoPago() {
        return ModoPago;
    }


    public void setModoPago(String modoPago) {
        ModoPago = modoPago;
    }


    public int getIdFactura() {
        return idFactura;
    }


    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }


    public Pedido getPedido() {
        return Pedido;
    }


    public void setPedido(Pedido pedido) {
        Pedido = pedido;
    }


    public Persona getCliente() {
        return Cliente;
    }


    public void setCliente(Persona cliente) {
        Cliente = cliente;
    }


    public Persona getAdminAprobacion() {
        return AdminAprobacion;
    }


    public void setAdminAprobacion(Persona adminAprobacion) {
        AdminAprobacion = adminAprobacion;
    }


    @Override
    public String toString() {
        return "Factura [AdminAprobacion=" + AdminAprobacion + ", Cliente=" + Cliente + ", Fecha=" + Fecha
                + ", ModoPago=" + ModoPago + ", Pedido=" + Pedido + ", idFactura=" + idFactura + "]";
    }
    

    
    
}
