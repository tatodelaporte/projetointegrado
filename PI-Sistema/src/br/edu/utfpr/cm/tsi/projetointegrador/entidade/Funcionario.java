/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.entidade;

import br.edu.utfpr.cm.tsi.projetointegrador.enums.TipoFuncionarioEnum;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Daniel
 */
@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String nome;
    @Column(length = 17)
    private String cpf;
    @Column(length = 11)
    private String rg;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //deletar junto     
    private Endereco endereco;
    @Column(length = 12)
    private String telefone;
    @Column(length = 15)
    @Enumerated(EnumType.STRING)
    private TipoFuncionarioEnum tipofuncionario;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoFuncionarioEnum getTipofuncionario() {
        return tipofuncionario;
    }

    public void setTipofuncionario(TipoFuncionarioEnum tipofuncionario) {
        this.tipofuncionario = tipofuncionario;
    }

    @Override
    public String toString() {

        return this.getNome() + " - " + getId();



    }
}
