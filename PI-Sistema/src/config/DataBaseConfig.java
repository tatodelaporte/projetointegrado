/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Daniel
 */
public class DataBaseConfig {

    public static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE_URL = "jdbc:mysql://localhost/aluno";
    public static final String DATABASE_USER = "aluno";
    public static final String DATABASE_PASSWORD = "aluno";
    public static final String HIBERNATE_SHOW_SQL = "true";
    public static final String HIBERNATE_FORMAT_SQL = "false";
    public static final String HIBERNATE_CREATE_TABLES = "update";
}
