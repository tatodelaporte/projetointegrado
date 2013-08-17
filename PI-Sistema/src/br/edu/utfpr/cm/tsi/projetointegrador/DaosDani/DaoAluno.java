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
        p.setDataNascimento(rs.getDate("dataNascimento"));
      //  p.setDataNascimento(null);
        
        return p;
    }
        
        private DaoAluno() {}
            
      private static final String JDBC_URL = "jdbc:mysql://localhost:3306/pisistemas?user=root&password=douglas";
    
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
        Statement st =  prepareConnection().createStatement();                                
        st.execute("SELECT * FROM aluno");
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Aluno p = converteRsParaAluno(rs);
       
        return p;
    }
      
      public static void update(Aluno p) throws SQLException{
        PreparedStatement pst =  prepareConnection().prepareStatement("UPDATE aluno SET nome = ?, cpf = ?, endereco = ?, telefone = ? WHERE id = ?");
        pst.setString(1, p.getNome());
        pst.setString(2, p.getCpf());
        pst.setString(3, p.getEndereco());
        pst.setString(4, p.getTelefone());
        pst.setInt(5, p.getId());
        pst.execute();
    }
      
      
      public static void delete(Aluno p) throws SQLException{
        Statement st =  prepareConnection().createStatement();                                
        st.execute("DELETE FROM aluno WHERE id = " + p.getId());
    }
      
    
      public static List<Aluno> list() throws SQLException{
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        Statement st =  prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM aluno");
        
        while(rs.next()){
            Aluno p = converteRsParaAluno(rs);
            alunos.add(p);
        }
        
        return alunos;
    }
      
      
       private static  Connection prepareConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection(JDBC_URL);
        con.setAutoCommit(true);
        return con;
    }
}

      
      
    
        
    
    

    


    
    

