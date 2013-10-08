/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.AlunoDao;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.DaoGenerics;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Funcionario;
import br.edu.utfpr.cm.tsi.projetointegrador.DAO.FuncionarioDao;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Endereco;
import br.edu.utfpr.cm.tsi.projetointegrador.util.Utilitarios;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.JOptionPane;
import br.edu.utfpr.cm.tsi.projetointegrador.enums.EstadoEnum;
import br.edu.utfpr.cm.tsi.projetointegrador.enums.TipoFuncionarioEnum;
import br.edu.utfpr.cm.tsi.projetointegrador.util.MaskUtil;
import br.edu.utfpr.cm.tsi.projetointegrador.util.ValidadorAlunos;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Daniel
 */
public class CadastroFuncionario extends javax.swing.JDialog {

    boolean edicao = false;
    private FuncionarioDao funcionarioDao;

    public CadastroFuncionario(java.awt.Frame parent, boolean modal) {
        initComponents();
        aplicarMascaras();
        setSize(500, 610);
        setTitle("Cadastro de Funcionarios");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setResizable(false);// Trava o tamanho do painel.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }

    private void aplicarMascaras() {
        MaskUtil mask = new MaskUtil();
        try {
            mask.maskNumeroResidencia(tfNumero);
            mask.maskCep(tfCEP);
            mask.maskCpf(tfCPF);
            mask.maskTelFixo(tfTelefone);

        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setEditFuncionario() {
        tfCodigo.setText(String.valueOf(FuncionarioDao.getFuncionarioSelecionado().getId()));
        tfNome.setText(FuncionarioDao.getFuncionarioSelecionado().getNome());
        tfCPF.setText(FuncionarioDao.getFuncionarioSelecionado().getCpf());
        tfRG.setText(FuncionarioDao.getFuncionarioSelecionado().getRg());

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        tfEndereco.setText(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getNomeEndereco());
        tfNumero.setText(String.valueOf(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getNumero()));
        tfComplemento.setText(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getComplemento());
        tfBairro.setText(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getBairro());
        tfMunicipio.setText(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getMunicipio());
        cbUF.setSelectedItem(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getEstado().getUf());

        tfTelefone.setText(FuncionarioDao.getFuncionarioSelecionado().getTelefone());
        tfCEP.setText(FuncionarioDao.getFuncionarioSelecionado().getEndereco().getCep());

        this.edicao = true;



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbTelefone = new javax.swing.JLabel();
        cbTipoFuncionario = new javax.swing.JComboBox();
        lbProfessor = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        lbCEP = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cbUF = new javax.swing.JComboBox();
        jLabelCadastroFuncionario = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbMunicipio = new javax.swing.JLabel();
        tfMunicipio = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        tfCEP = new javax.swing.JFormattedTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        tfNumero = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lbCodigo.setText("Codigo");

        tfCodigo.setEnabled(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        lbNome.setText("Nome");

        lbCPF.setText("CPF");

        lbRG.setText("RG");

        lbEndereco.setText("Endereço");

        lbTelefone.setText("Telefone");

        cbTipoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(TipoFuncionarioEnum.getTipos()));
        cbTipoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoFuncionarioActionPerformed(evt);
            }
        });

        lbProfessor.setText("Tipo Funcionario");

        lbUF.setText("Estado");

        lbCEP.setText("CEP");

        cbUF.setModel(new javax.swing.DefaultComboBoxModel(EstadoEnum.getUfs()));

        jLabelCadastroFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCadastroFuncionario.setText("Cadastro de Funcionario");

        lbNumero.setText("Numero");

        jLabel1.setText("Complemento");

        lbMunicipio.setText("Municipio");

        lbBairro.setText("Bairro");

        jLabel17.setForeground(new java.awt.Color(51, 0, 204));
        jLabel17.setText("Contato");

        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Dados pessoais ");

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.setFocusable(false);
        btFechar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cadastrar.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.setFocusable(false);
        btGravar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");

        tfNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*Apenas Numeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbMunicipio)
                            .addComponent(lbEndereco)
                            .addComponent(lbTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(tfEndereco)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbUF)
                                        .addComponent(lbBairro))
                                    .addComponent(lbCEP))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbUF, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbNumero)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(btGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFechar)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabelCadastroFuncionario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11)
                                .addGap(10, 10, 10)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCPF)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbRG)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(217, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelCadastroFuncionario)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(lbCPF))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRG)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEndereco)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMunicipio)
                            .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefone)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNumero)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCEP)
                            .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProfessor)
                        .addComponent(cbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btFechar)
                    .addComponent(btGravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

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

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        FuncionarioConsultas dialog = new FuncionarioConsultas(null, true);
        dialog.setLocation(getX() + 50, getY() + 50);
        dialog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed

        String cpfVal = tfCPF.getText().replace(".", "").replace("-", "");

        if (Utilitarios.isCPF(cpfVal)) {
            if (!edicao) {
                try {
                    this.setFuncionario(new Funcionario());
                    JOptionPane.showMessageDialog(null, "Cadastro Efetuado");
                } catch (Exception ex) {
                    Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                try {

                    this.setFuncionario(FuncionarioDao.getFuncionarioSelecionado());
                    JOptionPane.showMessageDialog(null, "Cadastro Atualizado");
                } catch (Exception ex) {
                    Logger.getLogger(CadastroAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "CPF Invalido");
        }



    }//GEN-LAST:event_btGravarActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void cbTipoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoFuncionarioActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario(null, true).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox cbTipoFuncionario;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabelCadastroFuncionario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbProfessor;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCEP;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfNumero;
    private javax.swing.JTextField tfRG;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables

    public Funcionario getFuncionario() {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(tfNome.getText().trim());
        funcionario.setCpf(Utilitarios.formatString(tfCPF.getText().trim()));
        funcionario.setRg(tfRG.getText().trim());
        funcionario.setEndereco(new Endereco());
        funcionario.getEndereco().setNomeEndereco(tfEndereco.getText().trim());
        funcionario.getEndereco().setNumero(Integer.parseInt(tfNumero.getText().trim()));
        funcionario.getEndereco().setComplemento(tfComplemento.getText().trim());
        funcionario.getEndereco().setBairro(tfBairro.getText().trim());
        funcionario.getEndereco().setMunicipio(tfMunicipio.getText().trim());
        funcionario.getEndereco().setEstado(EstadoEnum.getEnum(cbUF.getSelectedItem().toString()));
        funcionario.getEndereco().setCep(Utilitarios.formatString(tfCEP.getText().trim()));
        funcionario.setTelefone(Utilitarios.formatString(tfTelefone.getText().trim()));
        funcionario.setTipofuncionario(TipoFuncionarioEnum.getEnum(cbTipoFuncionario.getSelectedItem().toString()));


        return funcionario;
    }

    private void setFuncionario(Funcionario funcionario) throws ParseException, Exception {
        funcionario.setNome(tfNome.getText().trim());
        funcionario.setCpf(Utilitarios.formatString(tfCPF.getText().trim()));
        funcionario.setRg(tfRG.getText().trim());
        funcionario.setTipofuncionario(TipoFuncionarioEnum.getEnum(cbTipoFuncionario.getModel().getSelectedItem().toString()));
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        funcionario.setEndereco(new Endereco());
        funcionario.getEndereco().setNomeEndereco(tfEndereco.getText().trim());
        funcionario.getEndereco().setNumero(Integer.parseInt(tfNumero.getText().trim().replaceAll("_","")));
        funcionario.getEndereco().setComplemento(tfComplemento.getText().trim());
        funcionario.getEndereco().setBairro(tfBairro.getText().trim());
        funcionario.getEndereco().setMunicipio(tfMunicipio.getText().trim());
        funcionario.getEndereco().setEstado(EstadoEnum.getEnum(cbUF.getSelectedItem().toString()));
        funcionario.getEndereco().setCep(Utilitarios.formatString(tfCEP.getText().trim()));
        funcionario.setTelefone(Utilitarios.formatString(tfTelefone.getText().trim()));


        funcionarioDao = new FuncionarioDao();


        funcionarioDao.saveOrUpdate(funcionario);

    }

    private void limparCampos() {
        tfNome.setText(" ");
        tfCPF.setText(null);
        tfRG.setText(" ");
        tfEndereco.setText(" ");
        tfNumero.setText(" ");
        tfComplemento.setText(" ");
        tfBairro.setText(" ");
        tfMunicipio.setText(" ");
        cbUF.setSelectedIndex(0);
        tfCEP.setText(null);
        tfTelefone.setText(null);
        cbTipoFuncionario.setSelectedIndex(0);
    }
}
