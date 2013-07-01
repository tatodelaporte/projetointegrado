/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonadar;

import java.sql.SQLException;

/**
 *
 * @author Daniele
 */
public class ProjetoNadar {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) throws SQLException {
        Pessoa p = new Pessoa();
        p.setNome("Lucio");
        p.setCpf("1111111111");
        DaoPessoa.insert(p);
        System.out.println("INSERT:" + p);   
        
        p.setNome(p.getNome() + "zzz");
        DaoPessoa.update(p);
        p = DaoPessoa.retrieve(2);
        System.out.println("UPDATE:" + p);   
        
        
        for(Pessoa p1: DaoPessoa.list()){
            System.out.println("LIST:" + p1);   
            
        }
        
    }
}

        // TODO code application logic here
    

