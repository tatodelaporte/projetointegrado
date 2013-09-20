/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;

import br.edu.utfpr.cm.tsi.projetointegrador.control.AlunoController;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Endereco;
import java.text.SimpleDateFormat;

/**
 *
 * @author Daniele
 */
public class AlunoView extends javax.swing.JDialog {

    /**
     * Creates new form AlunoView
     */
    
    private AlunoController alunoController;
    
    public AlunoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setTitle("Tela visualização do Cliente");        
        initComponents();
        this.alunoController=new AlunoController();
        setLabel();
    }
    
    public void setLabel() {
     //     jLId.setText(AlunoController.getAlunoSelecionado().getId().ToString());
          jLabelNome.setText(AlunoController.getAlunoSelecionado().getNome().toString());
          jLabelcpf.setText(AlunoController.getAlunoSelecionado().getCpf().toString());
          jLabelrg.setText(AlunoController.getAlunoSelecionado().getRg().toString());
          
          SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
          
          jLabelDataNascimento.setText(format.format(AlunoController.getAlunoSelecionado().getDataNascimento()).toString());
          jLabelEndereco.setText(AlunoController.getAlunoSelecionado().getEndereco().toString());
          jLabelNumero.setText(String.valueOf(AlunoController.getAlunoSelecionado().getEndereco().getNumero()).toString());          
          jLabelComplemento.setText(AlunoController.getAlunoSelecionado().getEndereco().getComplemento().toString());
          jLabelBairro.setText(AlunoController.getAlunoSelecionado().getEndereco().getBairro().toString());
          jLabelMunicipio.setText(AlunoController.getAlunoSelecionado().getEndereco().getMunicipio().toString());
          jLabelEstado.setText(AlunoController.getAlunoSelecionado().getEndereco().getEstado().toString());
          jLabelTelefone.setText(AlunoController.getAlunoSelecionado().getTelefone().toString());
          
         
          
          
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
        jLId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelcpf = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelrg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelMunicipio = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código:");

        jLId.setText("buscando");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Dados pessoais");

        jLabel4.setText("Nome:");

        jLabelNome.setText("buscando");

        jLabel6.setText("CPF:");

        jLabelcpf.setText("buscando");

        jLabel8.setText("RG:");

        jLabelrg.setText("buscando");

        jLabel10.setText("Data Nacimento:");

        jLabelDataNascimento.setText("buscando");

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Contato");

        jLabel13.setText("endereco:");

        jLabelEndereco.setText("buscando");

        jLabel15.setText("numero:");

        jLabelNumero.setText("buscando");

        jLabel17.setText("complemento:");

        jLabelComplemento.setText("buscando");

        jLabel19.setText("municipio:");

        jLabelMunicipio.setText("buscando");

        jLabel21.setText("bairro:");

        jLabelBairro.setText("buscando");

        jLabel23.setText("estado:");

        jLabelEstado.setText("buscando");

        jLabel25.setText("telefone:");

        jLabelTelefone.setText("buscando");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash Full.png"))); // NOI18N
        jButton1.setText("Excluir");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iDisk.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OK.png"))); // NOI18N
        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLId))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelrg)
                            .addComponent(jLabelcpf)
                            .addComponent(jLabelNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDataNascimento))
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEndereco)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMunicipio)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelComplemento)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelBairro)))))
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLId))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelcpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelDataNascimento))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabel15)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabelComplemento)
                    .addComponent(jLabel21)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabelMunicipio)
                    .addComponent(jLabel23)
                    .addComponent(jLabelEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlunoView dialog = new AlunoView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelMunicipio;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelcpf;
    private javax.swing.JLabel jLabelrg;
    // End of variables declaration//GEN-END:variables

    
}
