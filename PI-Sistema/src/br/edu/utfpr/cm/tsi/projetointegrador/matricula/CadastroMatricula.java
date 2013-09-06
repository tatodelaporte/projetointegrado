/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.matricula;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.DaoTurma;
import br.edu.utfpr.cm.tsi.projetointegrador.DaosDani.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.DaosDani.DaoAluno;
import br.edu.utfpr.cm.tsi.projetointegrador.turma.Turma;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class CadastroMatricula extends javax.swing.JDialog {

    /**
     * Creates new form Matricula
     */
    public CadastroMatricula() {
        initComponents();
        setSize(500, 610);
        setTitle("Cadastro de Matriculas");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setResizable(false);// Trava o tamanho do painel.
        preencherTurma();
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

        btGSituacao = new javax.swing.ButtonGroup();
        btBuscar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbAluno = new javax.swing.JLabel();
        tfAluno = new javax.swing.JTextField();
        lbTurma = new javax.swing.JLabel();
        lbMensalidade = new javax.swing.JLabel();
        tfMensalidade = new javax.swing.JTextField();
        rbAtivo = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();
        lbSituacao = new javax.swing.JLabel();
        cbTurma = new javax.swing.JComboBox();
        cbAluno = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sherlock.png"))); // NOI18N
        btBuscar.setText("Buscar");

        lbCodigo.setText("Codigo");

        jToolBar1.setRollover(true);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New Folder.png"))); // NOI18N
        btNovo.setText("Novo");
        jToolBar1.add(btNovo);

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Installer.png"))); // NOI18N
        btGravar.setText("Gravar");
        jToolBar1.add(btGravar);

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iDisk.png"))); // NOI18N
        btAlterar.setText("Alterar");
        jToolBar1.add(btAlterar);

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash Full.png"))); // NOI18N
        btRemover.setText("Remover");
        jToolBar1.add(btRemover);

        lbAluno.setText("Aluno");

        lbTurma.setText("Turma");

        lbMensalidade.setText("Mensalidade");

        btGSituacao.add(rbAtivo);
        rbAtivo.setText("Ativo");

        btGSituacao.add(rbInativo);
        rbInativo.setText("Inativo");

        lbSituacao.setText("Situação");

        cbTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMensalidade)
                    .addComponent(lbTurma)
                    .addComponent(lbAluno)
                    .addComponent(lbCodigo)
                    .addComponent(lbSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(rbInativo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbTurma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(tfAluno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMensalidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAluno)
                    .addComponent(tfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTurma)
                    .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMensalidade)
                    .addComponent(tfMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAtivo)
                    .addComponent(rbInativo)
                    .addComponent(lbSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMatricula().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.ButtonGroup btGSituacao;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbAluno;
    private javax.swing.JComboBox cbTurma;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbAluno;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbMensalidade;
    private javax.swing.JLabel lbSituacao;
    private javax.swing.JLabel lbTurma;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbInativo;
    private javax.swing.JTextField tfAluno;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfMensalidade;
    // End of variables declaration//GEN-END:variables

    public void preencherTurma() {
        
        cbTurma.removeAllItems();
        cbTurma.removeAll();
        
        List<Turma> turmas = null;
        try {
            turmas = DaoTurma.list();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Turma t : turmas) {
            cbTurma.addItem(t);
        }
        
    }
    
    public void preecherAluno() {
        cbAluno.removeAll();
        cbAluno.removeAllItems();
      
        List<Aluno> alunos = null;
        try {
            alunos = DaoAluno.list();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Aluno a : alunos) {
            cbAluno.addItem(a);
        }
        
    }
}