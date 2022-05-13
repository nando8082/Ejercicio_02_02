/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import modelo.LibrosImpreso;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;

/**
 *
 * @author Daniel, Elvis, Ronald
 */
public class ControladorLibroImpreso {
        private List <LibrosImpreso> lista;
    private int codigo;

    /**
     * ControladorLoro
     * inicializa el codigo y la lista como ArrayList.
     */
    public ControladorLibroImpreso() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    /**/
    public void create(LibrosImpreso librosImpreso){
        librosImpreso.setCodigo(codigo);
        codigo++;
        lista.add(librosImpreso);
    }
    
     public LibrosImpreso read(int codigo){
        for(LibrosImpreso librosImpreso: lista){
            if(librosImpreso.getCodigo() == codigo){
                return librosImpreso;
            }
        }
        return null;
    }
      public void update(LibrosImpreso librosImpreso){
        for(int i = 0; i < lista.size(); i++){
            LibrosImpreso elemento = lista.get(i);
            if(elemento.getCodigo() == librosImpreso.getCodigo()){
                lista.set(i, librosImpreso);
                break;
            }
        }
    }
      public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            LibrosImpreso librosImpreso = lista.get(i);
            if(librosImpreso.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
       public void imprimir(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getTitulo());
        }
    }
    
}
