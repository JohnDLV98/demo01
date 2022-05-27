package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */

public class Main{

    static Scanner in = new Scanner(System.in);
    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        
        
        
        List<Producto> products = new ArrayList<Producto>();        
        List<Producto> comidaRapida = new ArrayList<Producto>();
        List<Producto> arroz = new ArrayList<Producto>();
        List<Producto> almuerzo = new ArrayList<Producto>();
        List<Carta> carta = new ArrayList<Carta>();
        String x;
       

      
            do{
                Scanner in = new Scanner(System.in);
                Scanner solox = new Scanner(System.in);
                Scanner solog = new Scanner(System.in);
            System.out.println("Ingrese Nombre del producto :");
            String nom = in.nextLine();

            System.out.println("Ingrese Descripción del producto :");
            String des = in.nextLine();
            
            System.out.println("Ingrese Precio del producto :");
            double prec = in.nextDouble();
            
            System.out.println("En que carta desea guardar el producto?\n");
            System.out.print(
                        "\nCartas\n"
                        + "0 - Comidas Rapidas\n"
                        + "1 - Almuerzos\n"
                        + "2 - Arroces\n"
                        + "Seleccione una opción >> "
                );
            String caso = in.next();    

                switch(caso){
                    case "0":
                        comidaRapida.add(new Producto(nom, des, prec, true));
                        carta.add(new Carta("Comida Rapida", comidaRapida));
                        break;
                    case "1":
                        almuerzo.add(new Producto(nom, des, prec, true));
                        carta.add(new Carta("Almuerzo", almuerzo));
                        break;
                    case "2":
                        arroz.add(new Producto(nom, des, prec, true));    
                        carta.add(new Carta("Arroces", arroz));
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            
            System.out.println("Desea agregar mas Productos ? \n Escriba si o no, en minuscula" );
            
            x = solox.nextLine();
                         
            }while(x.equals("si"));
       
            
            System.out.println(carta.toString());
            
            // System.out.println(products.toString());  
        

        
        
            
        

    }
}
