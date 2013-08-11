/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.turma;

import br.edu.utfpr.cm.tsi.projetointegrador.funcionario.Funcionario;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Turma {

    private int id;
    private String descricao;
    //private int professor;
    private int piscina;
    private Date horarioInicio;
    private Date horarioFim;
    private String diaAula;
    private List diasAula;
    private Funcionario professor;

    public Turma() {
        this.professor = new Funcionario();
    }

    public List getDiasAula() {
        return diasAula;
    }

    public void setDiasAula(List diasAula) {
        this.diasAula = diasAula;
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

    //public int getProfessor() {
    //  return professor;
    //}
    //public void setProfessor(int professor) {
    //  this.professor = professor;
    public Funcionario getProfessor() {
        return professor;
    }

    public void setProfessor(Funcionario professor) {
        this.professor = professor;
    }
    // }

    public int getPiscina() {
        return piscina;
    }

    public void setPiscina(int piscina) {
        this.piscina = piscina;
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

        return getDescricao()+" - "+getId();
        //return "Turma {" + "id=" + id + ","
        //     + "descricao" + descricao + ","
        //     + "professor" + professor + ","
        //  + "horarioInicio" + horarioInicio + ","
        // + "horarioFim" + horarioFim + ","
        //+ "diaAula" + diaAula + '}';

    }
}
