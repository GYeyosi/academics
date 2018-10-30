/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author harshit
 */
public class myPanel extends JFrame{
    
    myPanel(JFrame f){
        
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("Name");
        JTextField t1 = new JTextField();
        
        l1.setBounds(50,50,80,30);
        t1.setBounds(150,50,80,30);
        
        
        
        p1.add(l1);
        p1.add(t1);
        add(p1);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}