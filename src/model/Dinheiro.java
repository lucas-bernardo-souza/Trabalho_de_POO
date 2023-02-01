/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas Bernardo
 */
public class Dinheiro extends Pagamento{

    public Dinheiro(int codigoNota) {
        super(codigoNota);
    }

    @Override
    public String toString() {
        return "Dinheiro{" + '}';
    }
    
}
