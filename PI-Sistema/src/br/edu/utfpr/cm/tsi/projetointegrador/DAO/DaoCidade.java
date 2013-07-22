/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.cidade.Cidade;
import br.edu.utfpr.cm.tsi.projetointegrador.funcionario.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class DaoCidade {

    private static Cidade converteRsParaCidade(ResultSet rs) throws SQLException {

        Cidade cidade = new Cidade();

        cidade.setId(rs.getInt("id"));
        cidade.setEstado(rs.getString("estado"));
        cidade.setNome(rs.getString("nome"));
        cidade.setUf(rs.getString("uf"));


        return cidade;

    }

    public void persist(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Object o) throws Exception {
    }

    public Object retrieve(String uf) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM cidade WHERE uf =" + uf);
        ResultSet rs = st.getResultSet();

        rs.next();
        Cidade cidade = converteRsParaCidade(rs);

        return cidade;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public List <Cidade> List() throws Exception {
        List<Cidade> cidade = new ArrayList<Cidade>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM cidades");

        while (rs.next()) {
            Cidade c = converteRsParaCidade(rs);
            cidade.add(c);
        }
        
        
        return cidade;
    }
}
