/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.util.Iterator;
import model.ComercioEletronico;
import model.Usuario;


/**
 *
 * @author Lucas Bernardo
 */
public class ControladorUsuario {
    
    public ControladorUsuario(){
        
    }
    
    public static void adicionarUsuario(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, 
            String endereco, String cep, String email, boolean ouro){
        ComercioEletronico.adicionarCliente(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, ouro);
    }
    
    public static void adicionarGerente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, 
            String endereco, String cep, String email, float salario, String pis){
        ComercioEletronico.adicionarGerente(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, salario, pis);
    }
    
    public static Iterator<Usuario> getClientes(){
        return ComercioEletronico.getClientes();
    }
    
    public static Iterator<Usuario> getGerentes(){
        return ComercioEletronico.getGerentes();
    }
}
