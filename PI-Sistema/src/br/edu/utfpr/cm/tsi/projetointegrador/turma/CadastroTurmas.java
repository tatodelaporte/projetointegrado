/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.turma;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.DaoFuncionario;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.DaoTurma;
import br.edu.utfpr.cm.tsi.projetointegrador.funcionario.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.matricula.CadastroMatricula;
import java.sql.SQLException;
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CadastroTurmas extends javax.swing.JFrame {

    private String diasaula = "";

    /**
     * Creates new form CadastroTurmas
     */
    public CadastroTurmas() {
        initComponents();
        setSize(500, 610);
        setTitle("Cadastro de Turmas");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        preencherProfessor();
        setResizable(false);// Trava o tamanho do painel.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Setando os campos todos desabilitados
        tfId.setEnabled(false);
        tfDescricao.setEnabled(false);
        tfcodPiscina.setEnabled(false);
        cbProfessor.setEnabled(false);
        tfhorarioInicio.setEnabled(false);
        tfhorarioFim.setEnabled(false);
        cbSegundaFeira.setEnabled(false);
        cbTercaFeira.setEnabled(false);
        cbQuartaFeira.setEnabled(false);
        cbQuintaFeira.setEnabled(false);
        cbSextaFeira.setEnabled(false);
        cbSabado.setEnabled(false);
        cbDomingo.setEnabled(false);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfcodPiscina = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbcodTurma = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        lbHorario = new javax.swing.JLabel();
        lbhorarioInicio = new javax.swing.JLabel();
        lbhorarioFim = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        rbBuscarTurmaId = new javax.swing.JRadioButton();
        btBuscar = new javax.swing.JButton();
        cbSegundaFeira = new javax.swing.JCheckBox();
        cbTercaFeira = new javax.swing.JCheckBox();
        cbQuartaFeira = new javax.swing.JCheckBox();
        cbQuintaFeira = new javax.swing.JCheckBox();
        cbSextaFeira = new javax.swing.JCheckBox();
        cbSabado = new javax.swing.JCheckBox();
        cbDomingo = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        cbProfessor = new javax.swing.JComboBox();
        tfhorarioInicio = new javax.swing.JFormattedTextField();
        tfhorarioFim = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Turmas");

        lbDescricao.setText("Descrição");

        jLabel1.setText("Codigo Piscina");

        jLabel2.setText("Codigo Professor");

        lbcodTurma.setText("Codigo Turma");

        lbHorario.setText("Horario");

        lbhorarioInicio.setText("Inicio");

        lbhorarioFim.setText("Fim");

        rbBuscarTurmaId.setText("Codigo Turma");
        rbBuscarTurmaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBuscarTurmaIdActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sherlock.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cbSegundaFeira.setText("Segunda-Feira");

        cbTercaFeira.setText("Terça-Feira");

        cbQuartaFeira.setText("Quarta - Feira");

        cbQuintaFeira.setText("Quinta - Feira");

        cbSextaFeira.setText("Sexta - Feira");

        cbSabado.setText("Sabado");

        cbDomingo.setText("Domingo");

        jToolBar1.setRollover(true);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New Folder.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iDisk.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAlterar);

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Installer.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });
        jToolBar1.add(btGravar);

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash Full.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemover);

        cbProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tfhorarioInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        tfhorarioFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDomingo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcodPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbHorario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbhorarioInicio)
                            .addComponent(lbhorarioFim))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfhorarioInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(tfhorarioFim)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbcodTurma)
                        .addGap(18, 18, 18)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rbBuscarTurmaId)
                        .addGap(30, 30, 30)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDescricao)
                        .addGap(38, 38, 38)
                        .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSegundaFeira)
                            .addComponent(cbQuintaFeira))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTercaFeira)
                            .addComponent(cbSextaFeira))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSabado)
                            .addComponent(cbQuartaFeira))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcodTurma)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbBuscarTurmaId)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfcodPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbHorario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhorarioInicio)
                    .addComponent(tfhorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhorarioFim)
                    .addComponent(tfhorarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSegundaFeira)
                    .addComponent(cbTercaFeira)
                    .addComponent(cbQuartaFeira))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbQuintaFeira)
                    .addComponent(cbSextaFeira)
                    .addComponent(cbSabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDomingo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed



        boolean segunda = this.cbSegundaFeira.isSelected();
        boolean terca = this.cbTercaFeira.isSelected();
        boolean quarta = this.cbQuartaFeira.isSelected();
        boolean quinta = this.cbQuintaFeira.isSelected();
        boolean sexta = this.cbSextaFeira.isSelected();
        boolean sabado = this.cbSabado.isSelected();
        boolean domingo = this.cbDomingo.isSelected();

        diasaula = "";
        if (segunda) {
            diasaula = diasaula.concat("Segunda|");
        }
        if (terca) {
            diasaula = diasaula.concat("Terca|");
        }

        if (quarta) {
            diasaula = diasaula.concat("Quarta|");
        }

        if (quinta) {
            diasaula = diasaula.concat("Quinta|");
        }

        if (sexta) {
            diasaula = diasaula.concat("Sexta|");
        }

        if (sabado) {
            diasaula = diasaula.concat("Sabado|");
        }

        if (domingo) {
            diasaula = diasaula.concat("Domingo|");
        }


        Turma turma = new Turma();
        turma = getTurma();

        try {

            DaoTurma.insert(turma);

        } catch (SQLException ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btGravarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        Turma turma = new Turma();

        String codprocurado = "";

        if (this.rbBuscarTurmaId.isSelected()) {

            turma.setId(Integer.parseInt(tfId.getText().trim()));
            codprocurado = tfId.getText();
        }
        /*if (rbBuscarTurmaId.isSelected()) {
         if (rb.isSelected()) {
         // turma.setDescricao(tfDescricao.getText().trim());
         codprocurado = tfDescricao.getText();
         tfDescricao.setEnabled(true);
         } else {
         //turma.setId(Integer.parseInt(tfId.getText().trim()));
         codprocurado = tfId.getText();
         tfId.setEnabled(true);
         }
          
         */
        try {
            DaoTurma.retrieve(Integer.parseInt(codprocurado));
        } catch (SQLException ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            turma = DaoTurma.retrieve(Integer.parseInt(codprocurado));
        } catch (SQLException ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
        }


        tfId.setText(String.valueOf(turma.getId()));
        tfDescricao.setText(turma.getDescricao());
        tfcodPiscina.setText(String.valueOf(turma.getPiscina()));
        tfhorarioInicio.setText(turma.getHorarioInicio().toString());
        tfhorarioFim.setText(turma.getHorariofim().toString());
        diasaula = turma.getDiaAula();
        //JOptionPane.showMessageDialog(rootPane, "Dias de Aula " + diasaula); // Debug da Consulta

        if (diasaula.indexOf("Segunda") >= 0) {
            cbSegundaFeira.setSelected(true);
        }
        if (diasaula.indexOf("Terca") >= 0) {
            cbTercaFeira.setSelected(true);
        }
        if (diasaula.indexOf("Quarta") >= 0) {
            cbQuartaFeira.setSelected(true);
        }
        if (diasaula.indexOf("Quinta") >= 0) {
            cbQuintaFeira.setSelected(true);
        }
        if (diasaula.indexOf("Sexta") >= 0) {
            cbSextaFeira.setSelected(true);
        }
        if (diasaula.indexOf("Sabado") >= 0) {
            cbSabado.setSelected(true);
        }
        if (diasaula.indexOf("Domingo") >= 0) {
            cbDomingo.setSelected(true);
        }

        /* turma.setId(Integer.parseInt(tfId.getText().trim()));
         turma.setDescricao(tfDescricao.getText().trim());
         turma.setPiscina(Integer.parseInt(tfcodPiscina.getText().trim()));
         turma.setProfessor(Integer.parseInt(tfcodProfessor.getText().trim()));
         turma.setHorarioInicio(tfhorarioInicio.getText().trim());
         turma.setHorarioFim(tfhorarioFim.getText().trim());
         turma.setDiaAula(diasaula);
         */



    }//GEN-LAST:event_btBuscarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        boolean segunda = this.cbSegundaFeira.isSelected();
        boolean terca = this.cbTercaFeira.isSelected();
        boolean quarta = this.cbQuartaFeira.isSelected();
        boolean quinta = this.cbQuintaFeira.isSelected();
        boolean sexta = this.cbSextaFeira.isSelected();
        boolean sabado = this.cbSabado.isSelected();
        boolean domingo = this.cbDomingo.isSelected();

        diasaula = "";
        if (segunda) {
            diasaula = diasaula.concat("Segunda|");
        }
        if (terca) {
            diasaula = diasaula.concat("Terca|");
        }

        if (quarta) {
            diasaula = diasaula.concat("Quarta|");
        }

        if (quinta) {
            diasaula = diasaula.concat("Quinta|");
        }

        if (sexta) {
            diasaula = diasaula.concat("Sexta|");
        }

        if (sabado) {
            diasaula = diasaula.concat("Sabado|");
        }

        if (domingo) {
            diasaula = diasaula.concat("Domingo|");
        }

        Turma turma = new Turma();
        turma = getTurma();
        try {

            DaoTurma.update(turma);

        } catch (SQLException ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed

        Turma turma = new Turma();
        turma = getTurma();
        try {

            DaoTurma.delete(turma);

        } catch (SQLException ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btRemoverActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        tfId.setText(null);
        tfDescricao.setText(null);
        tfcodPiscina.setText(null);

        tfhorarioInicio.setText(null);
        tfhorarioFim.setText(null);
        cbSegundaFeira.setSelected(false);
        cbTercaFeira.setSelected(false);
        cbQuartaFeira.setSelected(false);
        cbQuintaFeira.setSelected(false);
        cbSextaFeira.setSelected(false);
        cbSabado.setSelected(false);
        cbDomingo.setSelected(false);
        rbBuscarTurmaId.setSelected(false);

        tfId.setEnabled(false);
        tfDescricao.setEnabled(true);
        tfcodPiscina.setEnabled(true);
        cbProfessor.setEnabled(true);
        tfhorarioInicio.setEnabled(true);
        tfhorarioFim.setEnabled(true);
        cbSegundaFeira.setEnabled(true);
        cbTercaFeira.setEnabled(true);
        cbQuartaFeira.setEnabled(true);
        cbQuintaFeira.setEnabled(true);
        cbSextaFeira.setEnabled(true);
        cbSabado.setEnabled(true);
        cbDomingo.setEnabled(true);

    }//GEN-LAST:event_btNovoActionPerformed

    private void rbBuscarTurmaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBuscarTurmaIdActionPerformed
        tfId.setEnabled(true);

    }//GEN-LAST:event_rbBuscarTurmaIdActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTurmas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemover;
    private javax.swing.JCheckBox cbDomingo;
    private javax.swing.JComboBox cbProfessor;
    private javax.swing.JCheckBox cbQuartaFeira;
    private javax.swing.JCheckBox cbQuintaFeira;
    private javax.swing.JCheckBox cbSabado;
    private javax.swing.JCheckBox cbSegundaFeira;
    private javax.swing.JCheckBox cbSextaFeira;
    private javax.swing.JCheckBox cbTercaFeira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbcodTurma;
    private javax.swing.JLabel lbhorarioFim;
    private javax.swing.JLabel lbhorarioInicio;
    private javax.swing.JRadioButton rbBuscarTurmaId;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfcodPiscina;
    private javax.swing.JFormattedTextField tfhorarioFim;
    private javax.swing.JFormattedTextField tfhorarioInicio;
    // End of variables declaration//GEN-END:variables

    public Turma getTurma() {

        Turma turma = new Turma();
        if (tfId.isEnabled()) {
            turma.setId(Integer.parseInt(tfId.getText().trim()));
        } else {
            turma.setId(Integer.parseInt("1"));
        }


        turma.setDescricao(tfDescricao.getText().trim());
        turma.setPiscina(Integer.parseInt(tfcodPiscina.getText().trim()));
        //turma.setProfessor(Integer.parseInt(tfcodProfessor.getText().trim()));
        turma.setProfessor((Funcionario) cbProfessor.getSelectedItem());
        turma.setHorarioInicio((Date) tfhorarioInicio.getValue());
        turma.setHorarioFim((Date) tfhorarioFim.getValue());
        turma.setDiaAula(diasaula);

        return turma;

    }

    private void setTurma(Turma turma) {

        //tfId.setText("1");
        tfDescricao.setText(turma.getDescricao());
        tfcodPiscina.setText(String.valueOf(turma.getPiscina()));
        tfhorarioInicio.setValue(turma.getHorarioInicio());
        tfhorarioFim.setValue(turma.getHorariofim());

    }

    public void preencherProfessor() {

        cbProfessor.removeAllItems();
        cbProfessor.removeAll();

        List<Funcionario> funcionarios = null;
        try {
            funcionarios = DaoFuncionario.list();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Funcionario f : funcionarios) {
            if ("Professor".equals(f.getTipoFuncionario())) {
                cbProfessor.addItem(f);
            }
        }
    }
}

