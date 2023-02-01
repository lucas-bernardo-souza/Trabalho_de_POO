/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas Bernardo
 */
public class Configuracao {
    private String arquivoVendas;
    private String arquivoProdutos;
    private String arquivoFabricantes;
    private String arquivoTransportadoras;
    private String arquivoClientes;
    private String arquivoGerentes;

    public Configuracao(String arquivoVendas, String arquivoProdutos, String arquivoFabricantes, String arquivoTransportadoras, String arquivoClientes, String arquivoGerentes) {
        this.arquivoVendas = arquivoVendas;
        this.arquivoProdutos = arquivoProdutos;
        this.arquivoFabricantes = arquivoFabricantes;
        this.arquivoTransportadoras = arquivoTransportadoras;
        this.arquivoClientes = arquivoClientes;
        this.arquivoGerentes = arquivoGerentes;
    }

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public void setArquivoVendas(String arquivoVendas) {
        this.arquivoVendas = arquivoVendas;
    }

    public String getArquivoProdutos() {
        return arquivoProdutos;
    }

    public void setArquivoProdutos(String arquivoProdutos) {
        this.arquivoProdutos = arquivoProdutos;
    }

    public String getArquivoFabricantes() {
        return arquivoFabricantes;
    }

    public void setArquivoFabricantes(String arquivoFabricantes) {
        this.arquivoFabricantes = arquivoFabricantes;
    }

    public String getArquivoTransportadoras() {
        return arquivoTransportadoras;
    }

    public void setArquivoTransportadoras(String arquivoTransportadoras) {
        this.arquivoTransportadoras = arquivoTransportadoras;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoGerentes() {
        return arquivoGerentes;
    }

    public void setArquivoGerentes(String arquivoGerentes) {
        this.arquivoGerentes = arquivoGerentes;
    }
    
}
