/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.matricula;

import br.edu.utfpr.cm.tsi.projetointegrador.aluno.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.mensalidade.Mensalidade;
import br.edu.utfpr.cm.tsi.projetointegrador.turma.Turma;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Daniel
 */
@Entity
public class Matricula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @OneToOne
    private Aluno aluno;
    @OneToOne
    private Turma turma;
    @Column(length = 1)
    private int situação;
    @OneToOne
    private Mensalidade mensalidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getSituação() {
        return situação;
    }

    public void setSituação(int situação) {
        this.situação = situação;
    }
}
