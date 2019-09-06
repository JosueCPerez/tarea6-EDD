/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Tarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Josue Perez");
        System.out.println("201403546 \n \n");
        System.out.println("---------tarea #6-------");
        
        
        lista lista_productos = new lista();
        lista lista_sinStock = null;
        
        int op=0;
        
        while(op != 6){
             System.out.println("*** MENU ***");
            System.out.println("1. insertar producto");
            System.out.println("2. crear lista de productos sin stock minimo");
            System.out.println("3. mostrar lista principal de productos");
            System.out.println("4. mostrar lista productos sin stock minimo");
            System.out.println("5. eliminar productos con codigo mayor a 100");
            System.out.println("6. salir");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            entradaTeclado = entradaEscaner.nextLine ();
            op = Integer.parseInt(entradaTeclado);
            
                switch (op) {

                    case 1:
                        int codigo=0;
                        int stock=0;
                        int stock_min=0;
                        String cod_prov;
                        
                       System.out.println("----------- insertar nuevo producto ------------");
                       System.out.println("inserte el codigo del producto");
                            entradaEscaner = new Scanner (System.in); 
                            entradaTeclado = entradaEscaner.nextLine ();
                             codigo = Integer.parseInt(entradaTeclado);
                       System.out.println("inserte la cantida en stock");
                            entradaEscaner = new Scanner (System.in); 
                            entradaTeclado = entradaEscaner.nextLine ();
                             stock = Integer.parseInt(entradaTeclado);
                       System.out.println("inserte la cantida minima que debe haber en stock");
                            entradaEscaner = new Scanner (System.in); 
                            entradaTeclado = entradaEscaner.nextLine ();
                            stock_min = Integer.parseInt(entradaTeclado);
                       System.out.println("inserte el codigo del proveedor");
                            entradaEscaner = new Scanner (System.in); 
                            cod_prov = entradaEscaner.nextLine ();
                            
                        nodo nuevo = new nodo(codigo, stock, stock_min, cod_prov);
                        lista_productos.insertar(nuevo);
                    break;
                    
                    case 2:
                        lista_sinStock = lista_productos.copiar();
                    break;
                    
                    case 3:
                        lista_productos.mostrar();
                    break;
                    
                    case 4:
                        if(lista_sinStock == null){
                            System.out.println("no se ha creado la lista de productos sin stock minimo \n");
                        }else{
                            lista_sinStock.mostrar();
                        }
                    break;
                    
                    case 5:
                        lista_productos.eliminar_mayor100();
                    break;

                    default:
                    break;
                }
        }
        
        
    }
    
}
