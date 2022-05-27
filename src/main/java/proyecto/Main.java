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
        
        in = new Scanner(System.in);
              
        List<Producto> comidaRapida = new ArrayList<Producto>();
        List<Producto> arroz = new ArrayList<Producto>();
        List<Producto> almuerzo = new ArrayList<Producto>();
        List<Carta> carta = new ArrayList<Carta>();
        String x;
       

      
                do{
                    Scanner in = new Scanner(System.in);
                    Scanner solox = new Scanner(System.in);
                    Scanner solog = new Scanner(System.in);
                System.out.println("Ingrese codigo del producto :");
                String cod = in.nextLine(); 

                System.out.println("Ingrese Nombre del producto :");
                String nom = in.nextLine();

                System.out.println("Ingrese Descripción del producto :");
                String des = in.nextLine();
                
                System.out.println("Ingrese Precio del producto :");
                double prec = in.nextDouble();
                
                System.out.println("En que carta desea guardar el producto?");
                System.out.print(
                            "\nCartas\n"
                            + "0 - Comidas Rapidas\n"
                            + "1 - Almuerzos\n"
                            + "2 - Arroces\n"
                            + "Seleccione una opción >> "
                    );
                String caso = solog.next();    

                    switch(caso){
                        case "0":                            
                            comidaRapida.add(new Producto(cod, nom, des, prec, true));
                            carta.add(new Carta("Comida Rapida", comidaRapida));                            
                            break;
                        case "1":
                            almuerzo.add(new Producto(cod, nom, des, prec, true));
                            carta.add(new Carta("Almuerzo", almuerzo));
                            break;
                        case "2":
                            arroz.add(new Producto(cod, nom, des, prec, true));    
                            carta.add(new Carta("Arroces", arroz));
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                
                System.out.println("Desea agregar mas Productos ? \n Escriba si o no, en minuscula" );
                
                x = solox.nextLine();
                            
                }while(x.equals("si"));
            



                List<DetallePedido> AcumProducto = new ArrayList<DetallePedido>();
                String ped;
                String codOrder;
                do{
                    System.out.println("De cual carta desea el producto para su Pedido?");
                    System.out.print(
                                "\nCartas\n"
                                + "0 - Comidas Rapidas\n"
                                + "1 - Almuerzos\n"
                                + "2 - Arroces\n"
                                + "999 - Salir\n"
                                + "Seleccione una opción >> "
                        );
                    ped = in.next();

                    System.out.println("Estos son los productos:\n");
                    switch(ped){
                        case "0":
                            System.out.println("Comida Rapida\n");
                            System.out.println(comidaRapida);
                            System.out.println("Escriba el codigo del producto que desea ordenar: \n");
                            codOrder = in.next();    
                            
                            for (Producto productoCr : comidaRapida) {
                                if(productoCr.getNombre()==codOrder){

                                    System.out.println("Ingrese Cantidad que desea :");
                                        int cant = in.nextInt();

                                    System.out.println("Ingrese Especificaciones del producto :");
                                        String esp = in.next();
                                    
                                    AcumProducto.add(new DetallePedido(esp, cant, productoCr));
                                }
                                else{
                                    System.out.println("NO EXISTE NINGUN PRODUCTO CON ÉSTE CÓDIGO...");
                                }
                            }

                            break;
                        case "1":
                            System.out.println("Almuerzos\n");
                            System.out.println(almuerzo);

                            System.out.println("Escriba el codigo del producto que desea ordenar: \n");
                            codOrder = in.next();    
                            
                            for (Producto productoCr : almuerzo) {
                                if(productoCr.getNombre()==codOrder){

                                    System.out.println("Ingrese Cantidad que desea :");
                                        int cant = in.nextInt();

                                    System.out.println("Ingrese Especificaciones del producto :");
                                        String esp = in.next();
                                    
                                    AcumProducto.add(new DetallePedido(esp, cant, productoCr));
                                }
                                else{
                                    System.out.println("NO EXISTE NINGUN PRODUCTO CON ÉSTE CÓDIGO...");
                                }
                            }
                            break;
                        case "2":
                            System.out.println("Arroces\n");
                            System.out.println(arroz);

                            System.out.println("Escriba el codigo del producto que desea ordenar: \n");
                            codOrder = in.next();    
                            
                            for (Producto productoCr : arroz) {
                                if(productoCr.getNombre()==codOrder){

                                    System.out.println("Ingrese Cantidad que desea :");
                                        int cant = in.nextInt();

                                    System.out.println("Ingrese Especificaciones del producto :");
                                        String esp = in.next();
                                    
                                    AcumProducto.add(new DetallePedido(esp, cant, productoCr));
                                }
                                else{
                                    System.out.println("NO EXISTE NINGUN PRODUCTO CON ÉSTE CÓDIGO...");
                                }
                            }
                            break;                            
                        default:
                            System.out.println("Opción inválida");
                    }                
                }while(ped.equals("999"));
            
        

        
        
            
        

    }
}
