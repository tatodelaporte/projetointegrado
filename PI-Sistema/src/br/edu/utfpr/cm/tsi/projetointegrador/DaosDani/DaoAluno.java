/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DaosDani;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory;
import br.edu.utfpr.cm.tsi.projetointegrador.DaosDani.Aluno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
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
public class DaoAluno {
    
    private static Aluno converteRsParaAluno(ResultSet rs) throws SQLException {
        Aluno p = new Aluno();
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("nome"));
        p.setCpf(rs.getString("cpf"));
        p.setEndereco(rs.getString("endereco"));
        p.setTelefone("telefone");


        
        return p;
    }
        

            
  //    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/pisistemas?user=root&password=douglas";
    
      public static void insert(Aluno p) throws SQLException{   
          
        PreparedStatement pst =ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO aluno (nome, cpf, endereco,telefone) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, p.getNome());
        pst.setString(2, p.getCpf());
        pst.setString(3, p.getEndereco());
        pst.setString(4, p.getTelefone());
      //  pst.setDate(5, new Date(p.getDataNascimento().getTime()));
        
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        int idGerado =0;
        if (rs.next()){
            idGerado =rs.getInt(1);
        }
         
        p.setId(idGerado);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso \n "
                + "Código do Aluno "+idGerado);
    } 
    
    
       public static Aluno retrieve(int id) throws SQLException{
        Statement st =ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM aluno where id=" +id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Aluno p = converteRsParaAluno(rs);
       
        return p;
    }
      
      public static void update(Aluno p) throws SQLException{
        PreparedStatement pst =ConnectionFactory.prepareConnection().prepareStatement("UPDATE aluno SET nome = ?, cpf = ?, endereco = ?, telefone = ? WHERE id = ?");
        pst.setString(1, p.getNome());
        pst.setString(2, p.getCpf());
        pst.setString(3, p.getEndereco());
        pst.setString(4, p.getTelefone());
        pst.setInt(5, p.getId());
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Alterado com sucesso");
    }
      
      
      public static void delete(Aluno p) throws SQLException{
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM aluno WHERE id = " + p.getId());
        
        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
    }
      
      public static Aluno find(int id) throws SQLException{
          Statement st=ConnectionFactory.prepareConnection().createStatement();
          ResultSet rs=st.executeQuery("SELECT * FROM aluno where id=" +id);
          rs.next();
          
          Aluno p = converteRsParaAluno(rs);
          return p;
      }
      
    
      public static List<Aluno> list() throws SQLException{
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        Statement st = ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM aluno");
        
        while(rs.next()){
            Aluno p = converteRsParaAluno(rs);
            alunos.add(p);
        }
        
        return alunos;
    }  
      
}

      
      
    
        
    
    

    


    
    

