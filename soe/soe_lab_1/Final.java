/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.*;

class Db{
Connection conn;
Statement stm;
    Db(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/chk","root","root");
            stm = conn.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public int checkLogin(String name,String pass){
        try{ 
            String sql = "Select name,type from tb where name='"+name+"' and type='"+pass+"'";
            ResultSet rs = stm.executeQuery(sql);

            if(rs.next()){
                return 1;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
}


class Login{

    Login(){
    JFrame f = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p4 = new JPanel();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Login");
    Db d = new Db();
    
    p1.setLayout(null);
    p2.setLayout(null);
    p4.setLayout(null);
    p1.setBounds(0,0,400,400);
    p2.setBounds(0,0,400,400);
    p4.setBounds(0,0,400,400);
    
    l1.setText("Username");
    l2.setText("Password");
    l1.setBounds(50,50,80,20);
    l2.setBounds(50,100,80,20);
    
    t1.setText("");
    t2.setText("");
    t1.setBounds(150,50,80,20);
    t2.setBounds(150,100,80,20);
    
    b1.setBounds(200,150,80,30);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String user = t1.getText();
            String pass = t2.getText();
            
            int flag=d.checkLogin(user,pass);
            if(flag==1){
                f.setVisible(false);
                new myPanel(f);
                
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Credentials", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
    
    p1.add(l1);
    p1.add(l2);
    p1.add(t1);
    p1.add(t2);
    p2.add(b1);
    f.add(p1);
    f.add(p2);
    f.setSize(400,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}


public class Final {

    public static void main(String[] args) {
       new Login();
    }
    
}


