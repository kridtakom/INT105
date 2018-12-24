/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Kridtakom
 */
public class ButtonListener implements ActionListener {
   private JTextField text1;
   private JTextField[] text2;

    public ButtonListener(JTextField text1,JTextField[] text2) {
        this.text1=text1;
        this.text2=text2;
    }

    

   @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equalsIgnoreCase("tranfer")) {
            int money = Integer.parseInt(text1.getText());
            
            int[] pay = new int[8];
            pay[0]=money/1000;
            pay[1]=money%1000/500;
            pay[2]=money%1000%500/100;
            pay[3]=money%1000%500%100/50;
            pay[4]=money%1000%500%100%50/20;
            
            for (int i = 0; i < 5; i++) {
                text2[i].setText(""+pay[i]);
            }
            
       }
    }
   
   
}
