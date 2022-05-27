package proyecto;

import java.util.Arrays;

public class Mesa {
    private int Numero;
    private boolean Estado;

    
    

    public Mesa(int numero, boolean estado) {
        Numero = numero;
        Estado = estado;
    }




    public int getNumero() {
        return Numero;
    }




    public void setNumero(int numero) {
        Numero = numero;
    }




    public boolean isEstado() {
        return Estado;
    }




    public void setEstado(boolean estado) {
        Estado = estado;
    }




    @Override
    public String toString() {
        return "Mesa\n [Estado=  " + Estado + "\n Numero=  " + Numero + "\n]";
    }

    
    
    
    
    
}
