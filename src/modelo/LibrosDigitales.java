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
public class LibrosDigitales extends Libros{
   
    private Double precio;
    private Double precioTotal;
    private Double comision;

    public LibrosDigitales(Double precio, int codigo, String titulo, String autor, String edicion) {
        super(codigo, titulo, autor, edicion);
        this.precio = precio;
        this.comision = comision;
    }
    

    public LibrosDigitales() {
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
        return "LibrosDigitales{" + "precio=" + precio + ", comision=" + comision + '}';
    }

    @Override
    public void CalcularPrecioFijo() {
    }

    @Override
    public void CalcularComision() {
        this.comision=getPrecio()*0.01;
    }
    public  void CalcularPrecioFinal(){  
        this.precioTotal=getPrecio()+getComision();
    } 
}
