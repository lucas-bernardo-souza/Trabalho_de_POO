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
public class Gerente extends Usuario{
    protected float salario;
    protected String pis;
    protected LocalDate dataAdimissao;

    public Gerente(float salario, String pis, LocalDate dataAdimissao, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdimissao = dataAdimissao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "salario=" + salario + ", pis=" + pis + ", dataAdimissao=" + dataAdimissao + '}';
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(LocalDate dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }
    
}
