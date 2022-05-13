/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.LibrosDigitales;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;

/**
 *
 * @author Danie, Elvis, Ronald
 */
public class ControladorLibroDigital {
    private List <LibrosDigitales> lista;
    private int codigo;

    /**
     * ControladorLoro
     * inicializa el codigo y la lista como ArrayList.
     */
    public ControladorLibroDigital() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    public void create(LibrosDigitales librosDigitales){
        librosDigitales.setCodigo(codigo);
        codigo++;
        lista.add(librosDigitales);
    }
     public LibrosDigitales read(int codigo){
        for(LibrosDigitales librosDigitales: lista){
            if(librosDigitales.getCodigo() == codigo){
                return librosDigitales;
            }
        }
        return null;
    }
      public void update(LibrosDigitales librosDigitales){
        for(int i = 0; i < lista.size(); i++){
            LibrosDigitales elemento = lista.get(i);
            if(elemento.getCodigo() == librosDigitales.getCodigo()){
                lista.set(i, librosDigitales);
                break;
            }
        }
    }
      public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            LibrosDigitales librosDigitales = lista.get(i);
            if(librosDigitales.getCodigo() == codigo){
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
