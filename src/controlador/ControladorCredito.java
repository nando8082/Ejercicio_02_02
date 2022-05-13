/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel, Elvis, Ronald
 */
public class ControladorCredito {
    
    private List <Credito> lista;
    private int codigo;
/*
    *********************
    */
    /**
     * ControladorLoro
     * inicializa el codigo y la lista como ArrayList.
     */
    public ControladorCredito() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    public void create(Credito credito){
        credito.setCodigo(codigo);
        codigo++;
        lista.add(credito);
    }
     public Credito read(int codigo){
        for(Credito credito: lista){
            if(credito.getCodigo() == codigo){
                return credito;
            }
        }
        return null;
    }
      public void update(Credito credito){
        for(int i = 0; i < lista.size(); i++){
            Credito elemento = lista.get(i);
            if(elemento.getCodigo() == credito.getCodigo()){
                lista.set(i, credito);
                break;
            }
        }
    }
      public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Credito credito = lista.get(i);
            if(credito.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
       public void imprimir(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getSaldo());
        }
    }
   
    
}
