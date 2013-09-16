/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.view;

import br.edu.utfpr.cm.tsi.projetointegrador.DAO.AlunoDao;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Aluno;
import br.edu.utfpr.cm.tsi.projetointegrador.entidade.Endereco;
import br.edu.utfpr.cm.tsi.projetointegrador.enums.EstadoEnum;
import br.edu.utfpr.cm.tsi.projetointegrador.util.ValidadorAlunos;
import com.mysql.jdbc.Util;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jcp.xml.dsig.internal.dom.Utils;

/**
 *
 * @author Daniele
 */
public class CadastroAlunos extends javax.swing.JDialog {

    private AlunoDao alunoDao;
    MaskFormatter mCPF = new MaskFormatter();
    //   ValidadorAlunos valida=new ValidadorAlunos();
    boolean flag;

    /**
     * Creates new form CadastroAlunos
     */
    public CadastroAlunos() {
        initComponents();

        try {

            mCPF.setMask("###.###.###-##");
            mCPF.setPlaceholderCharacter('_');

        } catch (ParseException ex) {
        }


        setSize(500, 610);
        setTitle("Cadastro de Alunos");
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        flag = false;
        //  CampoCodigo.setEnabled(flag);
//        jTextNome.setEnabled(flag);
//        jTextCPF.setEnabled(flag);
//        jTextEndereco.setEnabled(flag);
//        jTextNumero.setEnabled(flag);
//        jTextTelefone.setEnabled(flag);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jTextTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextRG = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextDataNascimento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextMunicipio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboEstado = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Alunos");

        jLabel3.setText("Nome");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });
        jTextNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNomeFocusLost(evt);
            }
        });
        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomeKeyTyped(evt);
            }
        });

        jLabel4.setText("CPF");

        jLabel5.setText("Endereço");

        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone");

        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Installer.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        try {
            jTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTelefoneFocusLost(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("*");

        jTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCPFActionPerformed(evt);
            }
        });
        jTextCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCPFFocusLost(evt);
            }
        });

        jLabel8.setText("Número");

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setText("RG");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        jTextRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRGActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Nascimento");

        jTextDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataNascimentoActionPerformed(evt);
            }
        });

        jLabel12.setText("Complemento");

        jLabel13.setText("Bairro");

        jLabel14.setText("Municipio");

        jLabel15.setText("Estado");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OK.png"))); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel(EstadoEnum.getUfs()));
        jComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstadoActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Dados pessoais ");

        jLabel17.setForeground(new java.awt.Color(51, 0, 204));
        jLabel17.setText("Contato");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonGravar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel8))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                .addComponent(jTextMunicipio)
                                                .addComponent(jTextTelefone))
                                            .addGap(112, 112, 112)
                                            .addComponent(jLabel13)))
                                    .addGap(185, 185, 185))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextRG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(145, 145, 145))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(61, 61, 61)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGravar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        //if (jTextNome.getText().equals("   ")) {
        //  JOptionPane.showMessageDialog(null, "Por favor coloque seu nome");
        //jTextNom
        // jTextNome.addActionListener(new ActionListener(){  
        //    public void ActionPerformed(ActionEvent e){  
        //    if(jtextfield.getText().isEmpty()){  
        //        JOptionPane.showMessageDialog(null, "Inválido", "Erro", JOptionPane.ERROR_MESSAGE);  
        //   } else {  
        //Passou na validação  
        //Faz algo aqui  
        //  }  
        //  }  
//});  
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnderecoActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
//        alunoDao = new AlunoDao();
        try {
            alunoDao = new AlunoDao();
            alunoDao.persist(getAluno());
        } catch (Exception ex) {
            Logger.getLogger(CadastroAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparCampos();


    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jTextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyTyped
    }//GEN-LAST:event_jTextNomeKeyTyped

    private void jTextCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCPFFocusLost
//        if (!jTextCPF.getText().contains("_")) {
//            if (!ValidadorAlunos.isCPF(jTextCPF.getText())) {
//                jTextCPF.setForeground(Color.RED);
//                JOptionPane.showMessageDialog(this, "CPF inválido ");
//                jTextCPF.requestFocus();
//            } else {
//                jTextCPF.setForeground(Color.BLUE);
//
//            }
//        }
    }//GEN-LAST:event_jTextCPFFocusLost

    private void jTextTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTelefoneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefoneFocusLost

    private void jTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCPFActionPerformed

    private void jTextNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNomeFocusLost
//           if(jTextNome.getText().isEmpty()){
//          JOptionPane.showMessageDialog(null, "Campo NOME  \n esta em branco!!", "Atenção", JOptionPane.ERROR_MESSAGE);
//            jTextNome.requestFocus();
//       }else{
//           KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();  
//            manager.focusNextComponent();  
//       }
    }//GEN-LAST:event_jTextNomeFocusLost

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void jTextDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataNascimentoActionPerformed

    private void jComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRGActionPerformed

//    public void setAluno(Aluno aluno) {
//        //   Aluno aluno=new Aluno();
//
//        jTextNome.setText(aluno.getNome());
//        jTextCPF.setText(aluno.getCpf());
//        jTextEndereco.setText(aluno.getEndereco().getNomeEndereco());
//        jTextNumero.setText(String.valueOf(aluno.getEndereco().getNumero()));
//        jTextTelefone.setText(aluno.getTelefone());
//}
    public void setAluno() {
        Aluno aluno = new Aluno();

        jTextNome.setText(aluno.getNome());
        jTextCPF.setText(aluno.getCpf());
        jTextRG.setText(aluno.getRg());

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
//      data.format(aluno.getDataNascimento())
//      aluno.setDataNascimento(data.parse(jTextDataNascimento.getText().trim()));
        jTextDataNascimento.setText(data.format(aluno.getDataNascimento()));
        jTextEndereco.setText(aluno.getEndereco().getNomeEndereco());
        jTextNumero.setText(String.valueOf(aluno.getEndereco().getNumero()));
        jTextComplemento.setText(String.valueOf(aluno.getEndereco().getComplemento()));
        jTextBairro.setText(String.valueOf(aluno.getEndereco().getBairro()));
        jTextMunicipio.setText(String.valueOf(aluno.getEndereco().getMunicipio()));
        jComboEstado.setSelectedItem(aluno.getEndereco().getEstado().toString());
        jTextTelefone.setText(aluno.getTelefone());

    }

    public Aluno getAluno() {
        Aluno aluno = new Aluno();

//        if (CampoCodigo.isEnabled() == true) { //para remover tem q estar aberto /p novo nao
//            aluno.setId(Integer.parseInt(CampoCodigo.getText().trim()));
//        }

        aluno.setNome(jTextNome.getText().trim());
        aluno.setCpf(jTextCPF.getText().trim());
        aluno.setRg(jTextRG.getText().trim());
//        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
//        data.format(null);
        Date data = null;

        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(jTextDataNascimento.getText());
        } catch (ParseException ex) {
            Logger.getLogger(CadastroAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }


        aluno.setDataNascimento(data);
        aluno.setEndereco(new Endereco());
        aluno.getEndereco().setNomeEndereco(jTextEndereco.getText().trim());
        aluno.getEndereco().setNumero(Integer.parseInt(jTextNumero.getText().trim()));
        aluno.getEndereco().setComplemento(jTextComplemento.getText().trim());
        aluno.getEndereco().setBairro(jTextBairro.getText().trim());
        aluno.getEndereco().setMunicipio(jTextMunicipio.getText().trim());
        aluno.getEndereco().setEstado(EstadoEnum.getEnum(jComboEstado.getSelectedItem().toString()));
        aluno.setTelefone(jTextTelefone.getText().trim());


        return aluno;

    }

    private void limparCampos() {
        jTextNome.setText(null);
        jTextCPF.setText(null);
        jTextRG.setText(null);
//       jTextDataNascimento(Date.parse(null));
        jTextEndereco.setText(null);
        jTextNumero.setText(null);
        jTextNumero.setText(null);
        jTextComplemento.setText(null);
        jTextBairro.setText(null);
        jTextMunicipio.setText(null);
//       jTextEstado.setText(null);
        jTextTelefone.setText(null);
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
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox jComboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextComplemento;
    private javax.swing.JTextField jTextDataNascimento;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextMunicipio;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextRG;
    private javax.swing.JFormattedTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
