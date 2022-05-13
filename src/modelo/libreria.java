/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.LibrosDigitales;
import modelo.LibrosImpreso;
import java.util.Scanner;

/**
 *
 * @author Daniel, Elvis, Ronald
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class libreria {
	
	public void menu() {
		
		List<Libro> ListaLibros = new ArrayList<Libro>();
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		do{
		System.out.println("*********** MENÜ ***********");
		System.out.println("1. Agregar Libro");
		System.out.println("2. Eliminar Libro");
		System.out.println("3. Listar Libro");
		System.out.println("4. Salir");
		op = teclado.nextInt();
		switch(op) {
			case 1:
				System.out.println("Escoja 1. Digital o 2. Físico");
				int op2 = teclado.nextInt();
				switch(op2) {
					case 1:
						System.out.println("***** INGRESE LIBRO DIGITAL *****");
						LibrosDigitales l = new LibrosDigitales();
						System.out.println("Titulo del Libro");
						teclado.nextLine();
						l.setTitulo(teclado.nextLine());
						System.out.println("Edición del Libro");
						l.setEdicion(teclado.nextInt());
						System.out.println("Nombre del Autor");
						teclado.nextLine();
						l.setAutor(teclado.nextLine());
						System.out.println("Precio del Libro");
						l.setPrecio(teclado.nextDouble());
						ListaLibros.add(l);
                                                System.out.println("Precio Total es : ");
						l.calcularPrecio();
                                                System.out.println(l.precio + l.calcularComision());
						break;
					case 2:
						System.out.println("***** INGRESE LIBRO FISICO *****");
						LibrosImpreso f = new LibrosImpreso();
						System.out.println("Titulo del Libro");
						teclado.nextLine();
						f.setTitulo(teclado.nextLine());
						System.out.println("Edición del Libro");
						f.setEdicion(teclado.nextInt());
						teclado.nextLine();
						System.out.println("Nombre del Autor");
						f.setAutor(teclado.nextLine());
						System.out.println("Precio del Libro");
						f.setPrecio(teclado.nextDouble());
						ListaLibros.add(f);
                                                System.out.println("Precio Total es : ");
						f.calcularPrecio();
                                                System.out.println(f.precio + f.calcularComision());
						break;
				}
				break;
			case 2:
				System.out.println("***** ELIMINAR LIBRO *****");
				System.out.println("Titulo del Libro");
				teclado.nextLine();
				String titulo = teclado.nextLine();
				int posicion = 0;
				for(int i = 0; i < ListaLibros.size(); i++) {
					if(titulo.equalsIgnoreCase(ListaLibros.get(i).getTitulo())) {
						posicion = i;
					}
				}
				ListaLibros.remove(posicion);
				break;
			case 3:
				for (Libro libro: ListaLibros) {
					System.out.println(libro.toString());
					
				}
				break;
		}
		}while(op<=4);
	}
}