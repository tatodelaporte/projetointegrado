
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniele
 */
public class JavaAplication2 {
    
    public static void main(String[] args) throws SQLException {
        
        DaoCliente d=new DaoCliente();
        
        Pessoa p=new Pessoa();
        
        p.setId(4);
        p.setNome("Aparecida");
        p.setCpf("07894217450");
        
        d.insert(p);
        
        System.out.println("Inserindo "+p);
        
        
       p.setNome(p.getNome() + "ihihihi");
        d.update(p);
        
        p=d.retrieve(1);
        
      System.out.println("update" +p);
        
        
        
        
        
        
    }
    
}

    
    
    
    

