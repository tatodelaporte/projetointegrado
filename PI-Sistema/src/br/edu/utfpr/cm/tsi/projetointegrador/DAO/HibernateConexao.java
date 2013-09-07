/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Endereco;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Matricula;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Piscina;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Daniel
 */
public class HibernateConexao {

    /**
     *
     */
    public HibernateConexao() {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", " org.hibernate.dialect.MySQL5Dialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/swin");
        cfg.setProperty("hibernate.connection.user", "root");
        cfg.setProperty("hibernate.connection.password", "douglas");
        cfg.setProperty("hibernate.connection.autocommit", "false");

        cfg.addAnnotatedClass(Turma.class);
        cfg.addAnnotatedClass(Matricula.class);
        cfg.addAnnotatedClass(Funcionario.class);
        cfg.addAnnotatedClass(Aluno.class);
        cfg.addAnnotatedClass(Endereco.class);
        cfg.addAnnotatedClass(Piscina.class);
        


    }
}
