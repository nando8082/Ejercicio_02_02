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

public class LibrosDigitales extends Libro {
	
	@Override
	public String toString() {
		return "libroDigital [titulo=" + titulo + ", edicion=" + edicion + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}

	@Override
	public double calcularComision() {
		double comision = this.getPrecio()*0.12;
		System.out.println(comision);
		return comision;
	}

	@Override
	public double calcularVariable() {
		double variable = this.getPrecio();
		System.out.println(variable);
		return variable;
	}
	
}
