/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;

import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.FuncionarioDao;
import br.edu.utfpr.cm.tsi.projetointegrador.util.Utilitarios;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Daniel
 */
public class CadastroFuncionario extends javax.swing.JDialog {

    MaskFormatter mCPF = new MaskFormatter();

    public CadastroFuncionario() {
        initComponents();
        setSize(500, 610);
        setTitle("Cadastro de Funcionarios");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setResizable(false);// Trava o tamanho do painel.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        tfCPF = new JFormattedTextField(mCPF);
        lbRG = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbFoneCelular = new javax.swing.JLabel();
        tfFoneCelular = new javax.swing.JTextField();
        lbFoneResidencia = new javax.swing.JLabel();
        tfFoneResidencia = new javax.swing.JTextField();
        cbTipoFuncionario = new javax.swing.JComboBox();
        lbProfessor = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        rbCodigoFuncionario = new javax.swing.JRadioButton();
        jToolBar1 = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbCidade = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        lbPrefixo = new javax.swing.JLabel();
        lbCEP = new javax.swing.JLabel();
        tfCEP = new javax.swing.JTextField();
        cbPrefixo = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        cbUF = new javax.swing.JComboBox();
        tfCidade = new javax.swing.JTextField();
        jLabelCadastroFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lbCodigo.setText("Codigo");

        CampoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoActionPerformed(evt);
            }
        });

        lbNome.setText("Nome");

        lbCPF.setText("CPF");

        lbRG.setText("RG");

        lbEndereco.setText("Endereço");

        lbFoneCelular.setText("Celular");

        lbFoneResidencia.setText("Residencia");

        cbTipoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(Funcionario.TipoFuncionario.values()));

        lbProfessor.setText("Tipo Funcionario");

        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sherlock.png"))); // NOI18N
        btConsultar.setText("Buscar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        rbCodigoFuncionario.setText("Codigo Funcionario");
        rbCodigoFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCodigoFuncionarioMouseClicked(evt);
            }
        });
        rbCodigoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoFuncionarioActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New Folder.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gravar.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });
        jToolBar1.add(btGravar);

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Group.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAlterar);

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash Full.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemover);

        lbCidade.setText("Cidade");

        lbUF.setText("UF");

        lbPrefixo.setText("Prefixo");

        lbCEP.setText("CEP");

        cbPrefixo.setModel(new javax.swing.DefaultComboBoxModel(Funcionario.Prefixo.values()));

        cbUF.setModel(new javax.swing.DefaultComboBoxModel(Funcionario.UF.values()));

        jLabelCadastroFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCadastroFuncionario.setText("Cadastro de Funcionario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbFoneCelular)
                                .addComponent(lbFoneResidencia))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfFoneCelular)
                                .addComponent(tfFoneResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGap(107, 107, 107)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbProfessor)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(rbCodigoFuncionario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btConsultar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(51, 51, 51)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbPrefixo)
                                                .addComponent(lbRG))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbPrefixo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfRG)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbEndereco)
                                        .addComponent(lbCEP)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(lbUF)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(cbUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbCidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(tfEndereco)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbCPF)
                                            .addGap(308, 308, 308))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(186, 186, 186)))))
                            .addGap(6, 6, 6)))
                    .addComponent(jLabelCadastroFuncionario))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelCadastroFuncionario)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar)
                    .addComponent(rbCodigoFuncionario))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbCPF))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRG)
                        .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrefixo)
                    .addComponent(lbCEP)
                    .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEndereco))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUF)
                            .addComponent(lbCidade)
                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFoneCelular)
                    .addComponent(tfFoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFoneResidencia)
                        .addComponent(tfFoneResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        Funcionario funcionario = new Funcionario();
        funcionario = getFuncionario();
        if (CampoCodigo.isEnabled() == true) {
            CampoCodigo.setText(null);


            try {
//                new DaoGenerics<Funcionario>(Funcionario.class).persist(getFuncionario());
            } catch (Exception ex) {
                Logger.getLogger(CadastroFuncionario.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Esse Item Foi Alterado com Sucesso!");

        }
        if (CampoCodigo.isEnabled() == false) {
            try {

//                new DaoGenerics<Funcionario>(Funcionario.class).persist(getFuncionario());


                JOptionPane.showMessageDialog(null, "Funcionario Cadastrado");
                limpaCampos();



            } catch (Exception ex) {
                Logger.getLogger(CadastroFuncionario.class
                        .getName()).log(Level.SEVERE, null, ex);
            }


        }
    }//GEN-LAST:event_btGravarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Funcionario funcionario = new Funcionario();
        String codprocurado = " ";

        if (rbCodigoFuncionario.isSelected()) {
            funcionario.setId(Integer.parseInt(CampoCodigo.getText().trim()));
            codprocurado = CampoCodigo.getText();


        }

        try {
            //DaoFuncionario.retrieve(Integer.parseInt(codprocurado));
//            new DaoGenerics<Funcionario>(Funcionario.class).persist(getFuncionario());
        } catch (Exception ex) {
            Logger.getLogger(CadastroFuncionario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        try {
            funcionario = FuncionarioDao.retrieve(Integer.parseInt(codprocurado));


        } catch (SQLException ex) {
            Logger.getLogger(CadastroFuncionario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        // Chama o metodo para preencher o Form com os dados da Consulta
        setFuncionario(funcionario);
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Funcionario funcionario = new Funcionario();
        funcionario = getFuncionario();
        try {
            FuncionarioDao.update(funcionario);


        } catch (SQLException ex) {
            Logger.getLogger(CadastroFuncionario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        //Funcionario funcionario = new Funcionario();
        // funcionario = getFuncionario();
        try {
            FuncionarioDao.delete(getFuncionario());


        } catch (SQLException ex) {
            Logger.getLogger(CadastroFuncionario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btRemoverActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    }//GEN-LAST:event_btNovoActionPerformed

    private void rbCodigoFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCodigoFuncionarioMouseClicked
        
    }//GEN-LAST:event_rbCodigoFuncionarioMouseClicked

    private void CampoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoActionPerformed

    private void rbCodigoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCodigoFuncionarioActionPerformed

    private void tfCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCPFFocusLost
        if (!tfCPF.getText().contains("_")) {
            if (Utilitarios.isCPF(tfCPF.getText())) {
                tfCPF.setForeground(Color.RED);
                JOptionPane.showMessageDialog(this, "CPF inválido ");
            } else {
                tfCPF.setForeground(Color.BLUE);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFFocusLost

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCodigo;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbPrefixo;
    private javax.swing.JComboBox cbTipoFuncionario;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JLabel jLabelCadastroFuncionario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbFoneCelular;
    private javax.swing.JLabel lbFoneResidencia;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPrefixo;
    private javax.swing.JLabel lbProfessor;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbUF;
    private javax.swing.JRadioButton rbCodigoFuncionario;
    private javax.swing.JTextField tfCEP;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfFoneCelular;
    private javax.swing.JTextField tfFoneResidencia;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRG;
    // End of variables declaration//GEN-END:variables

    public Funcionario getFuncionario() {

        Funcionario funcionario = new Funcionario();
        if (CampoCodigo.isEnabled() == true) { //para remover tem que estar aberto/para inserir nao precisa ESTAR ABERTA SO QUANDO VAI REMOVER PARA PUXAR PELO ID
            funcionario.setId(Integer.parseInt(CampoCodigo.getText().trim()));
        }

        funcionario.setNome(tfNome.getText().trim());
        funcionario.setCpf(tfCPF.getText().replace("_", "").replace("-", "").replace(".", "").trim());
        funcionario.setRg(tfRG.getText().trim());
        funcionario.setCep(tfCEP.getText().trim());
        funcionario.setPrefixo(cbPrefixo.getSelectedItem().toString());
        funcionario.setEndereco(tfEndereco.getText().trim());
        funcionario.setUf(cbUF.getSelectedItem().toString());
        funcionario.setCidade(tfCidade.getText().trim());
        funcionario.setFoneCelular(tfFoneCelular.getText().trim());
        funcionario.setFoneResidencia(tfFoneResidencia.getText().trim());
        funcionario.setTipoFuncionario(cbTipoFuncionario.getSelectedItem().toString());


        return funcionario;
    }

    public void setFuncionario() {

        Funcionario funcionario = new Funcionario();

        tfNome.setText(funcionario.getNome());
        tfCPF.setText(funcionario.getCpf());
        tfRG.setText(funcionario.getRg());
        tfCEP.setText(funcionario.getRg());
        cbPrefixo.setSelectedItem(funcionario.getPrefixo());
        tfEndereco.setText(funcionario.getEndereco());
        cbUF.setSelectedItem(funcionario.getUf());
        tfCidade.setText(funcionario.getCidade());
        tfFoneCelular.setText(funcionario.getFoneCelular());
        tfFoneResidencia.setText(funcionario.getFoneResidencia());
        cbTipoFuncionario.setSelectedItem(funcionario.getTipoFuncionario());

    }

    // Usado para preencher o Form com os dados da consulta
    private void setFuncionario(Funcionario funcionario) {
        tfNome.setText(funcionario.getNome());
        tfCPF.setText(funcionario.getCpf());
        tfRG.setText(funcionario.getRg());
        tfCEP.setText(funcionario.getRg());
        cbPrefixo.setSelectedItem(funcionario.getPrefixo());
        tfEndereco.setText(funcionario.getEndereco());
        cbUF.setSelectedItem(funcionario.getUf());
        tfCidade.setText(funcionario.getCidade());
        tfFoneCelular.setText(funcionario.getFoneCelular());
        tfFoneResidencia.setText(funcionario.getFoneResidencia());
        cbTipoFuncionario.setSelectedItem(funcionario.getTipoFuncionario());

    }

    private void limpaCampos() {
        tfNome.setText(null);
        tfCPF.setText(null);
        tfRG.setText(null);
        tfCEP.setText(null);
        cbPrefixo.setSelectedIndex(-1);
        tfEndereco.setText(null);
        cbUF.setSelectedIndex(-1);
        tfCidade.setText(null);
        tfFoneCelular.setText(null);
        tfFoneResidencia.setText(null);
        cbTipoFuncionario.setSelectedIndex(-1);
    }
}
