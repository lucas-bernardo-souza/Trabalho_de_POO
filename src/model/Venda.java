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
public final class Venda {
    private int codigo;
    private Usuario cliente;
    private Usuario gerente;
    private LocalDate dataVenda;
    private LocalDate dataDaEntrega;
    private ArrayList<ItemVenda> itensVenda;
    private float valorTotal;
    private float valorComDesconto;
    private Pagamento formaPagamento;
    private Transportadora transportadora;
    
    public Venda(int codigo, Usuario cliente, Usuario gerente, LocalDate dataVenda, Pagamento formaPagamento,
            Transportadora transportadora){
        this.codigo = codigo;
        this.cliente = cliente;
        this.gerente = gerente;
        this.dataVenda = dataVenda;
        this.itensVenda = new ArrayList();
        this.valorTotal = calcularValorTotal();
        this.valorComDesconto = calcularValorComDesconto();
        this.formaPagamento = formaPagamento;
        this.transportadora = transportadora;
        this.calcularDataEntrega();
    }
    
    public float calcularValorTotal(){
        float total = 0;
        Iterator<ItemVenda> iterator = itensVenda.iterator();
        while(iterator.hasNext()){
            total += iterator.next().calcularTotal();
        }
        return total;
    }
    
    public float calcularValorComDesconto(){
        if(cliente instanceof ClienteOuro){
            return valorTotal - valorTotal * 0.03f;
        }
        else return valorTotal;
    }
    
    public void calcularDataEntrega(){
        int tempoEntrega = transportadora.getTempoDeEntrega();
        dataDaEntrega = LocalDate.now().plusDays(tempoEntrega);
    }
    
    public void addItemVenda(ItemVenda item){
        itensVenda.add(item);
    }
}
