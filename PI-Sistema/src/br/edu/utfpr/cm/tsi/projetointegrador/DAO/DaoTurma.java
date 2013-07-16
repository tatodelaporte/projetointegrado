
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.turma.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
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

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Turma (descricao, professor, piscina, horarioinicio,horariofim,diaAula) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, t.getDescricao());
        pst.setInt(2, t.getProfessor());
        pst.setInt(3, t.getPiscina());
        pst.setString(4, t.getHorarioInicio());
        pst.setString(5, t.getHorariofim());
        pst.setString(6, t.getDiaAula());
        //ResultSet rs = pst.getGeneratedKeys();
        pst.execute();
        //int idGenerated = rs.getInt(1);
        //t.setId(idGenerated);
        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

    }

    public static Turma retrieve(int id) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Turma WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Turma t = converteRsParaTurma(rs);

        return t;

    }

    public static void update(Turma t) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Turma SET descricao = ?, professor = ?, piscina=?, horarioinicio=?, horariofim=?, diaaula=? WHERE id ="+t.getId());
        
        pst.setString(1, t.getDescricao());
        pst.setInt(2, t.getProfessor());
        pst.setInt(3, t.getPiscina());
        pst.setString(4, t.getHorarioInicio());
        pst.setString(5, t.getHorariofim());
        pst.setString(6, t.getDiaAula());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");

    }

    public static void delete(Turma t) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Turma WHERE id = " + t.getId());
        JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
    }

    public List<Turma> list() throws SQLException {
        List<Turma> Turmas = new ArrayList<Turma>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Turma");

        while (rs.next()) {
            Turma t = converteRsParaTurma(rs);
            Turmas.add(t);
        }

        return Turmas;
    }
}
