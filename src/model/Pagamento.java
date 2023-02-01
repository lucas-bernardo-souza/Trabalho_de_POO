/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas Bernardo
 */
public abstract class Pagamento {
    protected int codigoNota;

    public Pagamento(int codigoNota) {
        this.codigoNota = codigoNota;
    }
    
    @Override
    public abstract String toString();
    
    public int getCodigoNota(){
        return this.codigoNota;
    }
    
}
