package proyecto;

import java.util.Arrays;

public class Pedido {
    private Mesa Mesa;
    private DetallePedido PeditoTotal[];

    
    public Pedido(proyecto.Mesa mesa, DetallePedido[] peditoTotal) {
        Mesa = mesa;
        PeditoTotal = peditoTotal;
    }


    public Mesa getMesa() {
        return Mesa;
    }


    public void setMesa(Mesa mesa) {
        Mesa = mesa;
    }


    public DetallePedido[] getPeditoTotal() {
        return PeditoTotal;
    }


    public void setPeditoTotal(DetallePedido[] peditoTotal) {
        PeditoTotal = peditoTotal;
    }


    @Override
    public String toString() {
        return "Pedido [Mesa=" + Mesa + ", PeditoTotal=" + Arrays.toString(PeditoTotal) + "]";
    }

    
}
