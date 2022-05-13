/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import modelo.Clientes;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;

/**
 *
 * @author Daniel, Elvis, Ronald
 */
public class ControladorClientes {
    private List <Clientes> lista;
    private int codigo;

    /**
     * ControladorLoro
     * inicializa el codigo y la lista como ArrayList.
     */
    public ControladorClientes() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    public void create(Clientes clientes){
        clientes.setCodigo(codigo);
        codigo++;
        lista.add(clientes);
    }
     public Clientes read(int codigo){
        for(Clientes clientes: lista){
            if(clientes.getCodigo() == codigo){
                return clientes;
            }
        }
        return null;
    }
      public void update(Clientes clientes){
        for(int i = 0; i < lista.size(); i++){
            Clientes elemento = lista.get(i);
            if(elemento.getCodigo() == clientes.getCodigo()){
                lista.set(i, clientes);
                break;
            }
        }
    }
      public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Clientes clientes = lista.get(i);
            if(clientes.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
       public void imprimir(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }
    }
   
}
