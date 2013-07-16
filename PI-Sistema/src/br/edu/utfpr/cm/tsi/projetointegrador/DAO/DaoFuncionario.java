package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.funcionarios.Funcionarios;
import br.edu.utfpr.cm.tsi.projetointegrador.turma.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class DaoFuncionario {

    private static Funcionarios converteRsParaFuncionarios(ResultSet rs) throws SQLException {

        Funcionarios f = new Funcionarios();

        f.setId(rs.getInt("id"));
        f.setNome(rs.getString("nome"));


        return f;

    }

    public void persist(Funcionarios f) throws SQLException {
        if (f.getId() == 0) {
            insert(f);
        } else {
            update(f);
        }
    }

    public static void insert(Funcionarios f) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Funcionarios (id,nome) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, f.getNome());




    }

    public Funcionarios retrieve(int id) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Turma WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Funcionarios f = converteRsParaFuncionarios(rs);

        return f;

    }

    public void update(Funcionarios f) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Funcionarios SET id = ?, nome = ?");

        pst.execute();

    }

    public void delete(Turma t) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Turma WHERE id = " + t.getId());
    }

    public List<Funcionarios> list() throws SQLException {
        List<Funcionarios> Func = new ArrayList<Funcionarios>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Turma");

        while (rs.next()) {
            Funcionarios f = converteRsParaFuncionarios(rs);
            Func.add(f);
        }

        return Func;
    }
}
