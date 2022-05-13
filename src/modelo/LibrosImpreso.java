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
public class LibrosImpreso extends Libro{
	
	@Override
	public String toString() {
		return "libroFisico [titulo=" + titulo + ", edicion=" + edicion + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}

	@Override
	public double calcularComision() {
		double comision = this.getPrecio()*0.02;
		return comision;
	}

	@Override
	public double calcularVariable() {
		double variable = this.getPrecio()+20;
		return variable;
	}
	
}