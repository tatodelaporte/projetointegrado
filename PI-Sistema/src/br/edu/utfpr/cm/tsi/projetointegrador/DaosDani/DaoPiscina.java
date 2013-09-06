/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DaosDani;

import br.edu.utfpr.cm.tsi.projetointegrador.piscina.Piscina;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniele
 */
public class DaoPiscina {
    
     private static Piscina converteRsParaPiscina(ResultSet rs) throws SQLException {
        Piscina p = new Piscina();
        p.setId(rs.getInt("id"));
        p.setDescricao(rs.getString("descricao"));
        p.setCapacidadeAlunos("capacidadeAlunos");
      
        
        return p;
    }
     
      public static void insert(Piscina p) throws SQLException{   
          
        PreparedStatement pst =br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO piscina (descricao,tamanho,capacidadeAlunos) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getDescricao());
        pst.setString(2, p.getTamanho());
        pst.setString(3, p.getCapacidadeAlunos());
              
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        int idGerado =0;
        if (rs.next()){
            idGerado =rs.getInt(1);
        }
         
        p.setId(idGerado);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso \n "
                + "Código da Piscina "+idGerado);
    } 
    
     
     
       public static Piscina retrieve(int id) throws SQLException{
        Statement st =br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM piscina where id=" +id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Piscina p = converteRsParaPiscina(rs);
       
        return p;
    }
     
       
     public static void update(Piscina p) throws SQLException{
       PreparedStatement pst =ConnectionFactory.prepareConnection().prepareStatement("UPDATE piscina SET descricao = ?, tamanho = ?, capacidade = ? WHERE id = ?");
        pst.setString(1, p.getDescricao());
        pst.setString(2, p.getTamanho());
        pst.setString(3, p.getCapacidadeAlunos());
      
        pst.setInt(4, p.getId());
        pst.execute();
        
    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
    }
         
         
         
         
        public static void delete(Piscina p) throws SQLException{
        Statement st =  br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM piscina WHERE id = " + p.getId());
        
        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
    }
      
      public static Piscina find(int id) throws SQLException{
          Statement st=br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();
          ResultSet rs=st.executeQuery("SELECT * FROM piscina where id=" +id);
          rs.next();
          
          Piscina p = converteRsParaPiscina(rs);
          return p;
      }
      
    
      public static List<Piscina> list() throws SQLException{
        List<Piscina> piscinas = new ArrayList<Piscina>();
        
        Statement st = br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM piscina");
        
        while(rs.next()){
            Piscina p = converteRsParaPiscina(rs);
            piscinas.add(p);
        }
        
        return piscinas;
    }  
      
}

      
      
    
        
    
    

    


    
    


         
         
         
         
         
     
    

