/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.turma;

import br.edu.utfpr.cm.tsi.projetointegrador.funcionario.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.piscina.Piscina;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Daniel
 */
@Entity
public class Turma implements Serializable {

    // @OneToMany
    //private List<Matricula> matriculas;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100)
    private String descricao;
    @ManyToOne
    private Piscina piscina;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horarioInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horarioFim;
    @Column(length = 100)
    private String diaAula;
    @ManyToOne
    private Funcionario professor;

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @param id
     */
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getProfessor() {
        return professor;
    }

    public void setProfessor(Funcionario professor) {
        this.professor = professor;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorariofim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getDiaAula() {
        return diaAula;
    }

    public void setDiaAula(String diaAula) {
        this.diaAula = diaAula;
    }

    @Override
    public String toString() {

        return getDescricao() + " - " + getId();
        //return "Turma {" + "id=" + id + ","
        //     + "descricao" + descricao + ","
        //     + "professor" + professor + ","
        //  + "horarioInicio" + horarioInicio + ","
        // + "horarioFim" + horarioFim + ","
        //+ "diaAula" + diaAula + '}';

    }
}
