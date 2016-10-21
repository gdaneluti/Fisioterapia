/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframetest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Wendler
 */
public class LoginPaciente extends javax.swing.JFrame {

    /**
     * Creates new form LoginFuncionario
     */
    public LoginPaciente() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabelLoginCpfFuncionario = new javax.swing.JLabel();
        jTextFieldLoginCpfFuncionario = new javax.swing.JTextField();
        jToggleButtonLoginPacienteLogin = new javax.swing.JToggleButton();
        jToggleButtonLoginPacienteCancela = new javax.swing.JToggleButton();
        jLabelLoginPacienteNaoUsuario = new javax.swing.JLabel();
        jToggleButtonLoginPacienteCadatro = new javax.swing.JToggleButton();
        jLabelLoginPacienteBemVindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelLoginCpfFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLoginCpfFuncionario.setText("Digite o CPF");

        jTextFieldLoginCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginCpfFuncionarioActionPerformed(evt);
            }
        });

        jToggleButtonLoginPacienteLogin.setText("Login");
        jToggleButtonLoginPacienteLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLoginPacienteLoginActionPerformed(evt);
            }
        });

        jToggleButtonLoginPacienteCancela.setText("Cancela");
        jToggleButtonLoginPacienteCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLoginPacienteCancelaActionPerformed(evt);
            }
        });

        jLabelLoginPacienteNaoUsuario.setText("Não é usuário?");

        jToggleButtonLoginPacienteCadatro.setForeground(new java.awt.Color(0, 127, 255));
        jToggleButtonLoginPacienteCadatro.setText("Cadastre-se Aqui!");
        jToggleButtonLoginPacienteCadatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLoginPacienteCadatroActionPerformed(evt);
            }
        });

        jLabelLoginPacienteBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLoginPacienteBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginPacienteBemVindo.setText("Bem Vindo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelLoginPacienteNaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelLoginCpfFuncionario)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jToggleButtonLoginPacienteLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButtonLoginPacienteCancela))
                            .addComponent(jTextFieldLoginCpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(jLabelLoginPacienteBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jToggleButtonLoginPacienteCadatro)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelLoginPacienteBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabelLoginCpfFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLoginCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLoginPacienteNaoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonLoginPacienteCadatro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonLoginPacienteCancela)
                    .addComponent(jToggleButtonLoginPacienteLogin))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLoginCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginCpfFuncionarioActionPerformed

    }//GEN-LAST:event_jTextFieldLoginCpfFuncionarioActionPerformed

    private void jToggleButtonLoginPacienteLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLoginPacienteLoginActionPerformed
        
        if(jTextFieldLoginCpfFuncionario.getText().equals("123")) {
            Funcionario TelaFuncionario = new Funcionario();
            TelaFuncionario.setVisible(true);
            this.dispose();  }

        else{
        LoginInvalido loginInvalido = new LoginInvalido();
        loginInvalido.setVisible(true);
        loginInvalido.setLocationRelativeTo(null);
        loginInvalido.setDefaultCloseOperation(loginInvalido.DISPOSE_ON_CLOSE);;
        }
    }//GEN-LAST:event_jToggleButtonLoginPacienteLoginActionPerformed

    private void jToggleButtonLoginPacienteCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLoginPacienteCancelaActionPerformed
        Fisioterapia TelaFisioterapia = new Fisioterapia();
        TelaFisioterapia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonLoginPacienteCancelaActionPerformed

    private void jToggleButtonLoginPacienteCadatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLoginPacienteCadatroActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonLoginPacienteCadatroActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLoginCpfFuncionario;
    private javax.swing.JLabel jLabelLoginPacienteBemVindo;
    private javax.swing.JLabel jLabelLoginPacienteNaoUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldLoginCpfFuncionario;
    private javax.swing.JToggleButton jToggleButtonLoginPacienteCadatro;
    private javax.swing.JToggleButton jToggleButtonLoginPacienteCancela;
    private javax.swing.JToggleButton jToggleButtonLoginPacienteLogin;
    // End of variables declaration//GEN-END:variables
}