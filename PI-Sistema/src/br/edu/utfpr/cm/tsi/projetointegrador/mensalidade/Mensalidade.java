/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.mensalidade;

import br.edu.utfpr.cm.tsi.projetointegrador.matricula.Matricula;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Daniele
 */
@Entity
public class Mensalidade implements Serializable{
    @OneToMany(mappedBy = "mensalidade")
    private List<Matricula> matriculas;
    @OneToOne(mappedBy = "mensalidade")
    private Matricula matricula;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String tipo;
    @Column(length = 100)
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
