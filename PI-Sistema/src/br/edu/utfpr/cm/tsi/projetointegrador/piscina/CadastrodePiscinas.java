/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.piscina;

import br.edu.utfpr.cm.tsi.projetointegrador.DaosDani.DaoPiscina;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniele
 */
public class CadastrodePiscinas extends javax.swing.JFrame {
    boolean flag;
    /**
     * Creates new form CadastrodePiscinas
     */
    public CadastrodePiscinas() {
        initComponents();
        setSize(500, 610);
        setTitle("Cadastro de Piscinas");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setResizable(false);// Trava o tamanho do painel.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        flag = false;
        jTextCodigo.setEnabled(flag); 
        jTextDescricaoPiscina.setEnabled(flag);
        jTextTamanho.setEnabled(flag);
        jTextCapacidadeAlunos.setEnabled(flag); 
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jRadioCodigoPiscina = new javax.swing.JRadioButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextDescricaoPiscina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTamanho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextCapacidadeAlunos = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cadastro de Piscinas");

        jLabel2.setText("Código ");

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jRadioCodigoPiscina.setText("Código Piscina");
        jRadioCodigoPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCodigoPiscinaActionPerformed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sherlock.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição Piscina");

        jTextDescricaoPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescricaoPiscinaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamanho");

        jTextTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTamanhoActionPerformed(evt);
            }
        });

        jLabel5.setText("Capacidade de Alunos");

        jTextCapacidadeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCapacidadeAlunosActionPerformed(evt);
            }
        });

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New Folder.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Installer.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iDisk.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash Full.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioCodigoPiscina)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextDescricaoPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCapacidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemover)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioCodigoPiscina)
                    .addComponent(jButtonBuscar))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDescricaoPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCapacidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonRemover))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Piscina piscina=new Piscina();
        String Buscar="";
        
        if(jRadioCodigoPiscina.isSelected()){
            piscina.setId(Integer.parseInt(jTextCodigo.getText().trim()));
            Buscar =jTextCodigo.getText();
        }try{
            DaoPiscina.retrieve(Integer.parseInt(Buscar));
            
        }catch (SQLException ex){
            Logger.getLogger(CadastrodePiscinas.class.getName()).log(Level.SEVERE,null, ex);
        }
        try{
            piscina=DaoPiscina.retrieve(Integer.parseInt(Buscar));
        }catch(SQLException ex){
            Logger.getLogger(CadastrodePiscinas.class.getName()).log(Level.SEVERE,null, ex);
        }
        
           setPiscina(piscina);
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextDescricaoPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescricaoPiscinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescricaoPiscinaActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
         Piscina piscina=new Piscina();
            piscina=getPiscina();            
            try{
                
                DaoPiscina.delete(piscina);
            }catch (SQLException ex){
                Logger.getLogger(CadastrodePiscinas.class.getName()).log(Level.SEVERE, null,ex);
    }                                              

  
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jRadioCodigoPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCodigoPiscinaActionPerformed
               flag=true;
               jTextCodigo.setEnabled(flag); 
               jTextDescricaoPiscina.setEnabled(flag);
               jTextTamanho.setEnabled(flag);
               jTextCapacidadeAlunos.setEnabled(flag); 
                
                 
                
                
    }//GEN-LAST:event_jRadioCodigoPiscinaActionPerformed

    private void jTextTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTamanhoActionPerformed

    private void jTextCapacidadeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCapacidadeAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCapacidadeAlunosActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
           flag=true;
           jTextCodigo.setText(null);
           jTextCodigo.setEnabled(false);
           
           jTextDescricaoPiscina.setEnabled(flag);
           jTextTamanho.setEnabled(flag);
           jTextCapacidadeAlunos.setEnabled(flag);
           
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

            Piscina piscina = getPiscina(); 
            
            if(jTextCodigo.isEnabled() == true){
                jTextCodigo.setText(null);
            }try{
                
                DaoPiscina.update(piscina);
            }catch (SQLException ex){
                Logger.getLogger(CadastrodePiscinas.class.getName()).log(Level.SEVERE, null,ex);
                
            } JOptionPane.showMessageDialog(null,"Gravado com sucesso");
            
            
            if(jTextCodigo.isEnabled() == false){
                try{
                    
                    DaoPiscina.insert(piscina);
                }catch (SQLException ex){
                    
                    Logger.getLogger(CadastrodePiscinas.class.getName()).log(Level.SEVERE, null,ex);
                }
                        
            }
                        
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
         Piscina piscina=new Piscina();
            piscina=getPiscina();            
            try{
                
                DaoPiscina.update(piscina);
            }catch (SQLException ex){
                Logger.getLogger(CadastrodePiscinas.class.getName()).log(Level.SEVERE, null,ex);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

  }
    private void setPiscina(Piscina piscina){
        jTextDescricaoPiscina.setText(piscina.getDescricao());
        jTextTamanho.setText(piscina.getTamanho()); 
        jTextCapacidadeAlunos.setText(piscina.getCapacidadeAlunos());
        
        
        
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
            java.util.logging.Logger.getLogger(CadastrodePiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodePiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodePiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodePiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodePiscinas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioCodigoPiscina;
    private javax.swing.JTextField jTextCapacidadeAlunos;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDescricaoPiscina;
    private javax.swing.JTextField jTextTamanho;
    // End of variables declaration//GEN-END:variables

    public Piscina getPiscina() {
        
        Piscina piscina = new Piscina();
        
        piscina.setDescricao(jTextDescricaoPiscina.getText().trim());
        piscina.setTamanho(jTextTamanho.getText().trim());
        piscina.setCapacidadeAlunos(jTextCapacidadeAlunos.getText().trim());
         
        return piscina;
    }
    
    
    public void setPiscina(){
        
        Piscina piscina=new Piscina();
        
        jTextDescricaoPiscina.setText(piscina.getDescricao());
        jTextTamanho.setText(piscina.getTamanho());
        jTextCapacidadeAlunos.setText(piscina.getCapacidadeAlunos());
        
    }
    
    
   // private void setPiscina(Piscina piscina){
        
     //   jTextDescricaoPiscina.setText(piscina.getDescricao());
       // jTextTamanho.setText(piscina.getTamanho()); 
       // jTextCapacidadeAlunos.setText(piscina.getCapacidadeAlunos());
  // }
    
}
