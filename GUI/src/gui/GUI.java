/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kridtakom
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("Fuck");
       
       JPanel panel = new JPanel();
       
       JButton button1 = new JButton("click me");
       JButton button2 = new JButton("resrt");
       
       
       frame.add(panel);
       panel.add(button1);
       panel.add(button2);
       
       //panel.setLayout();
       
       frame.setSize(400, 400);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
