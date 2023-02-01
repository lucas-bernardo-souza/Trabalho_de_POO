/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas Bernardo
 */
public class Transportadora {
    private int codigo;
    private String cnpj;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int tempoDeEntrega;

    public Transportadora(int codigo, String cnpj, String nome, String email, String telefone, String endereco, int tempoDeEntrega) {
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tempoDeEntrega = tempoDeEntrega;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTempoDeEntrega() {
        return tempoDeEntrega;
    }

    public void setTempoDeEntrega(int tempoDeEntrega) {
        this.tempoDeEntrega = tempoDeEntrega;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }
    
}
