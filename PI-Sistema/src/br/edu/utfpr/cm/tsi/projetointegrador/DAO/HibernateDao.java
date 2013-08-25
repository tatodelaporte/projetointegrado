/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import java.lang.reflect.Field;
import java.util.List;
import javassist.bytecode.annotation.Annotation;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


import javax.persistence.EntityManager;

/**
 *
 * @author lgvalentin
 */
public class HibernateDao implements Dao<Object> {

    @Override
    public void persist(Object o) throws Exception {

        
    }

    @Override
    public void delete(Object o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public List<Object> list(Object o) throws Exception {


        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object retrieve(Object o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        Field field;
        field = em.getEntityManagerFactory().getClass().getField("id");

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
