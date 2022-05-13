/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel, Elvis, Ronald
 */
public class LibrosImpreso extends Libros{
    
    private Double precio;
    private Double precioTotal;
    private Double comision;
    private Double costoEnvio=20.0;

    public LibrosImpreso() {
    }

    public LibrosImpreso(Double precio, int codigo, String titulo, String autor, String edicion) {
        super(codigo, titulo, autor, edicion);
        this.precio = precio;
        
    }


    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(Double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public Double getPrecioTotal() {
        CalcularComision();
        CalcularPrecioFinal();
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
    

    @Override
    public String toString() {
        return "LibrosImpreso{" + "precio=" + precio + ", comision=" + comision + ", costoEnvio=" + costoEnvio + '}';
    }

        
    @Override
    public void CalcularPrecioFijo() {
        
        
    }

    @Override
    public void CalcularComision() {
        this.comision=getPrecio()*0.02;
        
    }
    public  void CalcularPrecioFinal(){  
        this.precioTotal=this.comision+getPrecio()+this.costoEnvio;
    } 

}
