/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionListener;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kridtakom
 */
public class GUILIS {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JTextField text1;
        JTextField[] text2 = new JTextField[5];
        JLabel numOfMoney[] = new JLabel[5];
        JLabel currency[] = new JLabel[5];

        JButton button1 = new JButton("tranfer");
        text1 = new JTextField("ใส่จำนวนเงิน", 20);
        panel1.add(button1, BorderLayout.CENTER);
        panel1.add(text1, FlowLayout.LEFT);
        frame.add(panel1,BorderLayout.NORTH);

        panel2.setLayout(new GridLayout(6, 3));
        for (int i = 0; i < 5; i++) {
            text2[i] = new JTextField("", 20);
        }

        currency[0] = new JLabel("1000");
        currency[1] = new JLabel("500");
        currency[2] = new JLabel("100");
        currency[3] = new JLabel("50");
        currency[4] = new JLabel("20");

        numOfMoney[0] = new JLabel("ใบ");
        numOfMoney[1] = new JLabel("ใบ");
        numOfMoney[2] = new JLabel("ใบ");
        numOfMoney[3] = new JLabel("ใบ");
        numOfMoney[4] = new JLabel("ใบ");

        for (int i = 0; i < 5; i++) {
            panel2.add(currency[i]);
            panel2.add(text2[i]);
            panel2.add(numOfMoney[i]);
        }
        
        frame.add(panel2,BorderLayout.CENTER);
        
        ButtonListener bl = new ButtonListener (text1,text2);
        button1.addActionListener(bl);
        
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
