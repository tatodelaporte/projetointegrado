package br.edu.utfpr.cm.tsi.projetointegrador.Main;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.HibernateConfiguration;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.ConnectionFactory;
import br.edu.utfpr.cm.tsi.projetointegrador.view.ConsultaHorarioAula;
import br.edu.utfpr.cm.tsi.projetointegrador.view.CadastroFuncionario;
import br.edu.utfpr.cm.tsi.projetointegrador.view.CadastroMatricula;
import br.edu.utfpr.cm.tsi.projetointegrador.view.CadastroTurmas;
import br.edu.utfpr.cm.tsi.projetointegrador.view.CadastroAlunos;
import br.edu.utfpr.cm.tsi.projetointegrador.view.InformacoeDesenvolvedores;
import br.edu.utfpr.cm.tsi.projetointegrador.view.JDialogRelatorios;
import br.edu.utfpr.cm.tsi.projetointegrador.view.CadastroFrequencia;

//import br.edu.utfpr.cm.tsi.projetointegrador.view.CadastrodePiscinas;
import br.edu.utfpr.cm.tsi.projetointegrador.view.FuncionarioConsultas;
import java.awt.Frame;



import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Main extends javax.swing.JDialog {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        //criarBanco();
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
        btFuncionarios = new javax.swing.JButton();
        btPiscina = new javax.swing.JButton();
        btTurmas = new javax.swing.JButton();
        btMatricula = new javax.swing.JButton();
        btFrequencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastros = new javax.swing.JMenu();
        rbmiAluno = new javax.swing.JRadioButtonMenuItem();
        rbmiFuncionario = new javax.swing.JRadioButtonMenuItem();
        rbmiPiscina = new javax.swing.JRadioButtonMenuItem();
        rmbiTurma = new javax.swing.JRadioButtonMenuItem();
        mnMovimentos = new javax.swing.JMenu();
        rbmiMatricula = new javax.swing.JRadioButtonMenuItem();
        rmbiFrequencia = new javax.swing.JRadioButtonMenuItem();
        mnConsultas = new javax.swing.JMenu();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuCriarBanco = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonDesenvolvedores = new javax.swing.JRadioButtonMenuItem();
        mnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema para Escola Natação");
        setForeground(new java.awt.Color(51, 0, 204));

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
        btPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPiscinaActionPerformed(evt);
            }
        });
        jToolBar1.add(btPiscina);

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
        btFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrequenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(btFrequencia);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/golfinho.jpg"))); // NOI18N

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

        rbmiFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        rbmiFuncionario.setSelected(true);
        rbmiFuncionario.setText("Funcionario");
        rbmiFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/funcionario.png"))); // NOI18N
        rbmiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiFuncionarioActionPerformed(evt);
            }
        });
        mnCadastros.add(rbmiFuncionario);

        rbmiPiscina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        rbmiPiscina.setSelected(true);
        rbmiPiscina.setText("Piscina");
        rbmiPiscina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Screen Saver.png"))); // NOI18N
        rbmiPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiPiscinaActionPerformed(evt);
            }
        });
        mnCadastros.add(rbmiPiscina);

        rmbiTurma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        rmbiTurma.setSelected(true);
        rmbiTurma.setText("Turma");
        rmbiTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group.png"))); // NOI18N
        rmbiTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmbiTurmaActionPerformed(evt);
            }
        });
        mnCadastros.add(rmbiTurma);

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
        rmbiFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmbiFrequenciaActionPerformed(evt);
            }
        });
        mnMovimentos.add(rmbiFrequencia);

        jMenuBar1.add(mnMovimentos);

        mnConsultas.setText("Consultas");

        jRadioButtonMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("Alunos");
        jRadioButtonMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        mnConsultas.add(jRadioButtonMenuItem5);

        jRadioButtonMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("Turmas");
        jRadioButtonMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group.png"))); // NOI18N
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
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

        jMenuBar1.add(mnConsultas);

        jMenu1.setText("Configurações");

        jRadioButtonMenuCriarBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuCriarBanco.setSelected(true);
        jRadioButtonMenuCriarBanco.setText("Criar Banco");
        jRadioButtonMenuCriarBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/banco.png"))); // NOI18N
        jRadioButtonMenuCriarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuCriarBancoActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuCriarBanco);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Relatórios");

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Gerar Relatórios");
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pdf.png"))); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Sobre");

        jRadioButtonDesenvolvedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonDesenvolvedores.setSelected(true);
        jRadioButtonDesenvolvedores.setText("Desenvolvedores");
        jRadioButtonDesenvolvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/desenvol.png"))); // NOI18N
        jRadioButtonDesenvolvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDesenvolvedoresActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonDesenvolvedores);

        jMenuBar1.add(jMenu2);

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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiAlunoActionPerformed
        new CadastroAlunos(null, true).setVisible(true);
    }//GEN-LAST:event_rbmiAlunoActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnSairMouseClicked

    private void rmbiTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmbiTurmaActionPerformed
        try {
            new CadastroTurmas(null, true).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_rmbiTurmaActionPerformed

    private void rbmiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiFuncionarioActionPerformed
        new CadastroFuncionario(null, true).setVisible(true);
    }//GEN-LAST:event_rbmiFuncionarioActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        new CadastroFuncionario(null, true).setVisible(true);
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void rbmiMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiMatriculaActionPerformed
        new CadastroMatricula().setVisible(true);
    }//GEN-LAST:event_rbmiMatriculaActionPerformed

    private void btMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMatriculaActionPerformed
        new CadastroMatricula().setVisible(true);
    }//GEN-LAST:event_btMatriculaActionPerformed

    private void btAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunosActionPerformed
        new CadastroAlunos(null, true).setVisible(true);
    }//GEN-LAST:event_btAlunosActionPerformed

    private void btPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPiscinaActionPerformed
        // new CadastrodePiscinas().setVisible(true);
    }//GEN-LAST:event_btPiscinaActionPerformed

    private void rbmiPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiPiscinaActionPerformed
        // new CadastrodePiscinas().setVisible(true);
    }//GEN-LAST:event_rbmiPiscinaActionPerformed

    private void btTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTurmasActionPerformed
        try {
            new CadastroTurmas(null, true).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btTurmasActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        FuncionarioConsultas conPessoa = new FuncionarioConsultas(new Frame(), true);

        conPessoa.setLocationRelativeTo(null);
        conPessoa.setResizable(false);
        conPessoa.setVisible(true);

    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jRadioButtonMenuCriarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuCriarBancoActionPerformed
        HibernateConfiguration.createSchema();
    }//GEN-LAST:event_jRadioButtonMenuCriarBancoActionPerformed

    private void jRadioButtonDesenvolvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDesenvolvedoresActionPerformed
        //    new InformacoeDesenvolvedores(null,true).setVisible(true);
        //      InformacoeDesenvolvedores.set
        InformacoeDesenvolvedores info = new InformacoeDesenvolvedores(new Frame(), true);
        info.setLocationRelativeTo(null);
        info.setResizable(false);
        info.setVisible(true);

        //new CadastroMatricula().setVisible(true);                     
    }//GEN-LAST:event_jRadioButtonDesenvolvedoresActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        JDialogRelatorios rel = new JDialogRelatorios(new Frame(), true);
        rel.setLocationRelativeTo(null);
        rel.setResizable(false);
        rel.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void btFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrequenciaActionPerformed
        new CadastroFrequencia().setVisible(true);
    }//GEN-LAST:event_btFrequenciaActionPerformed

    private void rmbiFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmbiFrequenciaActionPerformed
        new CadastroFrequencia().setVisible(true);
    }//GEN-LAST:event_rmbiFrequenciaActionPerformed

    public void criarBanco() {
        try {
            Statement st = ConnectionFactory.prepareConnection().createStatement();
            /*para executar comandos DDL de criação do banco*/
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "turma("
                    + "id int(10) not null AUTO_INCREMENT,"
                    + "descricao varchar(20) not null,"
                    + "professor_id int(11) not null,"
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
                    + "aluno("
                    + "id int (10) not null AUTO_INCREMENT,"
                    + "nome varchar (50) not null,"
                    + "cpf varchar (16) not null,"
                    + "endereco varchar (150) not null,"
                    + "numero varchar (7) not null,"
                    + "ADD CONSTRAINT UNIQUE_aluno_cpf,"
                    + "UNIQUE (cpf),"
                    + "telefone varchar (15),"
                    + "PRIMARY KEY (id));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "piscina("
                    + "id int (10) not null AUTO_INCREMENT,"
                    + "descricao varchar (60) not null,"
                    + "tamanho varchar (10) not null,"
                    + "capacidade varchar (10) not null,"
                    + "PRIMARY KEY (id));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "mensalidade("
                    + "id int (15) not null AUTO_INCREMENT,"
                    + "nome varchar (50) not null,"
                    + "tipo varchar (20) not null,"
                    + "valor varchar (10) not null,"
                    + "PRIMARY KEY (id));");





            JOptionPane.showMessageDialog(rootPane, "Banco Criado");






            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "aluno("
                    + "id int (10) not null AUTO_INCREMENT,"
                    + "nome varchar (50) not null,"
                    + "cpf varchar (16) not null,"
                    + "endereco varchar (150) not null,"
                    + "telefone varchar (15),"
                    + "PRIMARY KEY (id));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "piscina("
                    + "id int (10) not null AUTO_INCREMENT,"
                    + "descricao varchar (60) not null,"
                    + "tamanho varchar (10) not null,"
                    + "capacidade varchar (10) not null,"
                    + "PRIMARY KEY (id));");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS "
                    + "mensalidade("
                    + "id int (15) not null AUTO_INCREMENT,"
                    + "nome varchar (50) not null,"
                    + "tipo varchar (20) not null,"
                    + "valor varchar (10) not null,"
                    + "PRIMARY KEY (id));");


            JOptionPane.showMessageDialog(rootPane, "Banco Criado");

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlunos;
    private javax.swing.JButton btFrequencia;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btMatricula;
    private javax.swing.JButton btPiscina;
    private javax.swing.JButton btTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonDesenvolvedores;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuCriarBanco;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
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
    private javax.swing.JRadioButtonMenuItem rbmiFuncionario;
    private javax.swing.JRadioButtonMenuItem rbmiMatricula;
    private javax.swing.JRadioButtonMenuItem rbmiPiscina;
    private javax.swing.JRadioButtonMenuItem rmbiFrequencia;
    private javax.swing.JRadioButtonMenuItem rmbiTurma;
    // End of variables declaration//GEN-END:variables
}
