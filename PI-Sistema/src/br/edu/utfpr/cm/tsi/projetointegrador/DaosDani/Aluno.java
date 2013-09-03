/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DaosDani;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Daniele
 */
public class Aluno {
    
     private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String numero;
    private String telefone;
    private Date dataNascimento=Calendar.getInstance().getTime();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    
    
    

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
      if(dataNascimento == null)
                throw new RuntimeException("A data de nascimento nao pode ser NULL");
        
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", numero=" + numero + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + '}';
    }

    
    
    }

 
    
    
   
    

