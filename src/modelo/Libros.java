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
public abstract  class Libros {
    private int codigo;
    private String titulo;
    private String autor;
    private String edicion;

    public Libros() {
    }

    public Libros(int codigo, String titulo, String autor, String edicion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libros{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + '}';
    }
  
    abstract  public  void CalcularPrecioFijo();
    abstract  public  void CalcularComision();
   
}
