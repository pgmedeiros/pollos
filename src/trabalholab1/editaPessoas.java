/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholab1;

import Banco.Conector;
import Banco.PessoasDB;
import models.Pessoas;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class editaPessoas extends javax.swing.JFrame {

    /**
     * Creates new form editaPessoas
     */
    public editaPessoas(int id) {
         initComponents();
        // Para fechar a janela e não o sistema
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        Conector db = new Conector();
        PessoasDB pessoa = new PessoasDB(db);
        Pessoas cli = pessoa.buscaFuncionarioUnico(id);
        jTextFieldFormNome.setText(cli.getNome());
        jTextFieldFormCpf.setText(cli.getCpf());
        jTextFieldFormTelefone.setText(cli.getTelefone());
        jTextFieldFormEndereco.setText(cli.getEndereco());
        jTextAreaObservacoes.setText(cli.getObs());
        jTextFieldFormEmail.setText(cli.getEmail());
        String idade = Integer.toString(cli.getIdade());
        jTextFieldFormIdade.setText(idade);
        String idfinal = Integer.toString(cli.getId());
        jTextFieldFormId.setText(idfinal);
    }

    private editaPessoas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacoes = new javax.swing.JTextArea();
        jTextFieldFormCpf = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldFormId = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldFormNome = new javax.swing.JTextField();
        jButtonCadastraFuncionario = new javax.swing.JButton();
        jTextFieldFormTelefone = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldFormEmail = new javax.swing.JTextField();
        jTextFieldFormEndereco = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldFormIdade = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jRadioButtonCliente = new javax.swing.JRadioButton();
        jRadioButtonFuncionario = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel24.setText("Nome:");

        jLabel28.setText("Idade:");

        jTextAreaObservacoes.setColumns(20);
        jTextAreaObservacoes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacoes);

        jTextFieldFormCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormCpfActionPerformed(evt);
            }
        });

        jLabel29.setText("Observações:");

        jLabel25.setText("Telefone:");

        jTextFieldFormId.setEditable(false);
        jTextFieldFormId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormIdActionPerformed(evt);
            }
        });

        jLabel26.setText("E-mail:");

        jTextFieldFormNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormNomeActionPerformed(evt);
            }
        });

        jButtonCadastraFuncionario.setText("Atualizar");
        jButtonCadastraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraFuncionarioActionPerformed(evt);
            }
        });

        jTextFieldFormTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormTelefoneActionPerformed(evt);
            }
        });

        jLabel27.setText("Endereço:");

        jTextFieldFormEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormEmailActionPerformed(evt);
            }
        });

        jTextFieldFormEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormEnderecoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Atualizar  Cadastro");

        jTextFieldFormIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormIdadeActionPerformed(evt);
            }
        });

        jLabel30.setText("CPF:");

        buttonGroup1.add(jRadioButtonCliente);
        jRadioButtonCliente.setSelected(true);
        jRadioButtonCliente.setText("Cliente");
        jRadioButtonCliente.setActionCommand("cliente");

        buttonGroup1.add(jRadioButtonFuncionario);
        jRadioButtonFuncionario.setText("Funcionário");
        jRadioButtonFuncionario.setActionCommand("funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCadastraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFormCpf)
                            .addComponent(jTextFieldFormNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFormIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFormEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFormTelefone)
                            .addComponent(jTextFieldFormEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonCliente)
                                .addGap(92, 92, 92)
                                .addComponent(jRadioButtonFuncionario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFormId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldFormId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCliente)
                    .addComponent(jRadioButtonFuncionario))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFormNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFormCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFormTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFormEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFormEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFormIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastraFuncionario)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFormCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormCpfActionPerformed

    private void jTextFieldFormIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormIdActionPerformed

    private void jTextFieldFormNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormNomeActionPerformed

    private void jButtonCadastraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraFuncionarioActionPerformed
        // Aqui chamamos a classe dados e atribuimos a cliente
        Conector db = new Conector();
        PessoasDB pes = new PessoasDB(db);
        int funcionario;
        boolean radio = jRadioButtonCliente.isSelected();
        // Declaramos as variáveis e pegamos os valores dos campos com o método getText
        String nome = jTextFieldFormNome.getText();
        String cpf = jTextFieldFormCpf.getText();
        String telefone = jTextFieldFormTelefone.getText();
        String endereco = jTextFieldFormEndereco.getText();
        String obs = jTextAreaObservacoes.getText();
        String email = jTextFieldFormEmail.getText();
        int id = Integer.parseInt(jTextFieldFormId.getText());
        // Como idade é um inteiro parseamos o valor do campo que é texto para inteiro
        int idade = Integer.parseInt(jTextFieldFormIdade.getText());
        if(radio == true){
            funcionario = 0;
        }else{
            funcionario = 1;
        }
        // Declaramos uma variável para pegar o retorno da chamada da função que fica dentro da classe Dados
        String retorno = pes.updatePessoa(id ,nome,  cpf,  telefone,  endereco,  obs, email, idade, funcionario);
        // Imprimimos na tela a mensagem de retorno
        JOptionPane.showMessageDialog(null, retorno);
        //Chamamos nosso jframe e atribuimos a form
        listaFuncionarios form = new listaFuncionarios();
        //Aqui setamos para abrir no centro quando aberto
        form.setLocationRelativeTo(null);
        //Deixamos o jframe visivel
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastraFuncionarioActionPerformed

    private void jTextFieldFormTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormTelefoneActionPerformed

    private void jTextFieldFormEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormEmailActionPerformed

    private void jTextFieldFormEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormEnderecoActionPerformed

    private void jTextFieldFormIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormIdadeActionPerformed

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
            java.util.logging.Logger.getLogger(editaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editaPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCadastraFuncionario;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JRadioButton jRadioButtonCliente;
    private javax.swing.JRadioButton jRadioButtonFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldFormCpf;
    private javax.swing.JTextField jTextFieldFormEmail;
    private javax.swing.JTextField jTextFieldFormEndereco;
    private javax.swing.JTextField jTextFieldFormId;
    private javax.swing.JTextField jTextFieldFormIdade;
    private javax.swing.JTextField jTextFieldFormNome;
    private javax.swing.JTextField jTextFieldFormTelefone;
    // End of variables declaration//GEN-END:variables
}
