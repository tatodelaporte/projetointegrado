/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.aluno;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Daniele
 */
public class Aluno implements Serializable {

    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

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

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

<<<<<<< 632d9d357680232a072bb5e27cfdc0e9d0a016ef
   
    
    
    
=======
    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + '}';
    }
>>>>>>> fcc5bee2042e2b6564a79b7126e6aadb5007a777
}
