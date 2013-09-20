/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.control;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.DaoGenerics;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.AlunoDao;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Endereco;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class AlunoController {

    private AlunoDao alunoDao;
    private Aluno aluno;
    private Endereco endereco;
    private static Aluno alunoSelecionado;

    public AlunoController() {
        this.alunoDao = new AlunoDao();
        this.aluno = new Aluno();
        this.endereco = new Endereco();
    }

    public static Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public static void setAlunoSelecionado(Aluno alunoSelecionado) {
        AlunoController.alunoSelecionado = alunoSelecionado;
    }

    public AlunoDao getAlunoDao() {
        return alunoDao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void create() throws RuntimeException {
        AlunoController.setAlunoSelecionado(this.aluno);
        try {
            this.alunoDao.persist(aluno);
        } catch (Exception ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Aluno aluno) throws RuntimeException {
        try {
            alunoDao.delete(aluno);
        } catch (Exception ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public List<Aluno> findAll() throws Exception{
         return this.alunoDao.findAll();
         
     }
      
      public void newEndereco(){
          this.endereco= new Endereco();
      }
      
      
      
      
      
      
      
}

