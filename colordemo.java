import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class colordemo extends JFrame implements ActionListener{
JButton b1;
JButton b2;
JButton b3;

public colordemo(){

setTitle("choice color");
b1=new JButton("red");
b2=new JButton("green");
b3=new JButton("blue");
b1.setBounds(780,500,70,50);
b2.setBounds(880,500,70,50);
b3.setBounds(980,500,70,50);
setLayout(null);

add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400,400);
setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
   
 
      
   if( e.getSource() == b1)
   
   {
     getContentPane().setBackground(Color.red);
    
   }   
   if( e.getSource() == b2)
   
   {
     getContentPane().setBackground(Color.green);


   }
      
   if( e.getSource() == b3)
   
   {
     getContentPane().setBackground(Color.blue);
     

   }

}

public static void main(String args[]){
    colordemo o=new colordemo();

}



}