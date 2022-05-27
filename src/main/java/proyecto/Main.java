package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */

public class Main{

    
    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        
        
        
        List<Producto> products = new ArrayList<Producto>();
        List<Carta> carta = new ArrayList<Carta>();
        String x;
       

      
            do{
                Scanner in = new Scanner(System.in);
                Scanner solox = new Scanner(System.in);
            System.out.println("Ingrese Nombre del producto :");
            String nom = in.nextLine();

            System.out.println("Ingrese Descripción del producto :");
            String des = in.nextLine();
            
            System.out.println("Ingrese Precio del producto :");
            double prec = in.nextDouble();

            products.add(new Producto(nom, des, prec, true));
            
            System.out.println("Desea agregar mas Productos ? \n Escriba si o no, en minuscula" );
            
            x = solox.nextLine();
                         
            }while(x.equals("si"));
       

            
            System.out.println(products.toString());  
        

        
        
        

    }
}
