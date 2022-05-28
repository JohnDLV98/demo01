package proyecto;

public class Admin extends Persona{
    private String Usuario;
    private int Clave;
    
    public Admin(String nombre, String apellido, int identificacion, int telefono, String usuario, int clave) {
        super(nombre, apellido, identificacion, telefono);
        Usuario = usuario;
        Clave = clave;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int clave) {
        Clave = clave;
    }

   

    

}
