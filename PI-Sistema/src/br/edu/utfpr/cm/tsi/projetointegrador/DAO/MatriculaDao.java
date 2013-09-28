/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Matricula;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import java.util.List;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Daniele
 */
public class MatriculaDao extends DaoGenerics<Matricula>{

    public MatriculaDao() {
        super(Matricula.class);
    }
    
}
