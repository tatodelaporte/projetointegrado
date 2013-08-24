/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.hibernate;

import static br.edu.utfpr.cm.tsi.projetointegrador.hibernate.Operator.EQUAL;
import static br.edu.utfpr.cm.tsi.projetointegrador.hibernate.Operator.IS_NOT_NULL;
import static br.edu.utfpr.cm.tsi.projetointegrador.hibernate.Operator.IS_NULL;
import static br.edu.utfpr.cm.tsi.projetointegrador.hibernate.Operator.LIKE;
import static br.edu.utfpr.cm.tsi.projetointegrador.hibernate.Operator.MORE_THAN;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Daniel
 */
public class DaoGenerics<T> implements Dao<T> {

    Session session = null;
    Class classe = null;

    public  DaoGenerics(Class classe) {
        this.classe = classe;
    }

    public Class getClasse() {
        return this.classe;
    }

    @Override
        public void persist(T o) throws Exception {
        session = TransactionManager.getCurrentSession();
        session.saveOrUpdate(o);
        
    }

    @Override
        public void delete(T o) throws Exception {
        session = TransactionManager.getCurrentSession();
        session.delete(o);
    }

    @Override
        public T retrieve(int id) throws Exception {
        T objeto = null;
        if (id > 0) {
            session = TransactionManager.getCurrentSession();
            Query select = session.createQuery("From " + classe.getSimpleName() + " where id = " + id);
            objeto = (T) select.uniqueResult();
        }
        return objeto;
    }

    @Override
        public List<T> list() throws Exception {
        session = TransactionManager.getCurrentSession();
        List<T> lista = session.createQuery("FROM " + classe.getSimpleName()).list();
        return lista;
    }

    
    @Override
        public List<T> list(Filter... filters) throws Exception {
        List<T> lista = new ArrayList<>();
        String sql = " where ";
        for (Filter f : filters) {
            System.out.println(f);
            switch (f.getOperator()) {
                case IS_NULL:
                    sql += f.getAttribute() + " IS NULL";
                    break;
                case IS_NOT_NULL:
                    sql += f.getAttribute() + " IS NOT NULL";
                    break;
                case LIKE:
                    sql += f.getAttribute() + " LIKE '%" + f.getValue() + "%'";
                    break;
                case EQUAL:
                    sql += f.getAttribute() + "='" + f.getValue() + "'";
                    break;
                case MORE_THAN:
                    sql += f.getAttribute() + " >" + f.getValue() + "";
                    break;
                default:
                    throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
            }
        }
        session = TransactionManager.getCurrentSession();
        Query query = session.createQuery("From " + classe.getSimpleName() + sql);
        lista = query.list();

        return lista;
    }
}
