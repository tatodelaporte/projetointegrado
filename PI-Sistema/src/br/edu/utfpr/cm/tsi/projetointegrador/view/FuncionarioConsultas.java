/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.FuncionarioDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.FuncionarioTable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class FuncionarioConsultas extends javax.swing.JDialog {

    private FuncionarioTable funcionarioTable;
    private FuncionarioDao funcionarioDao;
    private boolean flag = true;
    

    /**
     * Creates new form JDialogConPessoa
     */
    private void refreshTable() {
        try {
            this.funcionarioTable = new FuncionarioTable(funcionarioDao.findAll());
        } catch (Exception ex) {
            Logger.getLogger(FuncionarioConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTable1.setModel(this.funcionarioTable);
    }

    private FuncionarioTable getFuncionarioTable() {
        try {
            this.funcionarioTable = new FuncionarioTable(funcionarioDao.findAll());
        } catch (Exception ex) {
            Logger.getLogger(FuncionarioConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.funcionarioTable;
    }

    public FuncionarioConsultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.funcionarioDao = new FuncionarioDao();
        initComponents();
        jRBNome.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRBNome = new javax.swing.JRadioButton();
        jRBCpf = new javax.swing.JRadioButton();
        jTextPesquisando = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Consultar Funcionarios");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Funcionarios encontrados");

        jTable1.setModel(getFuncionarioTable());
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBNome);
        jRBNome.setText("Pesquisa por Nome");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBCpf);
        jRBCpf.setText("Pesquisa por CPF");
        jRBCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCpfActionPerformed(evt);
            }
        });

        jTextPesquisando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesquisandoActionPerformed(evt);
            }
        });

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextPesquisando)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBNome)
                                .addGap(35, 35, 35)
                                .addComponent(jRBCpf)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jRBCpf))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPesquisando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            funcionarioDao.setFuncionarioSelecionado(this.funcionarioTable.getFuncionarioEntity(row));
            FuncionarioView funcionarioView = new FuncionarioView(null, true);
            funcionarioView.setLocationRelativeTo(null);
            funcionarioView.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Visualizar!");
        }





    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir o Funcionario: " + this.funcionarioTable.getFuncionarioEntity(row).getNome(), "Excluir Funcionario", 2);
            if (opcao == 0) {
                try {
                    this.funcionarioDao.delete(this.funcionarioTable.getFuncionarioEntity(row));
                    JOptionPane.showMessageDialog(null, "Funcionario Excluído com Sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir Funcionario!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                refreshTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Excluir!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRBCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBCpfActionPerformed

    private void jTextPesquisandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesquisandoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        funcionarioDao = new FuncionarioDao();
        if (jRBCpf.isSelected()) {
            this.funcionarioTable = new FuncionarioTable(this.funcionarioDao.filtrarPorCpf(jTextPesquisando.getText()));
            jTable1.setModel(this.funcionarioTable);
        } else if (jRBNome.isSelected()) {
            this.funcionarioTable = new FuncionarioTable(this.funcionarioDao.filterByNome(jTextPesquisando.getText()));
            jTable1.setModel(this.funcionarioTable);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        flag = false;
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            FuncionarioDao.setFuncionarioSelecionado(this.funcionarioTable.getFuncionarioEntity(row));
            CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(null, true);
            cadastroFuncionario.setLocationRelativeTo(null);
            cadastroFuncionario.setVisible(true);
            cadastroFuncionario.setEditFuncionario();
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Visualizar!");
        }
       this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FuncionarioConsultas dialog = new FuncionarioConsultas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBCpf;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextPesquisando;
    // End of variables declaration//GEN-END:variables
}
