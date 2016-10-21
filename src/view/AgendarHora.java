/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

/**
 *
 * @author Wendler
 */
public class AgendarHora extends javax.swing.JFrame {
//    private final String horaEntra;
//    private final String horaSai;
//    private final String dataAgendada;
    
    public AgendarHora() {
    	
    	JComboBox comboBox = new JComboBox();
    	comboBox.setSelectedIndex(-1);
    	getContentPane().add(comboBox, BorderLayout.CENTER);
    	
    	JComboBox comboBox_1 = new JComboBox();
    	comboBox_1.setSelectedIndex(-1);
    	getContentPane().add(comboBox_1, BorderLayout.NORTH);
//        this.horaEntra = horaEntra;
//        this.horaSai = horaSai;
//        this.dataAgendada = dataAgendada;
//
//        initComponents();
//        jTextDataAgendarHoraPaciente.setText("Data agendada: "+this.dataAgendada);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jTextDataAgendarHoraPaciente = new javax.swing.JTextField();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextDataAgendarHoraPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextDataAgendarHoraPaciente.setText("jTextField3");
        
        JComboBox comboBox = new JComboBox();
        
        JLabel label = new JLabel();
        label.setText("Digite a hora");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        textField = new JTextField();
        textField.setText("jTextField3");
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(52, Short.MAX_VALUE)
        			.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(111)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextDataAgendarHoraPaciente, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addComponent(jTextDataAgendarHoraPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(37)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(233, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        setSize(0, 300);
        setLocationRelativeTo(null);


        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>



        new AgendarHora().setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }
    private static javax.swing.JTextField jTextDataAgendarHoraPaciente;
    private JTextField textField;
}
