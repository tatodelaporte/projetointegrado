/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;
import br.edu.utfpr.cm.tsi.projetointegrador.control.AlunoController;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.AlunoDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.AlunoTable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniele
 */
public class AlunoConsultas extends javax.swing.JDialog {
     //  private AlunoView alunoView;
       private AlunoTable alunoTable;
       private AlunoDao alunoDao;
       private AlunoController alunoController;
    /**
     * Creates new form JDialogConPessoa
     */
       
    private void refreshTable(){
           try {
               this.alunoTable=new AlunoTable(alunoDao.findAll());
           } catch (Exception ex) {
               Logger.getLogger(AlunoConsultas.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           jTable1.setModel(this.alunoTable);
    }   
    
    
    private AlunoTable getAlunoTable(){
           try {
               this.alunoTable=new AlunoTable(alunoDao.findAll());
           } catch (Exception ex) {
               Logger.getLogger(AlunoConsultas.class.getName()).log(Level.SEVERE, null, ex);
           }
           return this.alunoTable;
    }
    
    public AlunoConsultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.alunoDao=new AlunoDao();
        initComponents();
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
        jLabel2.setText("Consultar Alunos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alunos encontrados");

        jTable1.setModel(getAlunoTable());
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);

        jButton1.setText("Editar");

        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBNome);
        jRBNome.setText("Pesquisa por Nome");

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
                .addContainerGap(18, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int row = jTable1.getSelectedRow();
        if(row >= 0){
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir o Aluno: " + this.alunoTable.getAlunoEntity(row).getNome(), "Excluir aluno", 2);
            if(opcao == 0){
                try{
                    this.alunoDao.delete(this.alunoTable.getAlunoEntity(row));
                    JOptionPane.showMessageDialog(null, "Aluno Excluído com Sucesso!");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Erro ao Excluir Aluno!","Erro",JOptionPane.ERROR_MESSAGE); 
                }                
                refreshTable();                
            }
        }else{
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
   if(jRBCpf.isSelected()){
      this.alunoTable = new AlunoTable(this.alunoController.getAlunoDao().filtrarPorCpf(jTextPesquisando.getText()));
      jTable1.setModel(this.alunoTable);     
      }else if(jRBNome.isSelected()){
          this.alunoTable= new AlunoTable(this.alunoController.getAlunoDao().filterByNome(jTextPesquisando.getText()));
       jTable1.setModel(this.alunoTable);
      }else{
          JOptionPane.showMessageDialog(null, "Por favor selecione uma das pesquisas");
      }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(AlunoConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AlunoConsultas dialog = new AlunoConsultas(new javax.swing.JFrame(), true);
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
