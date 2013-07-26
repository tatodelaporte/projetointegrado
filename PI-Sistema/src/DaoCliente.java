
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniele
 */
public class DaoCliente {
     private static final String JDBC_URL = "jdbc:mysql://localhost:3306/aluno?user=root&password=douglas";
    
     public Pessoa retrieve(int id) throws SQLException{
         Pessoa p=new Pessoa();
         
         Statement st =  prepareConnection().createStatement();                                
         
        st.execute("SELECT * FROM pessoa");
        ResultSet rs = st.getResultSet();
        
        rs.next();
        
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("Nome"));
        p.setCpf(rs.getString("Cpf"));
        
        
        return p;
     }   
        public void update(Pessoa p) throws SQLException{
        Statement st =  prepareConnection().createStatement();                                
        st.execute("UPDATE pessoa SET nome ='" + p.getNome() +"', cpf ='" + p.getCpf() +" ' WHERE id = " + p.getId());
            
        }
        
        
        public void insert(Pessoa p) throws SQLException{
         Statement st =  prepareConnection().createStatement();
         st.executeUpdate("INSERT INTO pessoa (id, nome, cpf) VALUES('" + p.getId() +"', '" + p.getNome() +"', '"+p.getCpf()+"')");
         //st.executeUpdate("INSERT INTO pessoa (nome, cpf) VALUES('" + p.getNome() +"', '" + p.getCpf() +"')");
         
        
        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        
        int idGenerated = rs.getInt(1);
        p.setId(idGenerated);     
     }
     
     public void delete(Pessoa p) throws SQLException{
        Statement st =  prepareConnection().createStatement();                                
        st.execute("DELETE FROM pessoa WHERE id = " + p.getId());
    }
    
    private Connection prepareConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection(JDBC_URL);
        con.setAutoCommit(true);
        return con;
    }
}

    
    

