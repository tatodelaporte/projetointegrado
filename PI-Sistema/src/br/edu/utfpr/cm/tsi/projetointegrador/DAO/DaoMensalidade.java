/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.mensalidade.Mensalidade;
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
public class DaoMensalidade {
    private static Mensalidade converteRsParaMensalidade(ResultSet rs) throws SQLException {
        Mensalidade p = new Mensalidade();
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("nome"));
        p.setTipo(rs.getString("tipo"));
        p.setValor(rs.getString("valor"));
        
        
      
        
        return p;
    }
        
    
    
      public static void insert(Mensalidade p) throws SQLException{   
          
        PreparedStatement pst =br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO mensalidade (nome,tipo,valor) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getNome());
        pst.setString(2, p.getTipo());
        pst.setString(3, p.getValor());
       
      
        
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        int idGerado =0;
        if (rs.next()){
            idGerado =rs.getInt(1);
        }
         
        p.setId(idGerado);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso \n "
                + "Código da Mensalidade "+idGerado);
    } 
    
    
       public static Mensalidade retrieve(int id) throws SQLException{
        Statement st =br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM mensalidade where id=" +id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Mensalidade p = converteRsParaMensalidade(rs);
       
        return p;
    }
      
      public static void update(Mensalidade p) throws SQLException{
        PreparedStatement pst =br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().prepareStatement("UPDATE mensalidade SET nome = ?, tipo = ?, valor= ? WHERE id = ?");
        pst.setString(1, p.getNome());
        pst.setString(2, p.getTipo());
        pst.setString(3, p.getValor());
        
        pst.setInt(4, p.getId());
        pst.execute();
        
       // JOptionPane.showMessageDialog(null, "Alterado com sucesso");
    }
      
      
      public static void delete(Mensalidade p) throws SQLException{
        Statement st =  br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM mensalidade WHERE id = " + p.getId());
        
        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
    }
      
      public static Mensalidade find(int id) throws SQLException{
          Statement st=br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();
          ResultSet rs=st.executeQuery("SELECT * FROM mensalidade where id=" +id);
          rs.next();
          
          Mensalidade p = converteRsParaMensalidade(rs);
          return p;
      }
      
    
      public static List<Mensalidade> list() throws SQLException{
        List<Mensalidade> mensalidade = new ArrayList<Mensalidade>();
        
        Statement st = br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM mensalidade");
        
        while(rs.next()){
            Mensalidade p = converteRsParaMensalidade(rs);
            mensalidade.add(p);
        }
        
        return mensalidade;
    }  
      
}

      
      
    
        
    
    

    


    
    


    

