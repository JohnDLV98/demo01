package proyecto;

import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
    private Mesa Mesa;
    private ArrayList<DetallePedido> PedidoTotal;    
    

    public Pedido(proyecto.Mesa mesa, ArrayList<DetallePedido> pedidoTotal) {
        Mesa = mesa;
        PedidoTotal = pedidoTotal;
    }

    

    public Pedido() {
    }



    public Mesa getMesa() {
        return Mesa;
    }



    public void setMesa(Mesa mesa) {
        Mesa = mesa;
    }



    public ArrayList<DetallePedido> getPedidoTotal() {
        return PedidoTotal;
    }



    public void setPedidoTotal(ArrayList<DetallePedido> pedidoTotal) {
        PedidoTotal = pedidoTotal;
    }

    

    @Override
    public String toString() {
        return "Pedido [Mesa=" + Mesa + ", PedidoTotal=" + PedidoTotal + "]";
    }



    public void ModificarPedido(Mesa mesa, DetallePedido[] PedidoTotal){

    }

    public void ReiniciarMesa(Mesa mesa, DetallePedido[] PedidoTotal){

    }
}
