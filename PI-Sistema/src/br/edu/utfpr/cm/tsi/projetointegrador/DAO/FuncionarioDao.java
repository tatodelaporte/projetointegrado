package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class FuncionarioDao {

    private static Funcionario converteRsParaFuncionario(ResultSet rs) throws SQLException {

        Funcionario f = new Funcionario();

        f.setId(rs.getInt("id"));
        f.setNome(rs.getString("nome"));
        f.setCpf(rs.getString("cpf"));
        f.setRg(rs.getString("rg"));
        f.setCep(rs.getString("cep"));
        f.setPrefixo(rs.getString("prefixo"));
        f.setEndereco(rs.getString("endereco"));
        f.setUf(rs.getString("uf"));
        f.setCidade(rs.getString("cidade"));
        f.setFoneCelular(rs.getString("fonecelular"));
        f.setFoneResidencia(rs.getString("foneresidencia"));
        f.setTipoFuncionario(rs.getString("tipofuncionario"));

        return f;

    }

    public void persist(Funcionario f) throws SQLException {
        if (f.getId() == 0) {
            insert(f);
        } else {
            update(f);
        }
    }

    public static void insert(Funcionario f) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO funcionario (nome,cpf,rg,cep,prefixo,endereco,uf,cidade,fonecelular,foneresidencia,tipofuncionario)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, f.getNome());
        pst.setString(2, f.getCpf());
        pst.setString(3, f.getRg());
        pst.setString(4, f.getCep());
        pst.setString(5, f.getPrefixo());
        pst.setString(6, f.getEndereco());
        pst.setString(7, f.getUf());
        pst.setString(8, f.getCidade());
        pst.setString(9, f.getFoneCelular());
        pst.setString(10, f.getFoneResidencia());
        pst.setString(11, f.getTipoFuncionario());


        pst.execute();

        // Result set pegado o generate keys
        ResultSet rs = pst.getGeneratedKeys();
        int idGerado = 0;
        if (rs.next()) {
            idGerado = rs.getInt(1);
        }
        f.setId(idGerado);
        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso! \n"
                + "Codigo do Funcionario " + idGerado);



    }

    public static Funcionario retrieve(int id) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM funcionario WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Funcionario f = converteRsParaFuncionario(rs);

        return f;

    }

    public static void update(Funcionario f) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE funcionario set "
                + "nome = ?,"
                + "cpf = ?,"
                + "rg = ?,"
                + "cep = ?,"
                + "prefixo = ?,"
                + "endereco = ?,"
                + "uf = ?,"
                + "cidade = ?,"
                + "fonecelular = ?,"
                + "foneresidencia = ?,"
                + "tipofuncionario = ? where id= " + f.getId());

        pst.setString(1, f.getNome());
        pst.setString(2, f.getCpf());
        pst.setString(3, f.getRg());
        pst.setString(4, f.getCep());
        pst.setString(5, f.getPrefixo());
        pst.setString(6, f.getEndereco());
        pst.setString(7, f.getUf());
        pst.setString(8, f.getCidade());
        pst.setString(9, f.getFoneCelular());
        pst.setString(10, f.getFoneResidencia());
        pst.setString(11, f.getTipoFuncionario());

        pst.execute();
        JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

    }

    public static void delete(Funcionario f) throws SQLException {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM funcionario WHERE id = " + f.getId());
        JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
    }

    public static Funcionario find(int id) throws SQLException {

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM funcionario where id= " + id);
        rs.next();

        Funcionario f = converteRsParaFuncionario(rs);
        return f;
    }

    public static List<Funcionario> list() throws SQLException {
        List<Funcionario> Func = new ArrayList<Funcionario>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM funcionario");

        while (rs.next()) {
            Funcionario f = converteRsParaFuncionario(rs);
            Func.add(f);
        }

        return Func;
    }
}
