/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.util.Iterator;
import model.ComercioEletronico;
import model.FactoryProduto;
import model.Produto;
import model.Transportadora;

/**
 *
 * @author Lucas Bernardo
 */
public class ControladorProduto {
    public ControladorProduto(){
        
    }
    
    public static void adicionarMovel(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
            String nomeFabricante){
        ComercioEletronico.adicionarMovel(FactoryProduto.factoryMethod(codigo, nome, descricao, dataFabricacao, valor, nomeFabricante, "movel"));
    }
    
    public static void adicionarEletrodomestico(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
            String nomeFabricante){
        ComercioEletronico.adicionarEletrodomestico(FactoryProduto.factoryMethod(codigo, nome, descricao, dataFabricacao, valor, nomeFabricante, "eletrodomestico"));
    }
    
    public static void adicionarEletronico(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
            String nomeFabricante){
        ComercioEletronico.adicionarEletronico(FactoryProduto.factoryMethod(codigo, nome, descricao, dataFabricacao, valor, nomeFabricante, "eletronico"));
    }
    
    public static void adicionarVestuario(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
            String nomeFabricante){
        ComercioEletronico.adicionarVestuario(FactoryProduto.factoryMethod(codigo, nome, descricao, dataFabricacao, valor, nomeFabricante, "vestuario"));
    }
    
    public static void adicionarFabricante(int codigo, String cnpj, String nome, String descricao, 
            String email, String telefone, String endereco){
        ComercioEletronico.adicionarFabricante(codigo, cnpj, nome, descricao, email, telefone, endereco);
    }
    
    public static void adicioanrTransportadora(int codigo, String cnpj, String nome, String email, 
            String telefone, String endereco, int tempoEntrega){
        ComercioEletronico.adicionarTransportadora(codigo, cnpj, nome, email, telefone, endereco, tempoEntrega);
    }
    
    public static Iterator<Produto> getProdutos(){
        return ComercioEletronico.getProdutos();
    }
    
    public static Iterator<Transportadora> getTransportadora(){
        return ComercioEletronico.getTransportadora();
    }
    
    public static Transportadora buscarTransportadora(int cod){
        return ComercioEletronico.buscarTransportadora(cod);
    }
}
