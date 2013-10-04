/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.HibernateConfiguration;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Turma;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.FuncionarioDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.PiscinaDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.EXCLUIRISSO;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.DaoGenerics;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Piscina;
import br.edu.utfpr.cm.tsi.projetointegrador.enums.TipoFuncionarioEnum;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CadastroTurmas extends javax.swing.JDialog {

    private String diasaula = "";

    /**
     * Creates new form CadastroTurmas
     */
    public CadastroTurmas() throws SQLException, Exception {
        initComponents();
        setSize(500, 610);
        setTitle("Cadastro de Turmas");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        //preencherPiscina();
        preencherProfessor();

        setResizable(false);// Trava o tamanho do painel.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        cbProfessor = new javax.swing.JComboBox();
        tfhorarioInicio = new javax.swing.JFormattedTextField();
        tfhorarioFim = new javax.swing.JFormattedTextField();
        cbPiscina = new javax.swing.JComboBox();
        btGravar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisar.png"))); // NOI18N
        btBuscar.setText("Pesquisar");
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

        cbProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tfhorarioInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        tfhorarioFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        cbPiscina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cadastrar.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(cbQuartaFeira)))
                    .addComponent(cbDomingo))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGravar)
                .addGap(18, 18, 18)
                .addComponent(btFechar)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
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
                    .addComponent(jLabel1)
                    .addComponent(cbPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFechar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        Turma turma = new Turma();

        String codprocurado = "";

        if (this.rbBuscarTurmaId.isSelected()) {

            turma.setId(Integer.parseInt(tfId.getText().trim()));
            codprocurado = tfId.getText();
        }
        try {
//            new HibernateDao().retrieve(codprocurado);
        } catch (Exception ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
        }



        tfId.setText(String.valueOf(turma.getId()));
        tfDescricao.setText(turma.getDescricao());
        tfhorarioInicio.setText(turma.getHorarioInicio().toString());
        tfhorarioFim.setText(turma.getHorariofim().toString());
        diasaula = turma.getDiaAula();


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

    private void rbBuscarTurmaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBuscarTurmaIdActionPerformed
        tfId.setEnabled(true);

    }//GEN-LAST:event_rbBuscarTurmaIdActionPerformed

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

        try {

            new DaoGenerics<Turma>(Turma.class) {
            }.saveOrUpdate(getTurma());
            JOptionPane.showMessageDialog(null, "Turma Cadastrado");
        } catch (Exception ex) {
            Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btGravarActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

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
                try {
                    new CadastroTurmas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(CadastroTurmas.class.getName()).log(Level.SEVERE, null, ex);
                }


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btGravar;
    private javax.swing.JCheckBox cbDomingo;
    private javax.swing.JComboBox cbPiscina;
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
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbcodTurma;
    private javax.swing.JLabel lbhorarioFim;
    private javax.swing.JLabel lbhorarioInicio;
    private javax.swing.JRadioButton rbBuscarTurmaId;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfId;
    private javax.swing.JFormattedTextField tfhorarioFim;
    private javax.swing.JFormattedTextField tfhorarioInicio;
    // End of variables declaration//GEN-END:variables

    public Turma getTurma() {

        Turma turma = new Turma();
//        if (tfId.isEnabled()) {
//            turma.setId(Integer.parseInt(tfId.getText().trim()));
//        } else {
//            turma.setId(0);
//
//        }


        turma.setDescricao(tfDescricao.getText().trim());
        turma.setPiscina((Piscina) cbPiscina.getSelectedItem());
        turma.setProfessor((Funcionario) cbProfessor.getSelectedItem());
        turma.setHorarioInicio((Date) tfhorarioInicio.getValue());
        turma.setHorarioFim((Date) tfhorarioFim.getValue());
        turma.setDiaAula(diasaula);

        return turma;

    }

    private void setTurma(Turma turma) {

        //tfId.setText("1");
        tfDescricao.setText(turma.getDescricao());

        tfhorarioInicio.setValue(turma.getHorarioInicio());
        tfhorarioFim.setValue(turma.getHorariofim());

    }

    public void preencherProfessor() throws Exception {

        String professor = "3";
        FuncionarioDao f = new FuncionarioDao();

        cbProfessor.addItem(f.filterByTipo(professor));

//        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
//
//        //funcionarios = FuncionarioDao.list();
//        funcionarios = new DaoGenerics<Funcionario>(Funcionario.class) {
//        }.list();
//
//        for (Funcionario f : funcionarios) {
//            if ("3".equals(f.getTipofuncionario())) {
//                cbProfessor.addItem(f);
//            }
//        }
    }

    public void preencherPiscina() throws SQLException {

        cbPiscina.removeAllItems();
        cbPiscina.removeAll();

        List<Piscina> piscinas = null;

        piscinas = PiscinaDao.list();

        for (Piscina p : piscinas) {

            cbPiscina.addItem(p);
        }
    }
}
