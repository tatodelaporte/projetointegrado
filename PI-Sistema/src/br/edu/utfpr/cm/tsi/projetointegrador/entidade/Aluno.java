/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Daniele
 */
@Entity
public class Aluno implements Serializable {
    //@OneToMany(mappedBy = "aluno")
  //  private List<Matricula> matriculas;
    //@OneToOne(mappedBy = "aluno")
  //  private Matricula matricula;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 100,nullable=false)
    private String nome;
         
    @Column(length = 11) //unique true
    private String cpf;
    
    
    @Column(length = 9)
    private String rg;
    
    @Column(name="dataNascimento",length=8 ) 
    @Temporal(javax.persistence.TemporalType.DATE)//
    private Date dataNascimento;
    
    @OneToOne(cascade= CascadeType.ALL,fetch= FetchType.EAGER) //deletar junto 
    private Endereco endereco;
    
   
    @Column(length = 18)
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

   

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    

    
}
