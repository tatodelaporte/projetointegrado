/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.piscina;

/**
 *
 * @author Daniele
 */
public class Piscina {
    private int id;
    private String descricao;
    private String tamanho;
    private String capacidade;

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

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Piscina{" + "id=" + id + ", descricao=" + descricao + ", tamanho=" + tamanho + ", capacidade=" + capacidade + '}';
    }

    
    
}
