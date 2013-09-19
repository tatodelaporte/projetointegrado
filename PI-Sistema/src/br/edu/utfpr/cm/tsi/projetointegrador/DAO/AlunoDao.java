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
    
    public List <Aluno> filtrarPorCpf(String cpf){
        List<Aluno> list=null;
      //  this.session = Hib.getSessionFactory().openSession();        
        try{
        //    this.session.beginTransaction();
            list = this.session.createCriteria(Aluno.class).                                
                    add(Restrictions.like("cpf", cpf+"%")).
                    addOrder(Order.asc("nome")).
                    list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        return list;
    }
    
     public List<Aluno> filterByNome(String nome){
        List<Aluno> list = null;
         try{
            this.session.beginTransaction();
            list = this.session.createCriteria(Aluno.class).                                
                    add(Restrictions.like("nome", "%"+nome+"%")).
                    addOrder(Order.asc("nome")).
                    list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        return list;
    }
    
    public boolean haveCpf(String cpf){
        List<Aluno> list = null;
       
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(Aluno.class).                                
                    add(Restrictions.like("cpf", cpf)).
                    list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        if(list.size()>0){
            return true;
        }
        return false;
    }
}

    
    
    
    
    
    
    
    
    
    
        
     
    
    
    


      
      
    
        
    
    

    


    
    

