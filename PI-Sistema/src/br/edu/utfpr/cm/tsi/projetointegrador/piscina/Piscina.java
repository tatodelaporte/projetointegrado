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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    private String tamanho;
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

    public String getCapacidadeAlunos() {
        return capacidadeAlunos;
    }

    public void setCapacidadeAlunos(String capacidadeAlunos) {
        this.capacidadeAlunos = capacidadeAlunos;
    }

    @Override
    public String toString() {
        return "Piscina{" + "id=" + id + ", descricao=" + descricao + ", tamanho=" + tamanho + ", capacidadeAlunos=" + capacidadeAlunos + '}';
    }

    
    
    
}
