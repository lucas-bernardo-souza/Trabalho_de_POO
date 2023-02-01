/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas Bernardo
 */
public class ComercioEletronico {
    private String nomeLoja;
    private static ArrayList<Venda> vendas = new ArrayList<>();;
    private static ArrayList<Produto> produtos = new ArrayList<>();;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();;
    private static ArrayList<Transportadora> transportadoras = new ArrayList<>();;
    private static ArrayList<Usuario> clientes = new ArrayList<>();;
    private static ArrayList<Usuario> gerentes = new ArrayList<>();;
    private Configuracao configuracoes;
    
    public static void adicionarCliente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, 
            String endereco, String cep, String email, boolean ouro){
        LocalDate hoje = LocalDate.now();
        if(ouro){
            ClienteOuro clienteOuro = new ClienteOuro(hoje, codigo, nome, cpf, rg, dataNascimento, endereco,
            cep, email);
            ComercioEletronico.clientes.add(clienteOuro);
        } else{
            Cliente cliente = new Cliente(hoje, codigo, nome, cpf, rg, dataNascimento, endereco,
            cep, email);
            ComercioEletronico.clientes.add(cliente);
        }
    }
    
    public static void adicionarGerente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, 
            String endereco, String cep, String email, float salario, String pis){
        LocalDate hoje = LocalDate.now();
        Gerente gerente = new Gerente(salario, pis, hoje, codigo, nome, cpf, rg, dataNascimento, endereco,
        cep, email);
        ComercioEletronico.gerentes.add(gerente);
    }
    
    public static void adicionarMovel(Produto movel){
        ComercioEletronico.produtos.add(movel);
    }
    
    public static void adicionarEletrodomestico(Produto eletro){
        ComercioEletronico.produtos.add(eletro);
    }
    
    public static void adicionarEletronico(Produto eletronico){
        ComercioEletronico.produtos.add(eletronico);
    }
    
    public static void adicionarVestuario(Produto vestuario){
        ComercioEletronico.produtos.add(vestuario);
    }
    
    public static void adicionarFabricante(int codigo, String cnpj, String nome, String descricao, 
            String email, String telefone, String endereco){
        Fabricante fab = new Fabricante(codigo, cnpj, nome, descricao, email, telefone, endereco);
        fabricantes.add(fab);
    }
    
    public static void adicionarTransportadora(int codigo, String cnpj, String nome, String email,
            String telefone, String endereco, int tempoEntrega){
        Transportadora transportadora = new Transportadora(codigo, cnpj, nome, email, telefone,
        endereco, tempoEntrega);
        transportadoras.add(transportadora);
    }
    
    public static void registrarVenda(int codigo, Usuario cliente, Usuario gerente, Iterator<String> itensVenda,
            LocalDate dataVenda, Pagamento formaPagamento, 
            Transportadora transportadora){
        Venda venda = new Venda(codigo, cliente, gerente, dataVenda, formaPagamento, transportadora);
        vendas.add(venda);
    }
    
    public static ArrayList<Fabricante> getFabricantes(){
        return fabricantes;
    }
    
    public static Iterator<Usuario> getClientes(){
        return clientes.iterator();
    }
    
    public static Iterator<Usuario> getGerentes(){
        return gerentes.iterator();
    }
    
    public static Iterator<Produto> getProdutos(){
        return produtos.iterator();
    }
    
    public static Iterator<Transportadora> getTransportadora(){
        return transportadoras.iterator();
    }
    
    public static Fabricante buscarFabricante(String nome){
        Iterator<Fabricante> iterator = fabricantes.iterator();
        while (iterator.hasNext()) {
            
            Fabricante fabricante = iterator.next();
            
            if(fabricante.getNome().equals(nome)){
                return(fabricante);
            }
        }
        return(null);
    }
    
    public static Transportadora buscarTransportadora(int cod){
        Iterator<Transportadora> iterator = transportadoras.iterator();
        while (iterator.hasNext()) {
            
            Transportadora transportadora = iterator.next();
            
            if(transportadora.getCodigo() == cod){
                return(transportadora);
            }
        }
        return(null);
    }
    
    public static Usuario buscarCliente(String nome){
        Iterator<Usuario> iterator = clientes.iterator();
        while(iterator.hasNext()){
            Usuario user = iterator.next();
            
            if(user.getNome().equals(nome)){
                return user;
            }
        }
        return null;
    }
    
    public static Usuario buscarGerente(String nome){
        Iterator<Usuario> iterator = gerentes.iterator();
        while(iterator.hasNext()){
            Usuario user = iterator.next();
            
            if(user.getNome().equals(nome)){
                return user;
            }
        }
        return null;
    }
}
