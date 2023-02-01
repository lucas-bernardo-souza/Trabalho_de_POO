/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.util.Iterator;
import model.ComercioEletronico;
import model.Pagamento;
import model.Produto;
import model.Transportadora;
import model.Usuario;

/**
 *
 * @author Lucas Bernardo
 */
public class ControladorVendas {
    public void registrarVenda(int codigo, String cliente, String gerente, Iterator<String> itensVenda,
            Pagamento pagamento, Transportadora transportadora){
        Usuario clienteObjeto = ComercioEletronico.buscarCliente(cliente);
        Usuario gerenteObjeto = ComercioEletronico.buscarGerente(gerente);
        LocalDate dataDaVenda = LocalDate.now();
        ComercioEletronico.registrarVenda(codigo, clienteObjeto, gerenteObjeto, itensVenda, dataDaVenda, pagamento, transportadora);
    }
    
    public Iterator<Usuario> getClientes(){
        return ComercioEletronico.getClientes();
    }
    
    public Iterator<Usuario> getGerentes(){
        return ComercioEletronico.getGerentes();
    }
    
    public Iterator<Produto> getProdutos(){
        return ComercioEletronico.getProdutos();
    }
}
