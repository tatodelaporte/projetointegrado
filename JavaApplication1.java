/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;

/**
 *
 * @author Daniele
 */
public class JavaApplication1 {
    
    public static void main(String[] args) throws SQLException {
        DaoCliente d=new DaoCliente();
        
        Pessoa p=new Pessoa();
        p.setNome("Dani");
        p.setCPF("12367896");
        
        d.insert(p);
        System.out.println("Insert" +p);
        
        p.setNome(p.getNome()+ "zzz");
        d.update(p);
        p = d.retrieve(2);
        System.out.println("Update" +p);
        
        
        
        
    }
    
}
