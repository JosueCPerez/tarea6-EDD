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
public class nodo {
    int codigo;
    int stock;
    int stock_min;
    String cod_prov;
    nodo siguiente;
    
    nodo(int cod,int st, int st_min, String cod_p){
      this.codigo = cod;
      this.stock = st;
      this.stock_min = st_min;
      this.cod_prov = cod_p;
      this.siguiente = null;
    }
}
