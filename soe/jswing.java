import java.awt.Dimension;
import java.awt.Toolkit;

import java.swing.*;
import java.awt.events.*;

public class swi extends JFrame {

    JButton button;
    JTextField tf;
    JTextArea ta;
    int butonClicked;
    public static void main(String[] args) {
        // TODO code application logic here
    
    }

    public swi(){

        this.setSize(400,400);

            Toolkit tk = Toolkit.getDefaultToolkit();

        this.setTitle("MY First Frame");
        JPanel panel = new JPanel();
        JLabel newL = new JLabel("New label");
        newL.setText("nrereslnf");
        panel.add(newL);


        JButton button1 = new JButton("Send");
        panel.add(button1);

        ListenTO butto = new ListenTO();
        button1.addActionListener(butto);
       // button1.setBorderPainted(false);
        //button1.setContentAreaFilled(false);
        button1.setText("Naaasdj");



        JTextField tf1 = new JTextField("mytf",15);
        panel.add(tf1);
        JTextArea ta1 = new JTextArea(15,20);
        JScrollPane = new JScrollPane(ta1,"asdjkabdksaflsdfsdkfbalifewyhird",JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ta1.setLineWrap(true);
        panel.add(ta1);
        tf1.setColumns(20);

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class ListenTO implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button1){
                butonClicked++;
                ta1.append("button clicked"+butonClicked+"times \n");
            }
        }
    }
    
}