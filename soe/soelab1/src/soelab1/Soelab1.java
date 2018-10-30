/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soelab1;
import java.awt.*;
import java.awt.event.*; 
/**
 *
 * @author lab
 */
public class Soelab1 extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;  
    Button b1,b2;  
    Soelab1(){
        Label l1,l2;
        l1 = new Label("Username");
        l1.setBounds(50,25,150,20);
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);
        l2 = new Label("Password");
        l2.setBounds(50,75,150,20);
        tf2=new TextField(); 
        tf2.setEchoChar('*');
        tf2.setBounds(50,100,150,20);  
        b1=new Button("Login");  
        b1.setBounds(50,200,50,50);  
        b1.addActionListener(this);  
          
        add(l1);
        add(l2);
        add(tf1);add(tf2);add(b1);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        if(e.getSource()==b1){
            System.out.println(s1);
                        System.out.println(s2);

            if(s1.equals("xyz@gmail.com") && s2.equals("1234567890"))
            {
                Foundation f = new Foundation();
                this.setVisible(false);
            }
            else
            {
                tf3=new TextField();  
                tf3.setBounds(50,150,300,20);
                tf3.setEditable(false);
                tf3.setText("Wrong username or password. Try Again");
                add(tf3);
            }
        }    
    }  
    public static void main(String[] args) {
        new Soelab1();
    }
    
}
