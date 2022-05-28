package proyecto;

import java.util.Calendar;

public class Factura {
    private Calendar Fecha;
    private String ModoPago;
    private int IdFactura;
    private Pedido Pedido;
    private Cliente Cliente;
    private Admin AdminAprobacion;

    
   


    public Factura(String modoPago, int idFactura, proyecto.Pedido pedido, proyecto.Cliente cliente,
            Admin adminAprobacion) {
    
        ModoPago = modoPago;
        IdFactura = idFactura;
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
        return IdFactura;
    }






    public void setIdFactura(int idFactura) {
        IdFactura = idFactura;
    }






    public Pedido getPedido() {
        return Pedido;
    }






    public void setPedido(Pedido pedido) {
        Pedido = pedido;
    }






    public Cliente getCliente() {
        return Cliente;
    }






    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }






    public Admin getAdminAprobacion() {
        return AdminAprobacion;
    }






    public void setAdminAprobacion(Admin adminAprobacion) {
        AdminAprobacion = adminAprobacion;
    }


    



    

    @Override
    public String toString() {
        return "Factura \n{"
        + "\n\tID FACTURA: " + IdFactura         
        + "\n\tCliente: " + Cliente
        + "\n\tModo Pago: " + ModoPago
        + "\n\tPedido del Cliente: " + Pedido
        + "\n\tAdminitrador: " + AdminAprobacion.getNombre()+ " " + AdminAprobacion.getApellido() + "\n}";
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
