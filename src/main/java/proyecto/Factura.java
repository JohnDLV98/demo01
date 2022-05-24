package proyecto;

import java.util.Calendar;

public class Factura {
    private Calendar Fecha;
    private String ModoPago;
    private int IdFactura;
    private Pedido Pedido;
    private Persona Cliente;
    private Persona AdminAprobacion;

    
   


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
        return IdFactura;
    }


    public void setIdFactura(int idFactura) {
        this.IdFactura = idFactura;
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
                + ", ModoPago=" + ModoPago + ", Pedido=" + Pedido + ", idFactura=" + IdFactura + "]";
    }
    

    public void GenerarInformacion(Calendar fecha, String ModoPago, int IdFactura, proyecto.Pedido pedido, Persona cliente,
    Persona adminAprobacion){

    }
    
    public boolean RealizarPago(String ModoPago, proyecto.Pedido pedido){
        
        
        return true;
    }

    public void ObtenerInfoPago(){

    }

    public boolean AplicarDescuentoCliente(Persona Cliente){

        return false;
    }

    public void AcumulardorCompraDia(){

    }

    public void ReiniciarFactura(){

    }

    public double TotalAPagarAcumualdor(int IdFactura, Pedido pedido){
        double a=1;
        return a;
    }

    public void AprobacionAdmin(){
        
    }
}
