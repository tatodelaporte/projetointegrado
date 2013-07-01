/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonadar;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Daniele
 */
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento=Calendar.getInstance().getTime();
    
    private Endereco endereco;

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
         if(dataNascimento == null)
             throw new RuntimeException("A data de nascimento ");
         
             this.dataNascimento = dataNascimento;
    }
          
    
    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
     @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    
    
}
