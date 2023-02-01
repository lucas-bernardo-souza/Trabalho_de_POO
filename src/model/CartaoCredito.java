/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas Bernardo
 */
public class CartaoCredito extends Pagamento{
    private String nome;
    private String bandeira;
    private String numero;

    public CartaoCredito(int codigoNota, String nome, String bandeira, String numero) {
        super(codigoNota);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    

    @Override
    public String toString() {
        return "CartaoCredito{" + "nome=" + nome + ", bandeira=" + bandeira + ", numero=" + numero + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
