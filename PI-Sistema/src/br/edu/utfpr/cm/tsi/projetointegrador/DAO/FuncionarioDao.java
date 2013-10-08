package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Daniel
 */
public class FuncionarioDao extends DaoGenerics<Funcionario> {

    public FuncionarioDao() {
        super(Funcionario.class);
    }
    private Session session;
    private static Funcionario funcionarioSelecionado;

    public List<Funcionario> filtrarPorCpf(String cpf) {
        session = TransactionManager.getCurrentSession();
        List<Funcionario> lista = session.createCriteria(Funcionario.class).
                add(Restrictions.like("cpf", "%" + cpf + "%")).
                addOrder(Order.asc("nome")).
                list();
        return lista;
    }

    public List<Funcionario> filterByNome(String nome) {
        session = TransactionManager.getCurrentSession();
        List<Funcionario> lista = session.createCriteria(Funcionario.class).
                add(Restrictions.like("nome", "%" + nome + "%")).
                addOrder(Order.asc("nome")).
                list();
        return lista;
    }

    public List<Funcionario> filterByTipo(String tipofuncionario) {
        session = TransactionManager.getCurrentSession();
        List<Funcionario> lista = session.createCriteria(Funcionario.class).
                add(Restrictions.like("tipofuncionario","%"+tipofuncionario+"%")).
                addOrder(Order.asc("tipofuncionario")).list();
                
        return lista;
    }

    public static Funcionario getFuncionarioSelecionado() {
        return funcionarioSelecionado;
    }

    public static void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
        FuncionarioDao.funcionarioSelecionado = funcionarioSelecionado;
    }

    
    
    
//    private static Funcionario converteRsParaFuncionario(ResultSet rs) throws SQLException {
//
//        Funcionario f = new Funcionario();
//
//        f.setId(rs.getInt("id"));
//        f.setNome(rs.getString("nome"));
//        f.setCpf(rs.getString("cpf"));
//        f.setRg(rs.getString("rg"));
//        f.setTelefone(rs.getString("telefone"));
//
//
//
//        return f;
//
//    }
    
//    public static Funcionario find(int id) throws SQLException {
//
//        Statement st = ConnectionFactory.prepareConnection().createStatement();
//        ResultSet rs = st.executeQuery("SELECT * FROM funcionario where id= " + id);
//        rs.next();
//
//        Funcionario f = converteRsParaFuncionario(rs);
//        return f;
//    }
    
    
}
//    public static List<Funcionario> list() throws SQLException {
//        List<Funcionario> Func = new ArrayList<Funcionario>();
//
//        Statement st = ConnectionFactory.prepareConnection().createStatement();
//        ResultSet rs = st.executeQuery("SELECT * FROM funcionario");
//
//        while (rs.next()) {
//            Funcionario f = converteRsParaFuncionario(rs);
//            Func.add(f);
//        }
//
//        return Func;
//    }
//}
//    private static Funcionario converteRsParaFuncionario(ResultSet rs) throws SQLException {
//
//        Funcionario f = new Funcionario();
//
//        f.setId(rs.getInt("id"));
//        f.setNome(rs.getString("nome"));
//        f.setCpf(rs.getString("cpf"));
//        f.setRg(rs.getString("rg"));
//        f.setFoneCelular(rs.getString("fonecelular"));
//        f.setFoneResidencia(rs.getString("foneresidencia"));
//
//
//        return f;
//
//    }
//
//    public void persist(Funcionario f) throws SQLException {
//        if (f.getId() == 0) {
//            insert(f);
//        } else {
//            update(f);
//        }
//    }
//
//    public static void insert(Funcionario f) throws SQLException {
//
//        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO funcionario (nome,cpf,rg,endereco,fonecelular,foneResidencia,tipofuncionario)"
//                + " VALUES(?,?,?,?,?,?,?,?,)", Statement.RETURN_GENERATED_KEYS);
//        pst.setString(1, f.getNome());
//        pst.setString(2, f.getCpf());
//        pst.setString(3, f.getRg());
//        pst.setString(4, f.getFoneCelular());
//        pst.setString(5, f.getFoneResidencia());
//
//
//        pst.execute();
//
//        // Result set pegado o generate keys
//        ResultSet rs = pst.getGeneratedKeys();
//        int idGerado = 0;
//        if (rs.next()) {
//            idGerado = rs.getInt(1);
//        }
//        f.setId(idGerado);
//        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso! \n"
//                + "Codigo do Funcionario " + idGerado);
//
//
//
//    }
//
//    public static Funcionario retrieve(int id) throws SQLException {
//        Statement st = ConnectionFactory.prepareConnection().createStatement();
//        st.execute("SELECT * FROM funcionario WHERE id =" + id);
//        ResultSet rs = st.getResultSet();
//
//        rs.next();
//        Funcionario f = converteRsParaFuncionario(rs);
//
//        return f;
//
//    }
//
//    public static void update(Funcionario f) throws SQLException {
//
//        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE funcionario set "
//                + "nome = ?,"
//                + "cpf = ?,"
//                + "rg = ?,"
//                + "cidade = ?,"
//                + "fonecelular = ?,"
//                + "foneresidencia = ?,"
//                + "tipofuncionario = ? where id= " + f.getId());
//
//        pst.setString(1, f.getNome());
//        pst.setString(2, f.getCpf());
//        pst.setString(3, f.getRg());
//        pst.setString(9, f.getFoneCelular());
//        pst.setString(10, f.getFoneResidencia());
//        pst.execute();
//        JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
//
//    }
//
//    public static void delete(Funcionario f) throws SQLException {
//        Statement st = ConnectionFactory.prepareConnection().createStatement();
//        st.execute("DELETE FROM funcionario WHERE id = " + f.getId());
//        JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
//    }
//
//    public static Funcionario find(int id) throws SQLException {
//
//        Statement st = ConnectionFactory.prepareConnection().createStatement();
//        ResultSet rs = st.executeQuery("SELECT * FROM funcionario where id= " + id);
//        rs.next();
//
//        Funcionario f = converteRsParaFuncionario(rs);
//        return f;
//    }
//
//    public static List<Funcionario> list() throws SQLException {
//        List<Funcionario> Func = new ArrayList<Funcionario>();
//
//        Statement st = ConnectionFactory.prepareConnection().createStatement();
//        ResultSet rs = st.executeQuery("SELECT * FROM funcionario");
//
//        while (rs.next()) {
//            Funcionario f = converteRsParaFuncionario(rs);
//            Func.add(f);
//        }
//
//        return Func;
//}

