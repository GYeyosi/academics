/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soelab1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author lab
 */
public class Foundation extends Frame implements ActionListener {
    public static ArrayList<Data> datalist = new ArrayList<Data>();
    Label l1,l2,l3,l4,marks1,marks2,marks3;
    TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    Button b1,b2,b3;
    Foundation(){
        l1 = new Label("No. of team members");
        l1.setBounds(50,25,150,20);
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);
        
        l2 = new Label("Batch Year");
        l2.setBounds(50,75,150,20);
        tf2=new TextField();  
        tf2.setBounds(50,100,150,20);
        
        l3 = new Label("Performance Type");
        l3.setBounds(50,125,150,20);
        tf3=new TextField();  
        tf3.setBounds(50,150,150,20);
        
        l4 = new Label("Unique Id");
        l4.setBounds(50,175,150,20);
        tf4=new TextField();  
        tf4.setBounds(50,200,150,20);
        
        marks1 = new Label("Judge1 marks");
        marks1.setBounds(50,225,150,20);
        tf5=new TextField();  
        tf5.setBounds(50,250,150,20);
        
        marks2 = new Label("Judge2 marks");
        marks2.setBounds(50,275,150,20);
        tf6=new TextField();  
        tf6.setBounds(50,300,150,20);
        
        marks3 = new Label("Judge3 marks");
        marks3.setBounds(50,325,150,20);
        tf7=new TextField();  
        tf7.setBounds(50,350,150,20);
        
        b1=new Button("Submit");  
        b1.setBounds(50,375,50,50);  
        b1.addActionListener(this);
        
        b2=new Button("Display");  
        b2.setBounds(100,375,70,50);  
        b2.addActionListener(this);
        
        b3=new Button("Recent Entry");  
        b3.setBounds(150,375,100,50);  
        b3.addActionListener(this);
        
        add(l1);add(l2);add(l3);add(l4);add(marks1);add(marks2);add(marks3);
        add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);add(tf7);
        add(b1);add(b2);add(b3);
        setSize(700,700);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        int teamnum = Integer.parseInt(tf1.getText());
        int batchyear = Integer.parseInt(tf2.getText());
        String perftype = tf3.getText();
        int id = Integer.parseInt(tf4.getText());
        int marks1 = Integer.parseInt(tf5.getText());
        int marks2 = Integer.parseInt(tf6.getText());
        int marks3 = Integer.parseInt(tf7.getText());
        if(e.getSource() == b1)
        {
            Data temp = new Data(teamnum, batchyear, perftype, id, marks1, marks2, marks3);
            datalist.add(temp);
        }
        if(e.getSource() == b2)
        {
            for(int i = 0;i<datalist.size();i++)
            {
                System.out.println("Team: " + datalist.get(i).getTeamNum());
                System.out.println("Batch Year: " + datalist.get(i).getBatchYear());
                System.out.println("Performance Type: " + datalist.get(i).getPerf());
                System.out.println("ID: " + datalist.get(i).getId());
                System.out.println("Judge 1: " + datalist.get(i).getMarks1());
                System.out.println("Judge 2: " + datalist.get(i).getMarks2());
                System.out.println("Judge 3: " + datalist.get(i).getMarks3());
                System.out.println("-----------------");
            }
        }
        if(e.getSource() == b3)
        {
            System.out.println("Team: " + datalist.get(datalist.size()-1).getTeamNum());
            System.out.println("Batch Year: " + datalist.get(datalist.size()-1).getBatchYear());
            System.out.println("Performance Type: " + datalist.get(datalist.size()-1).getPerf());
            System.out.println("ID: " + datalist.get(datalist.size()-1).getId());
            System.out.println("Judge 1: " + datalist.get(datalist.size()-1).getMarks1());
            System.out.println("Judge 2: " + datalist.get(datalist.size()-1).getMarks2());
            System.out.println("Judge 3: " + datalist.get(datalist.size()-1).getMarks3());
        }
    }  
}
