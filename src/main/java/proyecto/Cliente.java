package proyecto;

public class Cliente extends Persona{
    private double AcumuladorCompra;

    public Cliente(String nombre, String apellido, int identificacion, int telefono, double acumuladorCompra) {
        super(nombre, apellido, identificacion, telefono);
        AcumuladorCompra = acumuladorCompra;
    }
    

    public double getAcumuladorCompra() {
        return AcumuladorCompra;
    }

    public void setAcumuladorCompra(double acumuladorCompra) {
        AcumuladorCompra = acumuladorCompra;
    }

    @Override
    public String toString() {
        return "Cliente [AcumuladorCompra=" + AcumuladorCompra + "]";
    }

    public void ContadorCompra(){

    }

    public void ModificarCliente(String nombre){

    }
        
}
