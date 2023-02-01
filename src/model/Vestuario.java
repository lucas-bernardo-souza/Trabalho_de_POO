/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Lucas Bernardo
 */
public class Vestuario extends Produto{

    public Vestuario(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel) {
        super(codigo, nome, descricao, dataFabricacao, valor, fabricante, disponivel);
    }
    
    @Override
    public float calcularValor(){
        return this.valor * 0.0115f + this.valor;
    }

    @Override
    public String toString() {
        return "Vestuario{" + '}';
    }
    
}
