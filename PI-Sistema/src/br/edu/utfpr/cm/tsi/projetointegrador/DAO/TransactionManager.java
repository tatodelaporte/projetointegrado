/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.HibernateConfiguration;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel
 */
public class TransactionManager {
     private static Session session = null;
    private static Transaction trans = null;

    public static void beginTransaction() {
        if (trans != null) {
            throw new RuntimeException("Já existe uma transação iniciada!");
        }
        session = HibernateConfiguration.getSessionFactory().openSession();
        trans = session.beginTransaction();
    }

    public static void commit() {
        if (trans == null) {
            throw new RuntimeException("Erro tentando executar commit() sem antes ter executado um beginTransaction().");
        }
        trans.commit();
        session.flush();
        closeCurrentSession();
    }

    public static void rollback() {
        if (trans == null) {
            throw new RuntimeException("Erro tentando executar rollback() sem antes ter executado um beginTransaction().");
        }
        trans.rollback();
        closeCurrentSession();
    }

    public static Session getCurrentSession() {
        /*Automatizando a criação de transação caso o programador não o fez de forma explicíta*/
        if (session == null) {
            Session sessionTemp = HibernateConfiguration.getSessionFactory().openSession();
            sessionTemp.setFlushMode(FlushMode.ALWAYS);
            return sessionTemp;
        }
        return session;
    }

    private static void closeCurrentSession() {
        session.close();
        trans = null;
        session = null;
    }
}
