/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.hibernate;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Matricula;
//import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Mensalidade;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Piscina;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import java.sql.Connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Daniel
 */
public class HibernateConfiguration {

    private static AnnotationConfiguration cfg = null;
    private static SessionFactory factory = null;

    public static SessionFactory getSessionFactory() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.username", "root");
            cfg.setProperty("hibernate.connection.password", "tato1234");
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/swin");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.autocommit", "true");
            cfg.addAnnotatedClass(Aluno.class); // classes para serem mapeadas
            cfg.addAnnotatedClass(Funcionario.class); // classes para serem mapeadas
            cfg.addAnnotatedClass(Matricula.class); // classes para serem mapeadas
     
            cfg.addAnnotatedClass(Piscina.class); // classes para serem mapeadas
            cfg.addAnnotatedClass(Turma.class); // classes para serem mapeadas
            factory = cfg.buildSessionFactory();// construindo uma fabrica de sessão

        }

        return factory;
    }
    //podemos setar o autocomit como true e nao precisa usar begin tansaction

    public static void createSchema() {
        getSessionFactory();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }

    public static Connection getConnection() {
        Session session = TransactionManager.getCurrentSession();
        return session.close();

    }
}
