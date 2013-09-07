/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.entidade;

import br.edu.utfpr.cm.tsi.projetointegrador.enums.EstadoEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import sun.security.util.Length;

/**
 *
 * @author Daniele
 * 
 */
@Entity
@Table (name="endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private long id;
    
    @Column(name="endereco", length=100)
    private String nomeEndereco;
    
    @Column(name="numero",length=8)
    private int numero;
    
    @Column(name="complemento",length=60)
    private String complemento;
    
    @Column(name="bairro",length=100)
    private String bairro;
    
    @Column(name="municipio",length=60)
    private String municipio;
    
    @Column(name="estado")
    @Enumerated(EnumType.STRING)
    private EstadoEnum estado;
    
    @Column(name="cep",length=8)
    private String cep;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
