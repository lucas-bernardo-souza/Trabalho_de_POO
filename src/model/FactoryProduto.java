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
public class FactoryProduto {
    public static Produto factoryMethod(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
            String nomeFabricante, String tipo){
        Fabricante fabricante = ComercioEletronico.buscarFabricante(nome);
        switch (tipo){
            case "movel":
                return new Movel(codigo, nome, descricao, dataFabricacao, valor, fabricante, true);
            case "eletrodomestico":
                return new Eletrodomestico(codigo, nome, descricao, dataFabricacao,valor, fabricante, true);
            case "eletronico":
                return new Eletronico(codigo, nome, descricao, dataFabricacao, valor, fabricante, true);
            case "vestuario":
                return new Vestuario(codigo, nome, descricao, dataFabricacao, valor, fabricante, true);
            default:
                return null;
                    
        }
        
        
    }
}
