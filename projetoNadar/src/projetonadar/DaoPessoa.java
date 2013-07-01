/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonadar;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniele
 */
class DaoPessoa {

    private static Pessoa converteRsParaPessoa(ResultSet rs) throws SQLException {
        Pessoa p=new Pessoa();
        p.setId(rs.getInt("id"));
        p.setNome(rs.getString("nome"));
        p.setCpf(rs.getString("Cpf"));
        p.setDataNascimento(rs.getDate("data nascimento"));
        return p;
        
    }
    
    static void update(Pessoa p) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static void insert(Pessoa p) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static Iterable<Pessoa> list() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static Pessoa retrieve(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
