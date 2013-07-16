/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.turma;

import java.util.List;

/**
 *
 * @author Daniel
 */
public class Turma {

    private int id;
    private String descricao;
    private int professor;
    private int piscina;
    private String horarioInicio;
    private String horarioFim;
    private String diaAula;
    private List diasAula;

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

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    public int getPiscina() {
        return piscina;
    }

    public void setPiscina(int piscina) {
        this.piscina = piscina;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorariofim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
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

        return "Turma {" + "id=" + id + ", descricao" + descricao + ",professor" + professor
                + ",Horario Inicio Aula" + horarioInicio + ","
                + " Horario Fim da Aula" + horarioFim + ","
                + " Dias de Aula" + diaAula + '}';
    }
}
