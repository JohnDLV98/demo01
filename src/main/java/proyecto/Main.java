package proyecto;

import java.util.ArrayList;
import java.util.Calendar;
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
              
        ArrayList<Producto> comidaRapida = new ArrayList<Producto>();
        ArrayList<Producto> arroz = new ArrayList<Producto>();
        ArrayList<Producto> almuerzo = new ArrayList<Producto>();
        ArrayList<Carta> carta = new ArrayList<Carta>();
        String x;        
        ArrayList<Mesa> mesaCant = new ArrayList<Mesa>();
                
                System.out.println("Cuantas mesas hay en su negocio? ");
                int n = in.nextInt();

                for (int i = 0; i < n; i++) {
                    
                    mesaCant.add(new Mesa(i+1, true));
                    
                }
                        
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
            



                ArrayList<DetallePedido> AcumProducto = new ArrayList<DetallePedido>();
                String ped;
                String codOrder;
                String salir;
                do{
                    Scanner in = new Scanner(System.in);
                    System.out.println("De cual carta desea el producto para su Pedido?");
                    System.out.print(
                                "\nCartas\n"
                                + "0 - Comidas Rapidas\n"
                                + "1 - Almuerzos\n"
                                + "2 - Arroces\n"                                
                                + "Seleccione una opción >> "
                        );
                    ped = in.nextLine();

                    System.out.println("Estos son los productos:\n");
                    switch(ped){
                        case "0":
                            System.out.println("Comida Rapida\n");
                            System.out.println(comidaRapida);
                            System.out.println("Escriba el codigo del producto que desea ordenar: \n");
                            codOrder = in.next();    
                            
                            for (Producto productoCr : comidaRapida) {
                                if(productoCr.getIdProducto().equals(codOrder)){

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
                                if(productoCr.getIdProducto().equals(codOrder)){

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
                            codOrder = in.nextLine();    
                            
                            for (Producto productoCr : arroz) {
                                if(productoCr.getIdProducto().equals(codOrder)){

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

                            System.out.println("Desea Pedir Otro Producto ? \n Escriba si o no en minusculas \n");
                            salir = in.next();
                }while(salir.equals("si"));


                    Pedido prod = new Pedido();
                    String sal;
                    int mes;

                    do{
                        Scanner m = new Scanner(System.in);
                    System.out.println();
                    System.out.println("Escriba el Numero de la Mesa donde se lleva el pedido ?  hay un total de " + mesaCant.size() + " Mesas.");
                    
                    mes = m.nextInt();                   
                    
                        for (Mesa mesa : mesaCant) {
                            if(mesa.getNumero()==mes){
                                if(mesa.isEstado()==true){
                                prod = new Pedido(mesa, AcumProducto);
                                System.out.println("MESA Disponible");
                                }                               
                            }

                        }
                    

                        System.out.println("Ya encontró mesa ? escriba si o no");
                        sal = in.next();
                    }while(sal.equals("no"));                  
                    

                 

                    System.out.println("Ingrese nombre cliente :");
                String nom = in.next(); 

                System.out.println("Ingrese Apellido del cliente :");
                String apell = in.next();

                System.out.println("Ingrese Identificacion del cliente :");
                int id = in.nextInt();
                
                System.out.println("Ingrese Telefono del cliente :");
                int tel = in.nextInt();
                
                Cliente cl1= new Cliente(nom, apell, id, tel, 0);
                Admin adm1= new Admin("Angie", "Lapeira", 12324354, 893847, "usuario", 123456);
                
                Calendar today = Calendar.getInstance();
                System.out.println("Today is " + today.getTime());

                Factura fac1= new Factura("Efectivo", 345665, prod, cl1, adm1);

                System.out.println(fac1);
                               



    }
}
