/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

/**
 *
 * @author Josue
 */
public class lista {
    
    nodo primero;
    
    lista(){
        this.primero = null;
    }

    public void insertar(nodo nuevo){
        if(this.primero == null){
            this.primero = nuevo;
        }else{
            nodo temp= this.primero;
            nodo temp2= this.primero;
            
            while(temp != null){
                if(nuevo.codigo < temp.codigo){
                    if(temp == this.primero){
                        nuevo.siguiente = this.primero;
                        this.primero = nuevo;
                        break;
                    }else{
                        temp2.siguiente = nuevo;
                        nuevo.siguiente = temp;
                        break;
                    }
                }else if(nuevo.codigo == temp.codigo){
                    System.out.println("ya existe un articulo con ese codigo en la lista \n");
                    break;
                }else{
                    if(temp.siguiente == null){ // insertar de ultimo
                        temp.siguiente = nuevo;
                        break;
                    }
                    temp2 = temp;
                    temp = temp.siguiente;
                }
                
            }
        }
    }
    
    
    void mostrar(){
        if(this.primero != null){
            nodo temp = this.primero;
            while(temp != null){
                System.out.println("->producto: "+temp.codigo+", cantidad:"+temp.stock);
                temp = temp.siguiente;
            }
        }else{
            System.out.println("NO HAY DATOS EN LA LISTA \n");
        }
    }
    
    public lista copiar(){
        lista lista_nueva = new lista();
        nodo temp = this.primero;
        
        while(temp != null){
            if(temp.stock < temp.stock_min){
                nodo nuevo = new nodo(temp.codigo, temp.stock,temp.stock_min,temp.cod_prov);
                lista_nueva.insertar(nuevo);
            }
                temp = temp.siguiente;
        }
        
        return lista_nueva;
    }
    
    public void eliminar_mayor100(){
        nodo temp = this.primero;
        nodo temp2 = this.primero;
        
        while(temp != null){
            if(temp.codigo > 100){
                if(temp == this.primero){
                    this.primero = temp.siguiente;
                    temp.siguiente = null;
                }else{
                    temp2.siguiente = temp.siguiente;
                    temp.siguiente = null;
                }
            }
            
            temp2 = temp;
            temp =temp.siguiente;
        }
    }
}
