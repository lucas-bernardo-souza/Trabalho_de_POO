/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas Bernardo
 */
public class Pix extends Pagamento{
    private String codigoPix;

    public Pix(String codigoPix, int codigoNota) {
        super(codigoNota);
        this.codigoPix = codigoPix;
    }

    @Override
    public String toString() {
        return "Pix{" + "codigoPix=" + codigoPix + '}';
    }

    public String getCodigoPix() {
        return codigoPix;
    }
    
}
