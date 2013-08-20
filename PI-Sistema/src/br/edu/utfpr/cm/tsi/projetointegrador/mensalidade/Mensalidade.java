/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.mensalidade;

/**
 *
 * @author Daniele
 */
public class Mensalidade {
    private int id;
    private String nome;
    private String tipo;
    private String valor;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Mensalidade{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", valor=" + valor + '}';
    }
    
    
    
}
