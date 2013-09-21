/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Daniele
 */
public class AlunoDao  extends DaoGenerics<Aluno>{
    
    public AlunoDao(){
        super(Aluno.class);
    }
   
    private Session session;
    private static Aluno alunoSelecionado;
    
    public List <Aluno> filtrarPorCpf(String cpf){
        session = TransactionManager.getCurrentSession();
        List<Aluno> lista = session.createCriteria(Aluno.class).
                add(Restrictions.like("cpf", "%"+cpf+"%")).
                    addOrder(Order.asc("nome")).
                list();
        return lista;
    }
    
     public List<Aluno> filterByNome(String nome){
       session = TransactionManager.getCurrentSession();
        List<Aluno> lista = session.createCriteria(Aluno.class).
                add(Restrictions.like("nome", "%"+nome+"%")).
                    addOrder(Order.asc("nome")).
                list();
        return lista;
    }

    public static Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public static void setAlunoSelecionado(Aluno alunoSelecionado) {
        AlunoDao.alunoSelecionado = alunoSelecionado;
    }
    
     
     
}

    
    
    
    
    
    
    
    
    
    
        
     
    
    
    


      
      
    
        
    
    

    


    
    

