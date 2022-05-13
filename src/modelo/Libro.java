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

public abstract class Libro{
	
	public String titulo;
	public int edicion;
	public String autor;
	public double precio;

	public Libro() {

	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract double calcularComision();
	public abstract double calcularVariable();
	
	public void calcularPrecio() {
		double total = calcularComision() + calcularVariable();
		System.out.println("El valor final del libro es: "+total);
	}

}