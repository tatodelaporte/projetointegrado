/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.sistema;

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
public class DaoTurma {

    private static Turma converteRsParaTurma(ResultSet rs) throws SQLException {

        Turma t = new Turma();

        t.setId(rs.getInt("id"));
        t.setDescricao(rs.getString("descricao"));
        t.setProfessor(rs.getInt("professor"));
        t.setHorarioInicio(rs.getString("horarioinicio"));
        t.setHorarioFim(rs.getString("horariofim"));
        t.setDiaAula(rs.getString("diaaula"));

        return t;

    }

    public void persist(Turma t) throws SQLException {
        if (t.getId() == 0) {
            insert(t);
        } else {
            update(t);
        }
    }

    public static void insert(Turma t) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Turma (descricao, professor, piscina, horarioinicio,horariofim,diaaula) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, t.getDescricao());
        pst.setInt(2, t.getProfessor());
        pst.setInt(3, t.getPiscina());
        pst.setString(4, t.getHorarioInicio());
        pst.setString(5, t.getHorariofim());
        pst.setString(6, t.getDiaAula());


    }

    public Turma retrieve(int id) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Turma WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Turma t = converteRsParaTurma(rs);

        return t;

    }

    public void update(Turma t) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Turma SET descricao = ?, professor = ?, piscina=?, horarioinicio=?, horariofim=?, diaaula=? WHERE id = ?");
        pst.setString(1, t.getDescricao());
        pst.setInt(2, t.getProfessor());
        pst.setInt(3, t.getPiscina());
        pst.setString(4, t.getHorarioInicio());
        pst.setString(5, t.getHorariofim());
        pst.setString(6, t.getDiaAula());
        pst.execute();

    }

    public void delete(Turma t) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Turma WHERE id = " + t.getId());
    }

    public List<Turma> list() throws SQLException {
        List<Turma> Turmas = new ArrayList<Turma>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Turma");

        while (rs.next()) {
            Turma t = converteRsParaTurma(rs);
            Turmas.add(p);
        }

        return Turmas;
    }
}
