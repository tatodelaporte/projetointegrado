package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 *
 * @author Daniel
 */
public class EXCLUIRISSO {

    private static Turma converteRsParaTurma(ResultSet rs) throws SQLException {

        Turma t = new Turma();

        t.setId(rs.getInt("id"));
        t.setDescricao(rs.getString("descricao"));
        FuncionarioDao.find(rs.getInt("professor_id"));
        t.setHorarioInicio(rs.getTime("horarioinicio"));
        t.setHorarioFim(rs.getTime("horariofim"));
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

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Turma (descricao, professor_id, piscina, horarioinicio,horariofim,diaAula) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, t.getDescricao());
        pst.setInt(2, t.getProfessor().getId());
        pst.setInt(3, t.getPiscina().getId());
        pst.setTime(4, new java.sql.Time(t.getHorarioInicio().getTime()));
        pst.setTime(5, new java.sql.Time(t.getHorariofim().getTime()));
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

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Turma SET descricao = ?,"
                + " professor_id = ?,"
                + " piscina=?,"
                + "horarioInicio=?,"
                + " horarioFim=?,"
                + " diaaula=?"
                + " WHERE id =" + t.getId());

        pst.setString(1, t.getDescricao());
        pst.setInt(2, t.getProfessor().getId());
        pst.setInt(3, t.getPiscina().getId());
        pst.setTime(4, new java.sql.Time(t.getHorarioInicio().getTime()));
        pst.setTime(5, new java.sql.Time(t.getHorariofim().getTime()));
        pst.setString(6, t.getDiaAula());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");

    }

    public static void delete(Turma t) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Turma WHERE id = " + t.getId());
        JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
    }

    public static List<Turma> list() throws SQLException {
        List<Turma> Turmas = new ArrayList<Turma>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM turma");

        while (rs.next()) {
            Turma t = converteRsParaTurma(rs);
            Turmas.add(t);
        }

        return Turmas;
    }
}
