
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
 * @author Daniele
 */
public class JavaAplicationBanco {
     public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aluno","root","douglas");
        
        con.setAutoCommit(false);
       
        Statement st =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);                                
        st.execute("SELECT * FROM cidade");
        ResultSet rs = st.getResultSet();
        
        System.out.println("TYPE=" +rs.getType());
        
        while(rs.next()){
            for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                if(rs.getMetaData().getColumnName(i).equals("nome")){
                    rs.updateObject(i, rs.getObject(i) + "  ");
                }
                System.out.print(rs.getMetaData().getColumnLabel(i) + "  =" + rs.getObject(i) + " ,  ");
            }
            rs.updateRow();
            System.out.println("");
        }

        con.commit();
    }
}


