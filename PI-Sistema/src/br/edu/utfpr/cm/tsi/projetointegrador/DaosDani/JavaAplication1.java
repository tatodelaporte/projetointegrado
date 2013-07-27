/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DaosDani;

import java.sql.SQLException;

/**
 *
 * @author Daniele
 */
public class JavaAplication1 {
    
     public static void main(String[] args) throws SQLException {
        Aluno p = new Aluno();
        p.setNome("Dani");
        p.setCpf("1111117711");
        p.setEndereco("brasilll sil zill");        
        p.setTelefone("15");
        
        
        DaoAluno.insert(p);
        System.out.println("INSERT:" + p);   
        
        p.setNome(p.getNome() + "zzz");
        DaoAluno.update(p);
        p = DaoAluno.retrieve(2);
        System.out.println("UPDATE:" + p);   
        
        
        for(Aluno p1: DaoAluno.list()){
            System.out.println("LIST:" + p1);   
            
        }
        
    }
}
    
    

