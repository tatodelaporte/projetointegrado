/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.Filter;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.Dao;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Daniele
 */
public class DaoGenericos<T> implements Dao<T> {
       Session session=null;
       protected Class clazz;
      
        
    
    @Override
    public void persist(T o){
      session=HibernateConfiguration.getSessionFactory().openSession();
      session.saveOrUpdate(o);
      session.flush();
      session.close();
    }
    
    

    @Override
    public void delete(T o){
        session = HibernateConfiguration.getSessionFactory().openSession();
        session.delete(o);
        session.flush();
        session.close();
    }

    @Override
    public T retrieve(int id){
      
    }

    @Override
    public List<T> list() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> list(Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
