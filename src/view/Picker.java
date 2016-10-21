package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wendler
 */
class Picker {

    public void chamaCalendario(final JTextField caixaDeData) // main method
    {
        //create object of JTextField and declare it final
        final JTextField text = new JTextField(15);
        //create object of JLabel and set label
        JLabel label = new JLabel("Selecionar data:");
        //create object of JButton
        JButton b = new JButton("Calendario");
        //create object of JPanel
        JPanel p = new JPanel();
        p.add(label);
        p.add(text);
        p.add(b);
        //create object of JFrame and declare it final
        final JFrame f = new JFrame();
        f.getContentPane().add(p);
        f.pack();
        f.setSize(363, 130);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        JButton retorna = new JButton("Retornar");
        p.add(retorna);

        retorna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                caixaDeData.setText((String) text.getText());
            }
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //set text i.e. date
                text.setText(new DatePicker(f).setPickedDate());
                // System.out.println(text.getText());
            }
        });
    }

}
