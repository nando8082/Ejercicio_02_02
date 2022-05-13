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
public class Credito {
    private int codigo;
    private int  saldo;
    private int recarga;
    private Double saldoTotal;
    private Double saldoTotal1;
    private LibrosDigitales librosDigitales;
    private LibrosImpreso librosImpreso;

    public Credito() {
    }

    public Credito(int codigo, int saldo, int recarga) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.recarga = recarga;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    @Override
    public String toString() {
        return "Credito{" + "codigo=" + codigo + ", saldo=" + saldo + ", recarga=" + recarga + '}';
    }
    
     public  void CalcularPrecioFinal(){  
        this.saldoTotal=getSaldo()-librosDigitales.getPrecioTotal();
        this.saldoTotal1=getSaldo()-librosImpreso.getPrecioTotal();
        
    } 
    
    
}
