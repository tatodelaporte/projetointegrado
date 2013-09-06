/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.piscina;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Daniele
 */
@Entity
public class Piscina implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String descricao;
    @Column(length = 100)
    private String tamanho;
    @Column(length = 100)
    private String capacidadeAlunos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCapacidadeAlunos() {
        return capacidadeAlunos;
    }

    public void setCapacidadeAlunos(String capacidadeAlunos) {
        this.capacidadeAlunos = capacidadeAlunos;
    }

    @Override
    public String toString() {
       return this.getDescricao() + " - " + getId();
        // return "Piscina{" + "id=" + id + ", descricao=" + descricao + ", tamanho=" + tamanho + ", capacidadeAlunos=" + capacidadeAlunos + '}';
    }
}