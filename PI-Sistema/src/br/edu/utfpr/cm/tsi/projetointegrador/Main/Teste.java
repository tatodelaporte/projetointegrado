/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.Main;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.AlunoDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.MatriculaDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.TurmaDao;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Endereco;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Matricula;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import com.sun.media.sound.AlawCodec;
import java.util.ArrayList;

/**
 *
 * @author NEIDE LIMA
 */
public class Teste {
    public static void main(String[] args) throws Exception {
        Matricula matricula = new Matricula();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Turma turma1 = new Turma();
        
        aluno1.setNome("Marlon");
        aluno1.setCpf("1234567890");
        aluno1.setEndereco(new Endereco());
        
         aluno2.setNome("Teste");
        aluno2.setCpf("1234567890");
        aluno2.setEndereco(new Endereco());
        
         aluno3.setNome("Teste22");
        aluno3.setCpf("1234567890");
        aluno3.setEndereco(new Endereco());
     
        turma1.setDescricao("Turma tESTE");
         AlunoDao aludoDao = new AlunoDao();
         aludoDao.saveOrUpdate(aluno1);
         aludoDao.saveOrUpdate(aluno2);
         aludoDao.saveOrUpdate(aluno3);
         
         TurmaDao turmaDao = new TurmaDao();
         turmaDao.saveOrUpdate(turma1);
                 
         
         MatriculaDao dao = new MatriculaDao();
         dao.saveOrUpdate(matricula);
    }
}
