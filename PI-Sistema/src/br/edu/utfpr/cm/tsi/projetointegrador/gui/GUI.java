
package br.edu.utfpr.cm.tsi.projetointegrador.gui;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory;
import br.edu.utfpr.cm.tsi.projetointegrador.consulta.ConsultaHorarioAula;
import br.edu.utfpr.cm.tsi.projetointegrador.funcionario.CadastroFuncionario;
import br.edu.utfpr.cm.tsi.projetointegrador.matricula.CadastroMatricula;
import br.edu.utfpr.cm.tsi.projetointegrador.turma.CadastroTurmas;
import br.edu.utfpr.cm.tsi.projetointegrador.aluno.CadastroAlunos;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        criarBanco();
        setSize(800, 600);
        setTitle("Sistema SwinSystem");
        setLocationRelativeTo(null);
        pack();
        setResizable(false);// Trava o tamanho do painel.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btAlunos = new javax.swing.JButton();
        btTurmas = new javax.swing.JButton();
        btFuncionarios = new javax.swing.JButton();
        btPiscina = new javax.swing.JButton();
        btMensalidade = new javax.swing.JButton();
        btMatricula = new javax.swing.JButton();
        btFrequencia = new javax.swing.JButton();
        btConsultaHorario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastros = new javax.swing.JMenu();
        rbmiAluno = new javax.swing.JRadioButtonMenuItem();
        rmbiTurma = new javax.swing.JRadioButtonMenuItem();
        rbmiFuncionario = new javax.swing.JRadioButtonMenuItem();
        rbmiPiscina = new javax.swing.JRadioButtonMenuItem();
        rbmiMensalidade = new javax.swing.JRadioButtonMenuItem();
        mnMovimentos = new javax.swing.JMenu();
        rbmiMatricula = new javax.swing.JRadioButtonMenuItem();
        rmbiFrequencia = new javax.swing.JRadioButtonMenuItem();
        mnConsultas = new javax.swing.JMenu();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        rbmiConsultaHorarios = new javax.swing.JRadioButtonMenuItem();
        mnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jToolBar1.setRollover(true);

        btAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        btAlunos.setText("Alunos");
        btAlunos.setFocusable(false);
        btAlunos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlunos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunosActionPerformed(evt);
            }
        });
        jToolBar1.add(btAlunos);

        btTurmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group.png"))); // NOI18N
        btTurmas.setText("Turmas");
        btTurmas.setFocusable(false);
        btTurmas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTurmas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTurmasActionPerformed(evt);
            }
        });
        jToolBar1.add(btTurmas);

        btFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        btFuncionarios.setText("Funcionarios");
        btFuncionarios.setFocusable(false);
        btFuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });
        jToolBar1.add(btFuncionarios);

        btPiscina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Screen Saver.png"))); // NOI18N
        btPiscina.setText("Piscina");
        btPiscina.setFocusable(false);
        btPiscina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPiscina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btPiscina);

        btMensalidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Applications.png"))); // NOI18N
        btMensalidade.setText("Mensalidade");
        btMensalidade.setFocusable(false);
        btMensalidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMensalidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btMensalidade);

        btMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Users.png"))); // NOI18N
        btMatricula.setText("Matricula");
        btMatricula.setFocusable(false);
        btMatricula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMatricula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMatriculaActionPerformed(evt);
            }
        });
        jToolBar1.add(btMatricula);

        btFrequencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AOL Instant Messenger.png"))); // NOI18N
        btFrequencia.setText("Frequencia");
        btFrequencia.setFocusable(false);
        btFrequencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFrequencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btFrequencia);

        btConsultaHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/natação.png"))); // NOI18N
        btConsultaHorario.setText("Consulta Horarios");
        btConsultaHorario.setFocusable(false);
        btConsultaHorario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultaHorario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConsultaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaHorarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btConsultaHorario);

        mnCadastros.setText("Cadastros");

        rbmiAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        rbmiAluno.setSelected(true);
        rbmiAluno.setText("Aluno");
        rbmiAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        rbmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiAlunoActionPerformed(evt);
            }
        });
        mnCadastros.add(rbmiAluno);

        rmbiTurma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        rmbiTurma.setSelected(true);
        rmbiTurma.setText("Turma");
        rmbiTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group.png"))); // NOI18N
        rmbiTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmbiTurmaActionPerformed(evt);
            }
        });
        mnCadastros.add(rmbiTurma);

        rbmiFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        rbmiFuncionario.setSelected(true);
        rbmiFuncionario.setText("Funcionario");
        rbmiFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        rbmiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiFuncionarioActionPerformed(evt);
            }
        });
        mnCadastros.add(rbmiFuncionario);

        rbmiPiscina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        rbmiPiscina.setSelected(true);
        rbmiPiscina.setText("Piscina");
        rbmiPiscina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Screen Saver.png"))); // NOI18N
        mnCadastros.add(rbmiPiscina);

        rbmiMensalidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        rbmiMensalidade.setSelected(true);
        rbmiMensalidade.setText("Mensalidade");
        rbmiMensalidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Applications.png"))); // NOI18N
        mnCadastros.add(rbmiMensalidade);

        jMenuBar1.add(mnCadastros);

        mnMovimentos.setText("Movimentos");

        rbmiMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        rbmiMatricula.setSelected(true);
        rbmiMatricula.setText("Matricula");
        rbmiMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Users.png"))); // NOI18N
        rbmiMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiMatriculaActionPerformed(evt);
            }
        });
        mnMovimentos.add(rbmiMatricula);

        rmbiFrequencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        rmbiFrequencia.setSelected(true);
        rmbiFrequencia.setText("Frequencia");
        rmbiFrequencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AOL Instant Messenger.png"))); // NOI18N
        mnMovimentos.add(rmbiFrequencia);

        jMenuBar1.add(mnMovimentos);

        mnConsultas.setText("Consultas");

        jRadioButtonMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("Alunos");
        jRadioButtonMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        mnConsultas.add(jRadioButtonMenuItem5);

        jRadioButtonMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("Turmas");
        jRadioButtonMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group.png"))); // NOI18N
        mnConsultas.add(jRadioButtonMenuItem6);

        jRadioButtonMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem7.setSelected(true);
        jRadioButtonMenuItem7.setText("Funcionarios");
        jRadioButtonMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        mnConsultas.add(jRadioButtonMenuItem7);

        jRadioButtonMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem8.setSelected(true);
        jRadioButtonMenuItem8.setText("Piscinas");
        jRadioButtonMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Screen Saver.png"))); // NOI18N
        mnConsultas.add(jRadioButtonMenuItem8);

        rbmiConsultaHorarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        rbmiConsultaHorarios.setSelected(true);
        rbmiConsultaHorarios.setText("Consulta de Horarios");
        rbmiConsultaHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/natação.png"))); // NOI18N
        rbmiConsultaHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiConsultaHorariosActionPerformed(evt);
            }
        });
        mnConsultas.add(rbmiConsultaHorarios);

        jMenuBar1.add(mnConsultas);

        mnSair.setText("Sair");
        mnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSairMouseClicked(evt);
            }
        });
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiAlunoActionPerformed
    }//GEN-LAST:event_rbmiAlunoActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnSairMouseClicked

    private void rmbiTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmbiTurmaActionPerformed
        new CadastroTurmas().setVisible(true);
    }//GEN-LAST:event_rmbiTurmaActionPerformed

    private void rbmiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiFuncionarioActionPerformed
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_rbmiFuncionarioActionPerformed

    private void btTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTurmasActionPerformed
        new CadastroTurmas().setVisible(true);    }//GEN-LAST:event_btTurmasActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void rbmiMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiMatriculaActionPerformed
        new CadastroMatricula().setVisible(true);
    }//GEN-LAST:event_rbmiMatriculaActionPerformed

    private void btMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMatriculaActionPerformed
        new CadastroMatricula().setVisible(true);
    }//GEN-LAST:event_btMatriculaActionPerformed
        
    private void rbmiConsultaHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiConsultaHorariosActionPerformed
       new ConsultaHorarioAula().setVisible(true);
    }//GEN-LAST:event_rbmiConsultaHorariosActionPerformed

    private void btConsultaHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaHorarioActionPerformed
        new ConsultaHorarioAula().setVisible(true);
    }//GEN-LAST:event_btConsultaHorarioActionPerformed

    private void btAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunosActionPerformed
           new CadastroAlunos().setVisible(true);
    }//GEN-LAST:event_btAlunosActionPerformed

   
    
    
    public void criarBanco() {
        try {
            Statement st = ConnectionFactory.prepareConnection().createStatement();
            /*para executar comandos DDL de criação do banco*/
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "turma("
                    + "id int(10) not null AUTO_INCREMENT,"
                    + "descricao varchar(20) not null,"
                    + "professor varchar(10) not null,"
                    + "piscina varchar(10) not null,"
                    + "horarioinicio time not null,"
                    + "horariofim time not null,"
                    + "diaAula varchar(100) not null,"
                    + "PRIMARY KEY (id));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "funcionario("
                    + "id int(10) not null AUTO_INCREMENT,"
                    + "nome varchar(60) not null,"
                    + "cpf varchar(11) not null,"
                    + "rg varchar (15) not null,"
                    + "cep varchar (15) not null,"
                    + "prefixo varchar (30) not null,"
                    + "endereco varchar(250) not null,"
                    + "cidade varchar (50) not null,"
                    + "uf varchar (2) not null,"
                    + "fonecelular varchar (15),"
                    + "foneresidencia varchar (15),"
                    + "tipofuncionario varchar (20) not null,"
                    + "PRIMARY KEY (id));");
             st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "matricula("
                    + "id int(10) not null AUTO_INCREMENT,"
                    + "aluno int(10) not null,"
                    + "turma int(10) not null,"
                    + "mensalidade int (10) not null,"
                    + "situacao int (1) not null,"
                    + "PRIMARY KEY (id),"
                    + "FOREIGN KEY (turma) REFERENCES turma(id)ON DELETE CASCADE);");
             st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                     +"aluno(" 
                     +"id int (10) not null AUTO_INCREMENT,"
                     +"nome varchar (50) not null,"
                     +"cpf varchar (11) not null,"
                     +"endereco varchar (150) not null,"
                     +"telefone varchar (15),"
                     +"PRIMARY KEY (id));");
             st.executeUpdate("CREATE TABLE IF NOT EXISTS"
                     +"piscina("
                     +"id int (10) not null AUTO_INCREMENT,"
                     +"descricao varchar (60) not null,"
                     +"tamanho varchar (10) not null,"
                     +"capacidade de Alunos (10),"
                     +"PRIMARY KEY (id));");
             
             // Nao foi feito os outros FK pois as tabelas nao estao prontas
             
             


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlunos;
    private javax.swing.JButton btConsultaHorario;
    private javax.swing.JButton btFrequencia;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btMatricula;
    private javax.swing.JButton btMensalidade;
    private javax.swing.JButton btPiscina;
    private javax.swing.JButton btTurmas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnMovimentos;
    private javax.swing.JMenu mnSair;
    private javax.swing.JRadioButtonMenuItem rbmiAluno;
    private javax.swing.JRadioButtonMenuItem rbmiConsultaHorarios;
    private javax.swing.JRadioButtonMenuItem rbmiFuncionario;
    private javax.swing.JRadioButtonMenuItem rbmiMatricula;
    private javax.swing.JRadioButtonMenuItem rbmiMensalidade;
    private javax.swing.JRadioButtonMenuItem rbmiPiscina;
    private javax.swing.JRadioButtonMenuItem rmbiFrequencia;
    private javax.swing.JRadioButtonMenuItem rmbiTurma;
    // End of variables declaration//GEN-END:variables
}
